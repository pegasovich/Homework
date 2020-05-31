package TestsMy.OOP;

public class Static {

    public static void main(String[] args) {
        Humanss e1 = new Humanss("Semen", 42);
        Humanss e2 = new Humanss("Nazar", 8);

        e1.printNumber();
        e2.printNumber();

        Humanss e3 = new Humanss("Bogdan",3);

        e1.printNumber();
        e2.printNumber();
        e3.printNumber();

        Humanss.description ="Nice";
        e1.getAllFields();
        e2.getAllFields();

        Humanss.description="Bad";
        e1.getAllFields();
        e2.getAllFields();
    }
}


class Humanss{

    private String name;
    private int age;
    public static String description; //одна переменная для всех объектов
    private static int countPeople; //одна переменная для всех объектов



    public Humanss(String name, int age){
        System.out.println(" привет из третьего конструктора");
        this.name = name;
        this.age = age;
        countPeople++;

    }


    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void getAllFields(){
    System.out.println(name+","+age+ ","+ description);
    }

    public void printNumber(){
            System.out.println("Number of people is " + countPeople);
        }


}

