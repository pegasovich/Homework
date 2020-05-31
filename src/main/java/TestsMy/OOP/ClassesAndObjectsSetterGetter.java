package TestsMy.OOP;

 public class ClassesAndObjectsSetterGetter {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName(" Семен ");
        for (int i = 0; i <20 ; i++) {
            int a = (int) (Math.random() * 41 -20);
            System.out.println("Random is = " + a);
            person1.setAge(a);
            System.out.println(" Имя - "+ person1.getName()+ " Возраст - "+ person1.getAge());
        }

//        System.out.println(" Имя - "+ person1.getName()+ " Возраст - "+ person1.getAge());
//        person1.speak();

    }
}
class Person{
        private String name;
        private int age;

        public void setName(String userName){
            if (userName.isEmpty())
                System.out.println(" Вы ввели пустое имя");
             else  name = userName;
        }

    public String getName() {
        return name;
    }

    public void setAge(int userAge){
            if (userAge < 0) System.out.println(" Возраст может быть только положительным");
            else age =userAge;
    }

    public int getAge() {
        return age;
    }

    int Pensia(){
            int years = 65-age;
            return years;
        }

        void speak(){ System.out.println("Меня зовут "+ name+ ", мне "+age+" лет"); }
}


