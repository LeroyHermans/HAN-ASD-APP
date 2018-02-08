public class Program {

    public static void main(String args[]){
        System.out.println("Faculteit:");
        System.out.println("non recursive:");
        Faculteit.nonRecursiveFaculteit(14);
        System.out.println("");
        System.out.println("RECURSIVE");
        long a = Faculteit.recursiveFaculteit(14);
        System.out.println("Faculteit recursief: " + a);

        System.out.println("SUM:");
        System.out.println("non recursive:");
        Som.sumFor(14);
        System.out.println("");
        System.out.println("recursive:");
        int b  = Som.sum(14);
        System.out.println("Som recursief: " + b);

        System.out.println("");
        System.out.println("Binary:");
        int c  = BinaryRep.countBinary(14);
        System.out.println("binary amount: " + c);
    }
}
