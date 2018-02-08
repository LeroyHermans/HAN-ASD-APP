public class Program {

    public static void main(String args[]){
        System.out.println("non recursive:");
        Faculteit.nonRecursiveFaculteit(14);
        System.out.println("");
        System.out.println("RECURSIVE");
        long a = Faculteit.recursiveFaculteit(14);
        System.out.println("Faculteit recursief: " + a);
    }
}
