public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 100;

        //basic do while loop usage
        do {
            System.out.println("Perulangan do while ke = "+counter);
            counter++;
        } while (counter < 100);

        // basic while loop usage
        while (counter < 120) {
            System.out.println("Perulangan while ke = "+counter);
            counter++;
        }

        // the different about do while and while loop is:
        // do while executing the statement first and then move to while loop condition
        // if while condition false, the looping will be stopped
    }
}
