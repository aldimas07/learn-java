public class BreakandContinue {
    public static void main(String[] args) {

        //break statement
        var counter = 1;
        while (true) {
            System.out.println("counter = " + counter);
            counter++;
            if (counter == 20) {
                break;
            }
        }

        // continue statement
        // digunakan menskip / melewati sebuah kondisi dalam sebuah perulangan
        for (var i = 0; i <= 50;i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println("Perulangan for iterasi ke = " +i);
        }
    }
    //break untuk memberhentikan sebuah perulangan ketika kondisi terpenuhi
    //continue untuk melewati perulangan ketika kondisinya terpenuhi dan melanjutkan ke perulangan selanjutnya
}
