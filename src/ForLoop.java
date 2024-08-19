public class ForLoop {
    public static void main(String[] args) {
        var counter = 1;

        // for loop tanpa initial statement, alias tidak membutuhkan variabel index
        for(; counter <= 10 ; counter++) {
            System.out.println("Perulangan ke - "+counter);
        }
        System.out.println(counter);

        // for loop tanpa initial statement, kondisi, dan post statement
        for (;;) {
            System.out.println("Perulangan ke - "+counter);
        }
    }

}
