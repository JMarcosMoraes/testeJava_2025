package com.kata.app.exercicioUm;

import java.util.Objects;


/*
Provide an example scenario where overriding the equals() method is necessary in Java.
Explain the key considerations when implementing this method, such as ensuring it
aligns with the hashCode() method.
Include code examples if possible.

Substituir o método equals() em Java é necessário quando você precisa
comparar objetos com base na igualdade lógica em vez da
igualdade de referência (==).
Um cenário comum é ao trabalhar com objetos de domínio em coleções
como HashSet ou HashMap.
*/

public class Employeer {
    private final int id;
    private final String name;

    public Employeer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employeer employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}

