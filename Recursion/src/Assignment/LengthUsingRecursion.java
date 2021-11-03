package Assignment;

public class LengthUsingRecursion {

    public static void main(String[] args) {



        String str = "Geeks";

        System.out.println(recLen(str));

    }
    private static int recLen(String str)
    {

        // if we reach at the end of the string

        if (str.equals("")){
            return 0;
        }
        else {
            return recLen(str.substring(1)) + 1;
        }

        

    }



}
