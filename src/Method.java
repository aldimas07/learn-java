public class Method {
    public static void main(String[] args) {
        penjumlahan();
        System.out.println(addition(1, 3));
        namaNama("Budi", "Dua");
        System.out.println(operations(1, 3, "+"));
        System.out.println(operations(2, 2, "-"));
        System.out.println(operations(3, 3, "*"));
        System.out.println(operations(8, 2, "/"));
        System.out.println(operations(1, 3, "x"));

        sayCongrats("budi", 77, 78, 99, 66, 77, 88);
    }

    //method
    static void penjumlahan() {
        int a, b, n;
        a = 1;
        b = 2;
        n = a + b;
        System.out.println(n);
    }

    //method parameter
    static void namaNama(String firstName, String lastNeme) {
        System.out.println("Hello" + firstName + lastNeme);
    }

    //method return value
    static int addition(int a, int b) {
        return a + b;
    }

    // method return value with switch condition
    static int operations(int val1, int val2, String operation) {
        return switch (operation) {
            case "+" -> val1 + val2;
            case "-" -> val1 - val2;
            case "*" -> val1 * val2;
            case "/" -> val1 / val2;
            default -> 0;
        };
    }

    //method return value with array
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalvalues = total / values.length;
        if (finalvalues >= 75) {
            System.out.println("Congrats!");
        } else {
            System.out.println(finalvalues + " No Congrats!");
        }
    }
}
