public class Som {

    public static int sum(int n)
    {
       if(n == 1)
           return 1;
        else
       return sum(n - 1) + n;
    }

    public static void sumFor(int n)
    {
        StringBuilder stringToPrint = new StringBuilder();
        int sum = 0;
        for(int i = 0 ; i <= n; i++)
        {
            sum += i;
            if(i == n)
                stringToPrint.append(i).append("=");
            else
                stringToPrint.append(i).append("+");
        }
        System.out.println(stringToPrint + "" + sum);
    }
}
