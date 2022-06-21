package com.company;



//class pattern{
//    public void pattern(int n){
//        for (int j = 0; j <= n; j++) {
//
//            //space
//            for (int i = 0; i <= n - j; i++) {
//                System.out.print(" ");
//            }
//            //1 st side
//            for (int i = j; i >=1; i--) {
//                System.out.print(i);
//            }
//
//            //2 nd side
//            for (int i = 2; i <= j; i++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//    }
//
//    public void dimand_pattern(int n){
//        for (int i = 0; i <= n; i++) {
//
//            //space
//            for (int j = 0; j <= n-i; j++) {
//                System.out.print("   ");
//            }
//
//            //1 st half
//            for (int j = 0; j < i; j++) {
//                System.out.print(" * ");
//            }
//
//            //2 nd half
//            for (int j = 0; j < i-1; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        //Opposite side
//        for (int i = n; i >= 0; i--) {
//
//            //space
//            for (int j = 0; j <= n-i; j++) {
//                System.out.print("   ");
//            }
//
//            //1 st half
//            for (int j = 0; j < i; j++) {
//                System.out.print(" * ");
//            }
//
//            //2 nd half
//            for (int j = i; j > 1; j--) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//
//public class Dsa_Practice {
//    public static void main(String[] args) {
//        int n = 5;
//        pattern obj = new pattern();
////        obj.pattern(n);
//        obj.dimand_pattern(4);
//    }
//}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//-------------------------------------------------------------------------------
//class shorting{
//    public void print_shorted(int arr[]){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//
//    public void buble_short(int arr [] ){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if(arr[j+1]<arr[j]){
//                    int tmp = arr[j];
//                    arr[j]= arr[j+1];
//                    arr[j+1] = tmp;
//                }
//            }
//        }
//        print_shorted(arr);
//    }
//
//    public void selection_short(int arr[]){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length - i - 1; j++) {
//                if (arr[i]>arr[j]){
//                    int tmp = arr[i];
//                    arr[i]= arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        print_shorted(arr);
//    }
//
//    public void insertion_short(int arr[]){
//        for (int i = 1; i < arr.length; i++) {
//            int current_value = arr[i];
//            int j=i-1;
//            while (j>=0 && arr[j]>current_value){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = current_value;
//        }
//        print_shorted(arr);
//    }
//}

public class Dsa_Practice {
    public static void main(String[] args) {
        int arr[] = {3, 1, 6, 9};
//        shorting sh = new shorting();
//        sh.buble_short(arr);
//        sh.selection_short(arr);
//        sh.insertion_short(arr);
//        bubble(arr);
//        System.out.println(bubble(arr));


        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int c = arr[i] - 1;
                // if(arr[i] == arr[c]){
                //     if(arr[c] != i){
                //         return i;
                //     }
                // }
                if (arr[i] != arr[c]) {
                    int tmp = arr[i];
                    arr[i] = arr[c];
                    arr[c] = tmp;
                } else {
                    System.out.println(arr[i]);
                }
            } else
                i++;
        }
//        return -1;
   }

    public static int[] bubble(int [] arr){
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
//                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }


    }
//    public static void swap(int[] arr,int start,int end){
//        int tmp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = tmp;
//    }


//    }
}

