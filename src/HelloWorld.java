public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Mark");

        int myFirstNumber = (8+2) + (2 * 4);
        int mySecondNumber = 10;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber * myThirdNumber;
        int myLastNumber = 1000 - myTotal;

        System.out.println(myFirstNumber);
        System.out.println(myTotal);
        System.out.println(myLastNumber);
    }
}
