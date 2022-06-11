public class ByteShortIntLong {
    public static void main(String[] args) {

        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxInValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxInValue);
        //bottom output will result in stack overflow
        System.out.println("Busted MAX value = " + (myMaxInValue + 1));
        //stack underflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;
        int myMinIntTest = -2147483648;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        
        byte myMinByteTest = -128;
        byte myMaxByteTest = 127;

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        short myMinShortTest = -32768;
        short myMaxShortTest = 32767;
        
        //A Byte occupies 8 bits, width of 8.
        //A Short occupies 16 bits, width of 16.
        //An int occupies 32 bits, width of 32.
        //A long has a width of 64.
        
        long myLongValue = 100;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long myMinLongTest = -9223372036854775808L;
        long myMaxLongTest = 9223372036854775807L;

        long bigLongLiteralValue = 2147483647;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        
        
        
    }
}
