public class Faculteit {

    public static long recursiveFaculteit(long n) {
        long result;

        if (n == 1)
            return 1;

        result = recursiveFaculteit(n - 1) * n;
        return result;
    }

    public static void nonRecursiveFaculteit(long n) {
        long number = n;
        long fac = number;

        while (number > 2) {
            number -= 1;
            fac *= number;
        }

        System.out.print("faculteit van getal" + n + " = " + fac);
    }
}
