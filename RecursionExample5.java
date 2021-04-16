public class RecursionExample5 {
    static int n = 2;
    static int factorial(int a) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(a-1));
    }    public static void main(String[] args) {
        System.out.println(" của 5 là: " + factorial(5));
    }
}

