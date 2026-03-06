class Initializer {
    static int initialValue;
    static {
        initialValue=1000;
    }
    public static void main(String[] args) {

        System.out.println(Initializer.initialValue);
        Initializer i = new Initializer ();
        System.out.println(Initializer.initialValue);

    }
}
