public class IncrementString {
    //Write a Java Function that increments a string,
    //It should take the string of unknown length. Don't use regular
    //expressions.
    //Examples:
    //123 -> 124
    //53456 -> 53457
    //29 -> 30
    //Function signature

    public static String increment(String str){
        int num=Integer.valueOf(str);
        num++;

        return Integer.toString(num);

    }

    public static void main(String[] args) {
        String input1="123";
        String input2="53456";
        String input3="29";

        System.out.println("Incremented: " +increment(input1));
        System.out.println("Incremented: " +increment(input2));
        System.out.println("Incremented: " +increment(input3));


    }
}
