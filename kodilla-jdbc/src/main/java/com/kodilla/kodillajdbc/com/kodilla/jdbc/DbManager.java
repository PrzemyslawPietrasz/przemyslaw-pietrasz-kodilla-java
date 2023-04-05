package com.kodilla.kodillajdbc.com.kodilla.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DbManager {

        INSTANCE;                                                  // [1]

        private Connection conn;                                   // [2]

        DbManager() {                                              // [3]
            Properties connectionProps = new Properties();          // [4]
            connectionProps.put("user", "root");            // [5]
            connectionProps.put("password", "Anubis1234");     // [6]
            try {
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/kodilla_course" +
                                "?serverTimezone=Europe/Warsaw" +
                                "&useSSL=False&allowPublicKeyRetrieval=true",                                   // [10]
                        connectionProps);                                 // [11]
            } catch (SQLException e) {                              // [12]
                throw new ExceptionInInitializerError(e);            // [13]
            }                                                       // [14]
        }                                                          // [15]

        public static DbManager getInstance() {                    // [16]
            return INSTANCE;                                        // [17]
        }                                                          // [18]

        public Connection getConnection() {                        // [19]
            return conn;                                            // [20]
        }                                                          // [21]
    }
