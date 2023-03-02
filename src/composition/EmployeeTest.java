package composition;
// composition demonstration

public class EmployeeTest {

    public static void main(String[] args) {

        Date hire = new Date(12,24,2021);
        Date birth = new Date(10, 10, 1995);
        Employee employee = new Employee("John", "Doe", birth, hire);

        System.out.println(employee);
    }
}
