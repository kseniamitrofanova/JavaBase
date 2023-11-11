public class BaseJava {
    public static void main(String[] args) {
        byte aMinByte=-128;
        System.out.println("Минимальное значение типа byte: " + aMinByte);
        byte aMaxByte=127;
        System.out.println("Максимальное значение типа byte: " + aMaxByte);
        byte sumByte= (byte) (aMinByte+aMaxByte);
        System.out.println(aMinByte + " + " + aMaxByte + " = " +sumByte);
        byte subByte= (byte) (aMinByte-aMaxByte);
        System.out.println(aMinByte + " - " + aMaxByte + " = " +subByte +"\n");

        short aMinShort=-32768;
        System.out.println("Минимальное значение типа short: " + aMinShort);
        short aMaxShort=32767;
        System.out.println("Максимальное значение типа short: " + aMaxShort);
        short multiShort= (short) (aMinShort*aMaxShort);
        System.out.println(aMinByte + " * " + aMaxByte + " = " +multiShort);
        short divShort=(short) (aMinShort/aMaxShort);;
        System.out.println(aMinByte + " / " + aMaxByte + " = " +divShort);

        System.out.println("Пример переполнения: " + (short)(-aMinShort + aMaxShort));

        int aInt=6;
        int bIny=36;
        int res=aInt%bIny;
        System.out.println(aInt + " % " + bIny + " = " +subByte);

        double aDouble = 1.23;
        double bDouble = 4.54;
        boolean resMoreDouble;
        String resLessDouble;
        if (aDouble>bDouble)
        {
            resMoreDouble=true;
            resLessDouble="false";
        }
        else
        {
            resMoreDouble=false;
            resLessDouble="true";
        }
        System.out.println(aDouble + " > " + bDouble + " ? " +resMoreDouble);
        System.out.println(aDouble + " < " + bDouble + " ? " +resLessDouble+"\n");

        float floatA = 100.5f;
        float floatB = 9.5f;

        System.out.println("Операции (int):");
        System.out.println(aInt + " + " + bIny + " = " +(aInt+bIny));
        System.out.println(aInt + " - " + bIny + " = " +(aInt-bIny));
        System.out.println(aInt + " * " + bIny + " = " +(aInt*bIny));
        System.out.println(aInt + " / " + bIny + " = " +(aInt/bIny));
        System.out.println(aInt + " % " + bIny + " = " +(aInt%bIny)+"\n");

        System.out.println("Операции (float):");
        System.out.println(floatA + " + " + floatB + " = " +(floatA+floatB));
        System.out.println(floatA + " - " + floatB + " = " +(floatA-floatB));
        System.out.println(floatA + " * " + floatB + " = " +(floatA*floatB));
        System.out.println(floatA + " / " + floatB + " = " +(floatA/floatB));
        System.out.println(floatA + " % " + floatB + " = " +(floatA%floatB)+"\n");

        System.out.println("Операции (double):");
        System.out.println(aDouble + " + " + bDouble + " = " +(aDouble+bDouble));
        System.out.println(aDouble + " - " + bDouble + " = " +(aDouble-bDouble));
        System.out.println(aDouble + " * " + bDouble + " = " +(aDouble*bDouble));
        System.out.println(aDouble + " / " + bDouble + " = " +(aDouble/bDouble));
        System.out.println(aDouble + " % " + bDouble + " = " +(aDouble%bDouble)+"\n");
    }
}
