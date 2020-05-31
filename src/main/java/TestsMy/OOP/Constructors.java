package TestsMy.OOP;

public class Constructors {

    public static void main(String[] args) {
        Humans e = new Humans("Semen", 42);
    }
    }


    class Humans{

        private String name;
        private int age;

        public Humans(){
            this.name =" имя по умолчанию";
            this.age = 0;
            System.out.println(" привет из первого констуктора");
            System.out.println(name+", "+age);
        }

        public Humans(String name){
            System.out.println(" привет из второго конструктора");
            this.name = name;
        }

        public Humans(String name, int age){
            System.out.println(" привет из третьего конструктора");
            this.name = name;
            this.age = age;

        }


    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

}

