public class BinaryRep {

    public static int countBinary(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            return countBinary(n/2) + countBinary(n%2);
        }
    }
}
