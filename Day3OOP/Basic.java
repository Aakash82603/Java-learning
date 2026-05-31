package Day3OOP;

 class Person{
    int age;
    String name;
    String city;
    Person(int age, String name, String city){
        this.age=age;
        this.name=name;
        this.city=city;
    }
    void display(){
        System.out.println("The name of the person is "+name);
        System.out.println("The age of the person is "+age);
        System.out.println("The city of the person is "+city);
    }
}
public class Basic {
    public static void main(String[] args) {
        Person p1 = new Person(20, "Aakash", "Kathmandu");
        p1.display();
    }
}


