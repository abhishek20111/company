package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class practice_sorting1 {
    public static void main(String[] args) {
        int [] arr= {2,44,2,52,32,5,12};
        int [] arr1 = {3,2,4,5,1};
//        bubble(arr);
//        System.out.println(Arrays.toString(arr));
//        selection_sorting_method(arr);
//        System.out.println(Arrays.toString(arr));
//        insertion(arr);
//        System.out.println(Arrays.toString(arr));


        cyclic_sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void bubble(int [] arr){
        boolean sawped;
        for (int i = 0; i < arr.length; i++) {
            sawped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j]<arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    sawped =true;
                }
            }if(!sawped){
                break;
            }
        }
    }

    public static void cyclic_sort(int [] arr){
        int i=0;
        while(i< arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swapper(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }

    public static void selection_sorting_method(int [] arr){
        for (int i = 0; i < arr.length; i++) {
                int last = arr.length-1-i;
                int max_ind = max_index(arr,0,last);
                if(arr[last]<arr[max_ind]){
                    swapper(arr,max_ind,last);

                }
        }
    }


    public static void insertion(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j] < arr[j-1]){
                    swapper(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static void swapper(int []arr, int s, int e){
        int tmp = arr[s];
        arr[s] = arr[e];
        arr[e] = tmp;
    }
    public static int max_index(int []arr, int s, int e){
        int max= s;
        for (int i = s; i < e; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }return max;
    }


}
