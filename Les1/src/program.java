public class program {

    public static int amount = 100;

    public static void main(String[] args) {
        System.out.println("fragment 1: " + Fragment1(amount));
        System.out.println("fragment 2: " + Fragment2(amount));
        System.out.println("fragment 3: " + Fragment3(amount));
        System.out.println("fragment 4: " + Fragment4(amount));
        System.out.println("fragment 5: " + Fragment5(amount));
        System.out.println("fragment 6: " + Fragment6(amount));
        //System.out.println("fragment 7: " + Fragment7(amount));
        System.out.println("fragment 8: " + Fragment8(amount));
    }

    private static int Fragment1(int input){
        int sum = 0;
        for( int i = 0; i < input; i++)
            sum++;
        return sum;
    }

    private static int Fragment2(int input){
        int sum = 0;
        for( int i = 0; i < input ; i += 2)
            sum++;
        return sum;
    }

    private static int Fragment3(int input){
        int sum = 0;
        for( int i = 0; i< input; i++)
            for (int j = 0; j < input; j++)
                sum++;
        return sum;
    }

    private static int Fragment4(int input){
        int sum = 0;
        for(int i = 0; i < input; i++)
            sum++;
        for(int j = 0; j < input; j++)
            sum++;
        return sum;
    }

    private static int Fragment5(int input){
        int sum = 0;
        for(int i = 0; i < input; i++)
            for (int j = 0; j < input * input; j++)
                sum++;
        return sum;
    }

    private static int Fragment6(int input){
        int sum = 0;
        for(int i = 0; i < input; i++)
            for (int j = 0; j < i; j++)
                sum++;
        return sum;
    }

    private static int Fragment7(int input){
        int sum = 0;
        for(int i = 0; i < input; i++)
            for (int j = 0; j < input * input; j++)
                for (int k = 0; k < j; k++)
                    sum++;
        return sum;
    }

    private static int Fragment8(int input){
        int sum = 0;
        for(int i = 1; i < input; i = i*2)
            sum++;
        return sum;
    }
}
