class Cat {
    String name;
    int age;

public Cat () {
       this.name = "Unknown";
       this.age = 0;

    }
} public class Cat_Main {
    public static void main(String[] args) {
        Cat B1 = new Cat ();
        System.out.println( "Name is: "  + B1.name + "\nAge is: " + B1.age);
    }

}
