import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestReport {

    private List<Department> departmentList = new ArrayList<Department>();
    private List<Employee> employeeList = new ArrayList<Employee>();

    @Before
    public void setup() {
        //Data Creation

        Department dept = new Department();
        dept.setDepartmentId(1);
        //Additional Props
        departmentList.add(dept);

        for (int i=0; i<10; i++) {
            Employee employee = new Employee();
            employee.setEmployeeId(120 + i);
            employee.setName(RandomStringUtils.randomAlphabetic(5) + " " + RandomStringUtils.randomAlphabetic(5));
            employee.setDepartmentId(1);
            //Additional Props
            employeeList.add(employee);
        }

        /*Employee employee = new Employee();
        employee.setEmployeeId(120);
        employee.setName("Anwesa Banerjee");
        employee.setDepartmentId(1);
        //Additional Props
        employeeList.add(employee);
        Employee employee1 = new Employee();
        employee1.setEmployeeId(121);
        employee1.setDepartmentId(1);
        //Additional Props
        employeeList.add(employee1);*/


        Department dept2 = new Department();
        dept2.setDepartmentId(2);
        //Additional properties
        departmentList.add(dept2);
        //Employees

        for (int i=0; i<10; i++) {
            Employee employee = new Employee();
            employee.setEmployeeId(130 + i);
            employee.setName(RandomStringUtils.randomAlphabetic(5) + " " + RandomStringUtils.randomAlphabetic(5));
            employee.setDepartmentId(2);
            //Additional Props
            employeeList.add(employee);
        }
        /*Employee employee21 = new Employee();
        employee21.setEmployeeId(131);
        employee21.setDepartmentId(2);
        //Additional Props
        employeeList.add(employee21);*/

        for (Department depart: departmentList) { //Dept
            System.out.println(depart.getDepartmentId());
        }

        for (Employee emp : employeeList) {
            System.out.println(emp.getEmployeeId() + ", " + emp.getDepartmentId());
        }
    }

    @Test
    public void testEmployeeRetrievalBasedOnDeptId() {
        //Data change
        List<Integer> employeeNo = new ArrayList<Integer>();
        employeeNo.add(10);
        employeeNo.add(10);
        int departCount = 0;
        for (Department dept: departmentList) { //Dept
            System.out.println("For Department " + dept.getDepartmentId() + ":");
            int count = 0;
            for (Employee emp : employeeList) {
                if (emp.getDepartmentId() == dept.getDepartmentId()) {
                    System.out.println(emp.getEmployeeId() + ", " + emp.getName());
                    count ++;
                }
            }
            Assert.assertTrue(count==employeeNo.get(departCount));
            departCount++;
            System.out.println();
        }


    }
}
