import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class VulnerableApp {
    
    // Hardcoded password vulnerability
    private static final String DB_PASSWORD = "hardcodedPassword123";

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter your username:");
	    String username = scanner.nextLine();

	    // SQL Injection vulnerability
	    String query = "SELECT * FROM users WHERE username = ?";
	    
	    try {
	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", DB_PASSWORD);
	        PreparedStatement pstmt = conn.prepareStatement(query);
	        pstmt.setString(1, username);
	        ResultSet rs = pstmt.executeQuery();

	        if (rs.next()) {
	            System.out.println("Welcome, " + rs.getString("username"));
	        } else {
	            System.out.println("Invalid user.");
	        }

	        conn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

    }
}

