package com.company;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Collator;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


//java md5
//public class pratice_hackrank {
//    public static void main(String[] args) throws NoSuchAlgorithmException {
//        Scanner sc = new Scanner(System.in);
//        String message = sc.nextLine();
//        sc.close();
//
//        try{
//            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
//            messageDigest.update(message.getBytes());
//            byte [] harsh = messageDigest.digest();
//
//            for (byte b :
//                    harsh) {
//                System.out.printf("%02x",b);
//            }
//        }catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

//Java string token
//public class pratice_hackrank {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int count = 0;
////        for (int i = 0; i < str.length() - 1; i++) {
////            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
////                count++;
////            }
////        }
//
//        String [] words = str.split("[ .,?!'/%$]+");
//
//        System.out.println(words.length);
//
//        for (String wor : words) {
//            System.out.println(wor);
//        }
//    }
//}





//pattern syntax
//public class pratice_hackrank {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        int test_case = Integer.parseInt(sc.nextLine());
////        while(test_case>0){
////            String pattern = sc.nextLine();
////            try{
////                Pattern.compile(pattern);
////                System.out.println("Valid");
////            }catch(PatternSyntaxException e){
////                System.out.println("Invalid");
////            }
////            test_case--;
//
//
//    }
//}
//class Regex{
//    String number = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
//    String pattern = number+"."+number+"."+number+"."+number;
//}


//Valid username regular expression

//class UsernameValidator {
//    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
//    // $ end with alapha numeric value and \w{7,29}- match any word character to [a-z]
//    /*
//    ^  - > means the first character starting with a-z or A-Z
//    [a-zA-Z] ->  means any character in b/w a-z or A-Z
//
//
//    If someone manages to reach my comment,
//    let me explain, in detail, why this works.
//    ^ represents that starting character of the string.
//    [aA-zZ] makes surje that the starting character is in the
//    lowercase or uppercase alphabet. \\w{7,29} represents a
//    check to make sure that the remaining items are word
//    items, which includes the underscore, until it reaches
//    the end and that is represented with $. The {7,29}
//    represents the 8-30 character constraint given to us
//    minus the predefined first character.
//    */
//}
//
//
//public class pratice_hackrank  {
//    private static final Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int n = Integer.parseInt(scan.nextLine());
//        while (n-- != 0) {
//            String userName = scan.nextLine();
//
//            if (userName.matches(UsernameValidator.regularExpression)) {
//                System.out.println("Valid");
//            } else {
//                System.out.println("Invalid");
//            }
//        }
//    }
//}



////Tag centernt extract
//public class pratice_hackrank {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//        while(testCases>0){
//            String line = in.nextLine();
//            boolean matchfound = false;
//            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
//            Matcher match = pattern.matcher(line);
//
//            while(match.find()){
//                System.out.println(match.group(2));
//                matchfound = true;
//            }
//            if(!matchfound){
//                System.out.println("None");
//            }
//            testCases--;
//        }
//        in.close();
//    }
//}








//------------------------------------------------------------------------------------
/*
You are given a  2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
 */
//public class pratice_hackrank {
//
//    static int R = 5;
//    static int C = 5;
//
//    // Returns maximum sum of
//// hour glass in ar[][]
//    static int findMaxSum(int [][]mat)
//    {
//        if (R < 3 || C < 3)
//            return -1;
//
//        // Here loop runs (R-2)*(C-2)
//        // times considering different
//        // top left cells of hour glasses.
//        int max_sum = Integer.MIN_VALUE;
//        for (int i = 0; i < R - 2; i++)
//        {
//            for (int j = 0; j < C - 2; j++)
//            {
//                // Considering mat[i][j] as top
//                // left cell of hour glass.
//                int sum = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2])
//                                   + (mat[i + 1][j + 1]) +
//                        (mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2]);
//
//                // If previous sum is less then
//                // current sum then update
//                // new sum in max_sum
//                max_sum = Math.max(max_sum, sum);
//            }
//        }
//        return max_sum;
//    }
//
//    // Driver code
//    static public void main (String[] args)
//    {
//        int [][]mat = {{1, 2, 3, 0, 0},
//                {0, 0, 0, 0, 0},
//                {2, 1, 4, 0, 0},
//                {0, 0, 0, 0, 0},
//                {1, 1, 0, 1, 0}};
//        int res = findMaxSum(mat);
//        if (res == -1)
//            System.out.println("Not possible");
//        else
//            System.out.println("Maximum sum of hour glass = "
//                    + res);
//    }
//
//}

















//////Bigdecimal
/////*
////
////9
////
////-100
////50
////0
////56.6
////90
////0.12
////.12
////02.34
////000.000
////
////
////-100
////0
////000.000
////0.12
////.12
////02.34
////50
////56.6
////90
////*/
//public class pratice_hackrank {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String  [] arr = new String[n + 2];
//        for (int i = 0; i < n; i++) {
//            arr[i] = br.readLine();
//        }
//        Arrays.sort(arr, Collections.reverseOrder(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1 == null || o2 == null) {
//                    return 0;
//
//                }
//                BigDecimal s1bd = new BigDecimal(o1);
//                BigDecimal s2bd = new BigDecimal(o2);
//                return s1bd.compareTo(s2bd);
//            }
//
//
//        }));
//
//
//
//
//        for (int i=0; i<n; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}

//public class pratice_hackrank {
//    public static void main(String[] args){
//        String str = "^[a-zA-z0-9]{2,9}.@$";
//
//        Pattern pattern = Pattern.compile("abcdef.@");
//        Matcher matcher = pattern.matcher(str);
//
//        System.out.println(matcher.find()? "true":"false");
//    }
//}





//Buffereader praatiace
//public class pratice_hackrank {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
//        BigInteger inp1 = new BigInteger(sc.next());
//        BigInteger inp2 = new BigInteger(sc.next());
//        BigInteger b1,b2;
//        b1 = inp1.add(inp2);
//        b2 = inp1.multiply(inp2);
//        System.out.println(b1);
//        System.out.println(b2);
//
//    }
//
//}


public class pratice_hackrank {
public static void main(String[] args) throws IOException {


    }
}