class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        try {

            int result = 10 / 0;

            System.out.println(numbers[3]);

            String str = null;
            str.length();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("An exception occurred: " + e);
        }
    }
}
