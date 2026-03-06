class GenerateID {
    static int nextID = 245786;
    public static int generateID() {

        return nextID++;
    }
        public static void main(String[] args) {

        for (int i = 1; i<=30; i++)

            System.out.println(i + "." + "Generate ID: " + generateID());

            }
        }


 //another way using while loop
//class GenerateID {
//static int nextID = 245786;
//public static int generateID() {
//return nextID++;
// }
//public static void main(String[] args) {
//int i = 1;
//while (i<=30){
//System.out.println(i + "." + "Generate ID: " + generateID());
//i++;
//}
//}
//}

