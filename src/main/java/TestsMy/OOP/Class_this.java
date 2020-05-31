package TestsMy.OOP;

public class Class_this {

    public static void main(String[] args) {



        Human h1 = new Human();
        h1.setAge(18);
        h1.setName(" Сеня ");
        h1.getInfo();

        Human h2 = new Human();
        h2.setAge(42);
        h2.setName(" Олег ");
        h2.getInfo();

    }


}


class Human{
    String name;
    int age;

//   public void setName(String myName){
//        name = myName;

        public void setName(String name){
            this.name = name;
    }


//    public void setAge(int myAge){
//        age = myAge;
//    }

    public void setAge(int age){
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo(){
        System.out.println(name+","+age);
    }
}