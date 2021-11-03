import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {

        System.out.println('a' + 'b'); // adds the ASCII value of the characters
        System.out.println("a" + "b"); // joins the strings
        System.out.println((char)('a'+ 3)); // adds the ASCII value of the characters and return the character with that ASCII value
        System.out.println("a" + 3); // same as the first one
        // here this 3 will be converted into this bigger Integer and this bigger Integer calls toString() method and will give value of 3
        System.out.println('a' + "b");
        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal loves " + new Integer(69));

        // The operator + is only defined in java for primitives and only if one of those is strings
       // System.out.println(new ArrayList<>() + new Integer(69)); // i.e. is why it is showing error
     }

}
