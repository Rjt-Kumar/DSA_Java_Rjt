public class SB {
/*
     It is used to create strings and is more optimized.Since it creates object only one's and then modifies it later

 */
public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();

    for ( int i = 0; i < 100 ; i++){

        char ch = (char)('a' + i);

        builder.append(ch); // it's not creating new object it is just changing it. These are mutable

    }
    System.out.println(builder.toString());

}
}
