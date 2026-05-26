class Factorial {

    int factorialCalc(int n) {

        // base condition
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorialCalc(n - 1);
    }

    public static void main(String[] args) {

        Factorial f = new Factorial();

        int ans = f.factorialCalc(7);

        System.out.println("Factorial = " + ans);
    }
}