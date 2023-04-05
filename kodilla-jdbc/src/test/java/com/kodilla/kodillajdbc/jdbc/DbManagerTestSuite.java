package com.kodilla.kodillajdbc.jdbc;

import com.kodilla.kodillajdbc.com.kodilla.jdbc.DbManager;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }


    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }
        @Test
        void testSelectUsersAndPosts() throws SQLException {
        //GIVEN
            DbManager dbManager = DbManager.getInstance();

            //When



            //THEN
            String sqlQuery = """
                                                    SELECT FIRSTNAME, LASTNAME
                                                    FROM USERS
                                                    JOIN POSTS P on USERS.ID = P.USER_ID
                                                    GROUP BY USER_ID
                                                    HAVING COUNT(*) >= 2""";
            Statement statement = dbManager.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(sqlQuery);


            //Then

            int counter = 0;
            while (rs.next()) {
                System.out.println(
                        rs.getString("FIRSTNAME") + ", " +
                        rs.getString("LASTNAME"));
                counter++;
            }
            rs.close();
            statement.close();
            assertEquals(2,counter);



        }

}