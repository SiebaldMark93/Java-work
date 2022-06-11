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
    }
}
