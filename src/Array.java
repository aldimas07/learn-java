public class Array {
    public static void main(String[] args) {
        // Cara declare array pertama
        String[] arrayString;
        arrayString = new String[4];

        // Cara declare array kedua
        String[] arrayString2 = new String[4];
        arrayString2[0] = "Aku";
        arrayString2[1] = "Adalah";
        arrayString2[2] = "Gorlock";
        arrayString2[3] = "The Destroyer";
        for (int i = 0; i < arrayString2.length; i++) {
            System.out.println(arrayString2[i]);
        }

        //cara declare array ketiga
        int[] intArray = new int[]{
                1,2,3,4
        };
        System.out.println(intArray[0]);

        String[] kumpulanNama = new String[]{
          "Indeks pertama", "Indeks kedua", "Indeks ketiga"
        };

        long[] longArray = new long[]{
          1L, 2L, 3L, 4L
        };
        System.out.println("long Array:");
        System.out.println(longArray[0]);

        //Operasi pada array
        System.out.println("Operasi pada array");

        String[] namaNama = new String[]{
          "Budi", "Adi", "Samid", "Slamet"
        };

        namaNama[0] = "Adi";
        System.out.println(namaNama[0] = "ubah lagi");
        System.out.println(namaNama.length);

        System.out.println("Array 2 Dimensi");
        String[][] namaorang = {
                {"Bapak", "Programmer", "Zaman Now"},
                {"Aldimas", "Jaya"},
                {"Namaku", "Tak", "Penting"}
        };
        System.out.println(namaorang.length);
        System.out.println(namaorang[2][1]);
    }
}
