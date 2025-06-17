package com.kata.app.exercicioUm;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Employeer> employeeSet = new HashSet<>();
        employeeSet.add(new Employeer(1, "Alice"));
        employeeSet.add(new Employeer(2, "Bob"));
        employeeSet.add(new Employeer(1, "Alice")); // Duplicate ID - should not be added

        System.out.println("Employee list: " + employeeSet);
    }
}
