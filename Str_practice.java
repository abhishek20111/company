package com.company;

public class Str_practice {
    public static void main(String[] args) {
////        float [] marks;
////        marks = new float[5];
//
////        float [] marks = new float[5];
//
//        float [] marks = {78.9f,67.89f, 67.0f, 234.889f};
//        float sum=0,num=0;
//        for (int i=0; i< marks.length; i++){
//            sum += marks[i];
//        }
//        for (float element : marks) {
//            num += element;
//        }
//
//        System.out.println("so num is- "+num+" sum is- "+sum);









//        float [] marks = {34.3f,33.2f,43.4f};
//        float num = 33.21f;
//        boolean is_present = false;
//        for (float element :
//                marks) {
//            if (num == element){
//                is_present = true;
//            }
//        }
//        System.out.println(is_present);







        int arr[] = {1,2,4,6,54,64};
        int target = 64;
        System.out.println(search(arr,target,0, arr.length-1));

    }


    public static int search(int arr[],int target, int s, int e){
        if (s > e) {
            return -1;
        }

        int mid = (s+e)/2;
        if (target == arr[mid]){
                return mid+1;
        }
        if (target < arr[mid]){
            return search(arr, target, s, mid-1);
        }
        return search(arr, target, mid+1, e);
    }
}
