package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class practice_dsa {
    public static void main(String[] args) {
        int [][] arr = {
                {1,3,5,7},
                {2,5,8,9},
                {4,10,34,78}
        };
        System.out.println(search(arr,8));
    }
    //2D array
    static int [] search(int [][]matrix, int target){
        int r=0;
        int c = matrix[0].length-1;

        while (r<matrix.length && c>=0){
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }
            if (matrix[r][c] < target){
                r++;
            }
            else {
                c++;
            }
        }return new int[]{-1,-1};
    }
}
