package ch.abbts.nds.swe.swdt.starter.logic;

public class Employee {
    private Integer age;
    private String name;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public boolean isOfAge(Integer age) {
        return this.age > age;
    }
}

