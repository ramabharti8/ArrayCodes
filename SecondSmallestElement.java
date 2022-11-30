package com.company;

public class SecondSmallestElement {
    public static void main(String[] args){
        int arr[] = new int [] {5,10,15,20,2,1,21};
        int min=Integer.MAX_VALUE;
        int s_min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                s_min=min;
                min=arr[i];
            }
            else if(arr[i]<s_min)
                s_min=arr[i];
        }
        System.out.println("Second smallest=" +s_min);
    }
}

// Complexity = O(N)