public class OperasiMatematika {
    public static void main(String[] args) {
        //Augmented assignment
        int numb = 100;
        numb += 10;
        System.out.println(numb); //110
        numb -= 20;
        System.out.println(numb); //90
        numb *= 4;
        System.out.println(numb); //360
        numb /= 2;
        System.out.println(numb); //180
        numb %= 7;
        System.out.println(numb); //5

        //Unary operator
        System.out.println("Unary operator");
        int unaryopnumb = 100;
        unaryopnumb++;
        System.out.println(unaryopnumb); //101
        unaryopnumb--;
        System.out.println(unaryopnumb); //100
    }
}
