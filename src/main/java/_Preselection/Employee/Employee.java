package _Preselection.Employee;

import java.util.Random;

class Employee {

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = new Random().nextLong();
    }

    public Employee(Long id) {
        this.id = new Random().nextLong();
    }

    private String name = "";
    private String surname = "";
    private Long id = 0L;

    public void print() {
        System.out.println(name + " " + surname + " " + id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(Long id) {
        this.id = id;
    }
}