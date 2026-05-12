public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee(
            1,
            "Bhavana",
            "IT"
        );

        EmployeeDAO dao = new EmployeeDAO();

        dao.addEmployee(emp);
    }
}
