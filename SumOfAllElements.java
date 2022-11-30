package com.company;

public class SumOfAllElements {
    public static void main(String[] args){
        int arr[] = new int[] {5,10,2,15,20};
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}

//Time Complexity: O(n)
//Auxiliary Space: O(1)
