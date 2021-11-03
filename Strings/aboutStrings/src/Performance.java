public class Performance {

    public static void main(String[] args) {

        String series = "";

        for ( int i = 0 ; i < 26; i++){

            char ch = (char)('a' + i); // here new object is being created every time no object is modified
                                       // a then ab then abc, each time a new string is created the old one is deleted
            series += ch;              // for adding n characters in the string the time complexity is O(n2) very bad.
                                       // to solve this problem here comes a data type that creates object only ones
        }                              // and modifies it again and again saving our time. It is known as string builder

        System.out.println(series);

    }


}
