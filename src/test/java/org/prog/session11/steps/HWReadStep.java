package org.prog.session11.steps;

import io.cucumber.java.en.Given;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HWReadStep {
    public static Connection connection;
    @Given("read this info from DB")
    public void readFromDB()throws SQLException, ClassNotFoundException {
        Statement statement = HWDBStep.connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Persons");
        while (resultSet.next()) {
            System.out.print(resultSet.getString("FirstName") + " ");
            System.out.println(resultSet.getString("LastName")+ " ");
            System.out.print(resultSet.getString("City")+ " ");
            System.out.print(resultSet.getString("Street")+ " ");
            System.out.print(resultSet.getString("Number"));
        }
    }
}
