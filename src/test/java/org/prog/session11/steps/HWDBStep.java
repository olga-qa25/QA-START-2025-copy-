package org.prog.session11.steps;

import io.cucumber.java.en.Given;
import org.prog.session9.PersonDto;
import org.prog.session9.ResultsDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class HWDBStep {
    public static Connection connection;

    @Given("write data from API to DB")
    public void writeToDBFromAPI() throws SQLException, ClassNotFoundException {

        List<PersonDto> personDtos = HWRestStep.response.getResults();
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO Persons (Gender, Title, FirstName, LastName, Number, Street, City, Nat) VALUES (?,?,?,?,?,?,?,?)"
        );

        personDtos.forEach(dto -> executeStatement(dto, preparedStatement));


    }

    private void executeStatement(PersonDto dto, PreparedStatement preparedStatement) {
        try {
            preparedStatement.setString(1, dto.getGender());
            preparedStatement.setString(2, dto.getName().getTitle());
            preparedStatement.setString(3, dto.getName().getFirst());
            preparedStatement.setString(4, dto.getName().getLast());
            preparedStatement.setString(5, dto.getLocation().getStreet().getNumber());
            preparedStatement.setString(6, dto.getLocation().getStreet().getName());
            preparedStatement.setString(7, dto.getLocation().getCity());
            preparedStatement.setString(8, dto.getNat());
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("!!!!!!!!!!!!!!!!!Error inserting person: " + dto);
        }
    }

}
