public class ForEach {
    public static void main(String[] args) {
        // for loop untuk mengambil data array
        String[] arr = {"satu", "dua", "tiga", "empat", "lima"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //For each statement untuk mengambil data array
        for (String arrValue : arr) {
            System.out.println(arrValue);
        }
    }
}
