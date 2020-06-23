package Lists;

import java.util.List;

public class Vector {
    public static void main(String[] args){
        List<Employee> employeeList = new java.util.Vector<>();

        employeeList.add(new Employee("Jane","Doe",123));
        employeeList.add(new Employee("John","Doe",456));
        employeeList.add(new Employee("Mary","Doe",789));

        employeeList.forEach(employee -> System.out.println(employee));   // lambda function

    }
}
