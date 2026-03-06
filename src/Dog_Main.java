class Dog {
    String name;
    String color;
    int price;

    public Dog(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
}
public class Dog_Main {
    public static void main(String[] args) {
        Dog a2 = new Dog ("Husky", "White", 900);
        System.out.println("Dog name is: " + " " + a2.name + "\nDog color is: " + " " + a2.color + "\nDog price is: " + " " + a2.price );
    }
}

