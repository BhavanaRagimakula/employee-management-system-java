import java.sql.*;

public class EmployeeDAO {

    public void addEmployee(Employee emp) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO employee VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, emp.id);
            ps.setString(2, emp.name);
            ps.setString(3, emp.department);

            ps.executeUpdate();

            System.out.println("Employee Added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
