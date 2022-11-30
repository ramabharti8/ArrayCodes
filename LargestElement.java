package com.company;

public class LargestElement {
    public static void main(String[] args){
        int arr[] = new int[] {5,10,2,20,25,100};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest element:" +max);
    }
}

// time complexity = O(N)
// space complexity = O(1)
