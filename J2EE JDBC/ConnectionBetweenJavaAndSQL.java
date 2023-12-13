import java.sql.*;

class ConnectionBetweenJavaAndSQL {
        public static void main(String[] args) {
                try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_practice", "root",
                                        "rootvig26");
                        System.out.println("Connection established! " + con);
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
        }
}