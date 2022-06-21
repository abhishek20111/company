package com.company;

import java.util.*;
import java.util.Collections;

class LL{
    Node head;
    private int size;

    LL(){
        size =0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void add_first(String  data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void add_Last(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        if (head.next == null){
            head.next = newNode;
            return;
        }
        Node last_node = head;
        while (last_node.next != null){
            last_node = last_node.next;
        }
        last_node.next = newNode;
    }

    public void print_list(){
        Node current_node = head;
        while (current_node != null){
            System.out.print(current_node.data+"-->");
            current_node=current_node.next;
        }
        System.out.println("Null");
    }

    public void remove_first(){
        if (head.next != null){
            System.out.println("empty list");
            return;
        }
        head = this.head.next;
        size--;
    }

    public void remove_last(){
        if (head == null){
            System.out.println("Empty list");
            return;
        }
        size--;
        if (head.next == null){
            head = null;
            return;
        }
        Node curr_node = head;
        Node lastNode = head.next;
        while (lastNode.next !=null){
            curr_node = curr_node.next;
            lastNode = lastNode.next;
        }
        curr_node.next = null;
    }
    public int getSize(){
        return size;
    }
    public void addMid(int index, String data){

    }

}

public class Link_list {
    public static void main(String[] args) {
//        LL lists = new LL();
//        lists.add_first("340");
//        lists.add_first("344");
//        lists.add_first("320");
//
//        lists.add_Last("34");
//        lists.print_list();
//        lists.remove_last();
//        lists.print_list();










//        int[] arr = {5, 7, 7, 8, 8, 10};
//        int target = 8;
//        int[] ans = {-1, -1};
//
//        int start = search(arr, target, true);
//        int end = search(arr, target, false);
//
//        ans[0] = start;
//        ans[1] = end;
//
//        System.out.println(ans[0]+" "+ans[1]);
//
//    }
//

//    public  static  int search(int[] nums, int target, boolean f_c_i) {
//        int ans = -1;
//        int start = 0;
//        int end = nums.length - 1;
//
//        while (start <= end) {
//
//            int mid = start + (end - start) / 2;
//
//            if (target < nums[mid]) {
//                end = mid - 1;
//            } else if (target > nums[mid]) {
//                start = mid + 1;
//            } else {
//                ans = mid;
//                if (f_c_i) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return ans;
//
//
//    }


        /*
        ####for rotating array pivot in c by recursion##


        int getPivotElement(int *array, int left, int right){
         if (right < left)
        return -1;


        if (right == left)
            return left;


        int middle = (left + right)/2;


        if (middle < right && array[middle] > array[middle + 1])
            return middle;

        if (middle > left && array[middle] < array[middle - 1])
            return middle-1;

        if (array[left] >= array[middle]){

            return getPivotElement(array, left, middle-1);
        } else {

            return getPivotElement(array, middle + 1, right);
        }
    }

    int main(){
        int array[11] = {16, 18, 22, 25, 1, 3, 5, 6, 7, 10, 14};

        printf("Pivot Element : %d \n", array[getPivotElement(array, 0, 10) + 1]);

        return 0;






        ############upper program without recursion

        int getPivotElement(int *array, int left, int right){

        while(left<right){


            if (right == left)
                return left;


            int middle = (left + right)/2;


            if (middle < right && array[middle] > array[middle + 1])
                return middle;

            if (middle > left && array[middle] < array[middle - 1])
                return middle-1;

            if (array[left] >= array[middle]){

                right = middle-1;
            } else {

                left = middle+1;
        }
        return;-1;


        */

    }
}

