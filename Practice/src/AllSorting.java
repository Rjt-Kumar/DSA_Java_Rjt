import java.util.*;
import java.util.ArrayList;

import static Arr.Sorting.swap;

public class AllSorting{

    public static void main(String[] args) {
//       ArrayList<String> lsit =  subse("abc","");
//        System.out.println(lsit);

//        ArrayList<ArrayList<Integer>> ans = permu(new int[] {4,5,6},0);
//        System.out.println(ans);
//kunal("abc","");
//        int n = '1'+'0';
//        int a = '1' - '0';
//        System.out.println(n + " " + a);
//
//
//        ArrayList<String> ans = letter("12","");
//        System.out.println(ans);

        dice("",6,1);
    }
    public static ArrayList<String> subse(String old,String ans){

        ArrayList<String> list = new ArrayList<>();
        if( old.isEmpty() ){
            list.add(ans);
            return list;
        }

        ArrayList<String> added = subse(old.substring(1),ans+old.charAt(0));
        ArrayList<String> notAdded = subse(old.substring(1),ans);

        added.addAll(notAdded);
        list.addAll(added);
        return list;

    }

    public static ArrayList<ArrayList<Integer>> permu(int[] arr, int l){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        if( l == arr.length ){
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = 0; i< arr.length; i++){
                ans.add(arr[i]);
            }
            list.add(ans);
            return list;
        }

        for( int i = l; i< arr.length ; i++){
            swap(arr,l,i);
            ArrayList<ArrayList<Integer>> currentAns = permu(arr,l+1);
            list.addAll(currentAns);
            swap(arr,l,i);
        }

        return list;

    }

    public static void kunal(String old,String ans){
        if( old.isEmpty() ){
            System.out.println(ans);
            return;
        }
        char ch = old.charAt(0);

        for(int i = 0; i<= ans.length();i++){
            String f = ans.substring(0,i);
            String l = ans.substring(i,ans.length());
            kunal(old.substring(1),f+ch+l);
        }
    }

    public static ArrayList<String> letter(String old,String ans){

     ArrayList<String> list = new ArrayList<>();

     if( old.isEmpty() ){
         list.add(ans);
         return list;
     }

     int n = old.charAt(0) - '0';



     for( int i = (n-1)*3; i < (n)*3; i++){

         char ch = (char)('a'+i);

         ArrayList<String> currentAns = letter(old.substring(1),ans+ch);
         list.addAll(currentAns);
     }
     return list;
    }

    public static void dice(String ans,int target,int n){

        if( target == 0){
            System.out.println(ans);
            return;
        }


        for( int i = n; i <= 6 && i <= target;i++){
            dice(ans+i,target-i,i);
        }



    }






        }

