import java.util.Arrays;

public class methodsOfStrings {

    public static void main(String[] args) {

        String name = "   Kunal Kushwaha hell0 my friends chai peelo   ";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.trim());
        System.out.println(Arrays.toString(name.split(" "))); // it is used to split the string into array when ever
        System.out.println(name.charAt(23));  // the output of the above will be [, , , Kunal, Kushwaha, hell0, my, friends, chai, peelo]



    }



}
