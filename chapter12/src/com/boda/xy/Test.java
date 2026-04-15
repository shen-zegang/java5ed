public class Test {
    public static void testMethod1() {
        try {
            testMethod2();
        }catch(ArithmeticException e) {
            System.out.print("Dock ");
        }
    }
    public static void testMethod2() throws ArithmeticException{
        try {
            testMethod3();
        }catch(ArithmeticException e) {
            System.out.print("Dickory ");
        }
    }
    public static void testMethod3() throws ArithmeticException{
        System.out.print("Hickory ");
        throw new ArithmeticException();
    }

    public static void main(String[] args) {
        testMethod1();
    }
}
