public class FloatAndDouble {
    public static void main(String[] args) {
        //Single and Double Precision
        //Precision refers to the format and amount of space occupied by the type. Single precision occupies 32 bits(width of 32) and Double precision occupies 64 bits( width of 64).

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);



        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f/ 3f;
        double myDoubleValue = 5d/ 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        //In general float and double are great for general floating point operations.  But both are not great to use where precise calculations are required - this is due to limitations with how floating point numbers are stored, and not a Java problem as such.

        //Java has a class called BigDecimal tht overcomes this.  We will take more about that later in the course.  For now just keep in the back of your mind that when precise calculations are necessary, such as when performing currency calculations, floating-point types should not be used.

        //But for genera calculations float and double are fine.

    }
}
