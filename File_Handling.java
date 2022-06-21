package com.company;

import java.util.Scanner;

//public class File_Handling {
//    public static void main(String[] args) {
//        File myfile = new File("Abhi.txt");
//        try {
//            myfile.createNewFile();
//        }catch (IOException e){
//            System.out.println(e);
//            e.printStackTrace();
//        }
//    }
//
//}

//public class File_Handling {
//    public static void main(String[] args) {
//        try {
//            FileWriter fileWriter = new FileWriter("Abhi.txt");
//            fileWriter.write("This is file created by me\n in class btech 1 year");
//            fileWriter.close();
//        }
//        catch (IOException e){
//            System.out.println(e);
//            e.printStackTrace();
//        }
//    }
//}

//public class File_Handling {
//    public static void main(String[] args) {
//        File myFile = new File("Abhi.txt");
//        try {
//            Scanner sc = new Scanner(myFile);
//            while (sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println(e);
//        }
//    }
//}

//public class File_Handling {
//    public static void main(String[] args) {
//         File myfile = new File("Abhi.txt");
//         if (myfile.delete()){
//             System.out.println("file is deleted ");
//         }
//         else {
//             System.out.println("file have some error to delete error");
//         }
//    }
//}


//-------------------------------------------
//date of day in hackrank
//class Result {
//
//    /*
//     * Complete the 'findDay' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts following parameters:
//     *  1. INTEGER month
//     *  2. INTEGER day
//     *  3. INTEGER year
//     */
//
//    public static String findDay(int month, int day, int year) {
//        LocalDate localDate = LocalDate.of(year, month, day);
//        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
//        return dayOfWeek.toString();
//    }
//
//}
//---------------------------------------------


import java.util.*;

//public class File_Handling {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i=0;i<t;i++)
//        {

//            try
//            {
//                long x=sc.nextLong();
//                System.out.println(x+" can be fitted in:");
//                if(x>=-128 && x<=127)System.out.println("* byte");
//                //Complete the code
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//            try{
//                long x= sc.nextLong();
//                System.out.println(x+" can be fitted in:");
//                if(x>=-128 && x<=127)System.out.println("* byte");
//                else if(x>=-32768 && x<=32767)System.out.println("* short");
//                else if(x>=-pow(2,31) && x<=pow(2,31)-1)System.out.println("* int");
//                else if(x>=-pow(2,63) && x<=pow(2,63)-1)System.out.println("* long");
//            }
//            catch(Exception e){
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//    }

//          Scanner scan = new Scanner(System.in);
//          int i = 0;
//          int sq;
//          sq = scan.nextInt();
//          //String gg = scan.toString();
//          String s = String.valueOf(sq);
//        System.out.println(s);


//    }
//}









//-------------------------------------
//import java.util.Locale;
//public class File_Handling {
//    public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
//    double payment = scanner.nextDouble();
//    scanner.close();
//
//    Locale indiaLocale = new Locale("en","in");
//
//    NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
//    NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
//    NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
//    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//
//        System.out.println("US: " + us.format(payment));
//        System.out.println("India: " + india.format(payment));
//        System.out.println("China: " + china.format(payment));
//        System.out.println("France: " + france.format(payment));
//    }
//}
//----------------------------------

//public class File_Handling {
//    public static void main(String[] args){
//    String s="hellow";
//    String cap = s.substring(0, 1).toUpperCase() + s.substring(1);
//    System.out.println(cap);
//    System.out.println(s.toUpperCase());
//    }
//}
//---------------------------------

//class sorted{
//    public static String Sor(String str){
//        char tmp[] = str.toCharArray();
//        Arrays.sort(tmp);
//        return new String(tmp);
//    }
//}
public class File_Handling {


//    static boolean is_Anagram(String a, String b){
//        a.toLowerCase();
//        b.toLowerCase();
//
//        if (a.length() != b.length()) return false;
//        int arr[] = new int[234];
//        for (int i = 0; i < a.length(); i++) {
//            int index = a.charAt(i)-'a';//give the element at i index
//            arr[index]++;
//        }
//        for (int i = 0; i < b.length(); i++) {
//            int index = b.charAt(i)-'a';
//            arr[index]--;
//        }
//        for (int i = 0; i < 56; i++) {
//            if (arr[i] !=0)return false
//        }return true;
//    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        int sc1 = sc.nextInt();
//        int sc2 = sc.nextInt();
//        String str="hidfsa";
//        char temp_array[] = str.toCharArray();
//        Arrays.sort(temp_array);
//        System.out.println(temp_array);
//
//        System.out.println(s1.substring(sc1, sc2));
//            Scanner sc = new Scanner(System.in);
//            String str1 = sc.next();
//        //System.out.println(str1);
//            String str2 = sc.next();
//        //System.out.println(str2);







//------------------------------
//            sorted obj = new sorted();
//            System.out.println(obj.Sor(str1)+" "+obj.Sor(str2));
//            if (obj.Sor(str1) == obj.Sor(str2)){
//                System.out.println("Anagrams");
//            }
//            else {
//                System.out.println("Not Anagrams");
//            }









    }
}