import java.util.Arrays;

public class mutabilityOfstring {

    public static void main(String[] args) {

     // String name = "Rahat";
  //   changename(name);
     // System.out.println(name);
     //  char i = name.charAt(2);
     //  i = 'j';
     // System.out.println(name);

        int[] arr = {1,3,5,5};

            arraychange(arr[2],arr[1]);

        System.out.println(Arrays.toString(arr));


//       String[] atr = {"kinal","juads","hadfhs"};
//       atr[1] = "lajsfdla";
//        System.out.println(Arrays.toString(atr));

//        Arrays are mutable i.e. They can be changed or modify but strings are immutable and they cannot change

    }

//     static void changename(String name) {
//
//         char j = name.charAt(2) ;
//         j = 'j';
//    }
    public static void arraychange(int a , int b ){

        int temp = a ;
         a = b;
         b = temp;

    }


}
