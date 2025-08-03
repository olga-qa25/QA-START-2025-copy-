package org.prog.session10;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.prog.session9.PersonDto;
import org.prog.session9.ResultsDto;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class MySqlTests {

    @Test
    public void testWriteToDBFromApi() throws SQLException, ClassNotFoundException {
        ResultsDto resultsDto = getUsers(5);
        List<PersonDto> personsDtos = resultsDto.getResults();

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db", "root", "password");
            Statement statement = connection.createStatement();

            for (PersonDto personDto : personsDtos) {
                try {
                    String sql = "INSERT INTO Persons " +
                            "(Gender, Title, FirstName, LastName, Number, Street, City, Nat) " +
                            "VALUES (" +
                            "'" + personDto.getGender() + "', " +
                            "'" + personDto.getName().getTitle() + "', " +
                            "'" + personDto.getName().getFirst() + "', " +
                            "'" + personDto.getName().getLast() + "', " +
                            "'" + personDto.getLocation().getStreet().getNumber() + "', " +
                            "'" + personDto.getLocation().getStreet().getName() + "', " +
                            "'" + personDto.getLocation().getCity() + "', " +
                            "'" + personDto.getNat() + "'" +
                            ")";

                    statement.execute(sql);
                } catch (Exception e) {
                    System.out.println("Не удалось записать: " +
                            personDto.getName().getFirst() + " " +
                            personDto.getName().getLast());
                }
            }


            ResultSet resultSet = statement.executeQuery(
                    "SELECT FirstName, LastName, City, Street, Number FROM Persons"
            );
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("FirstName") + " " +
                                resultSet.getString("LastName") + ", " +
                                resultSet.getString("City") + ", " +
                                resultSet.getString("Street") + " " +
                                resultSet.getString("Number")
                );
            }

        } finally {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    private ResultsDto getUsers(int amount) {
        Response response = RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("api/")
                .queryParam("inc", "gender,name,location,nat")
                .queryParam("results", amount)
                .queryParam("noinfo")
                .get();
//        response.prettyPrint();
        return response.as(ResultsDto.class);
    }
}
