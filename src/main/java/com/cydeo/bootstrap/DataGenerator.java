package com.cydeo.bootstrap;

import com.cydeo.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    private static List<Employee> employeeList = new ArrayList<>();

    public static void saveEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public static List<Employee> readAllEmployees() {
        return employeeList;
    }
    public static List<String> getAllStates() {
        return Arrays.asList("Alaska", "Alabama", "Arkansas", "Arizona", "California", "Colorado", "Connecticut", "Delaware", "Florida",
                "Georgia", "Hawaii", "Iowa", "Idaho", "Illinois", "Indiana", "Kansas", "Kentucky", "Louisiana",
                "Massachusetts", "Maryland", "Maine", "Michigan", "Minnesota", "Missouri", "Mississippi", "Montana", "North Carolina", "North Dakota", "Nebraska",
                "New Hampshire", "New Jersey", "New Mexico", "Nevada", "New York", "Ohio", "Oklahoma", "Oregon", "Pennsylvania","Rhode Island", "South Carolina",
                "South Dakota", "Tennessee", "Texas", "Utah", "Virginia","Vermont", "Washington", "Wisconsin", "West Virginia", "Wyoming");

    }
}
