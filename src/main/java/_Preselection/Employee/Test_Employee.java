package _Preselection.Employee;

class Test_Employee {

    public static void main(String[] args) {
        Employee first = new Employee("Oleg", "Pegasovich");
        first.print();

        Employee second = new Employee(007L);
        second.print();
    }
}