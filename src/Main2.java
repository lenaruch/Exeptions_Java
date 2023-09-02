public class Main2 {
    public static void main(String[] args) {
        foo1();
    }
    public static void foo1(){
        try {
            int[] intArray = {98, 67, 22, 54, 8, 67, 53, 44, 22};
            int x = 0;
            double catchedResult = intArray[8] / x;
            System.out.println("catchedResult = " + catchedResult);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
