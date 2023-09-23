
//Write a program to swap 2 String without a temporary variable

public class SwapString {
    public static void main(String[] args) {
        String a="Abi";
        String b="Alghas";
        System.out.println("Before Swapping");

        System.out.println(" String 1 : " + a);
        System.out.println(" String 2 : " + b);

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println("\n After swapping:");
        System.out.println(" String 1 : " + a);
        System.out.println(" String 2 : " + b);

    }

}
