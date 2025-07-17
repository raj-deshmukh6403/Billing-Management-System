package ConnectionPackage;

import java.sql.*;

public class ConnectionProvider {
    public static Connection getcon() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_billing?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
//                    "jdbc:mysql://localhost:3306/db_billing?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                    "root",
                    "Harshraj#4256"
            );
            return con;
        } catch (Exception e) {
            System.out.println("Database connection failed: " + e.getMessage());
            e.printStackTrace(); // Print error to console
            return null;
        }
    }
}
