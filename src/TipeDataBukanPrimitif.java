public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong = iniObject.longValue();
        float iniFloat = iniObject.floatValue();
        String iniString = iniObject.toString();

        System.out.println("iniShort "+iniShort);
        System.out.println("iniLong "+iniLong);
        System.out.println("iniFloat "+iniFloat);
        System.out.println("iniString "+iniString);

    }
}
