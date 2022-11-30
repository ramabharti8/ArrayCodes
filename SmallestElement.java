package com.company;

public class SmallestElement {
    public static void main(String[] args){
        int arr[] = new int[] {500,2,1,100,0};
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
// Time Complexity = O(N)
// Space Complexity = O(1)
