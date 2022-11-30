public class MinMaxArray {
    public static void main(String args[]){
        int [] arr = {6,8,10,2,80,50};
        FindMinAndMax(arr);
    }
    static void FindMinAndMax(int[] arr){
        if(arr==null || arr.length==0);
        int min=arr[0];
        int max=arr[0];
        for(int i=1; i< arr.length; i++){
          if(arr[i]<min){
              min=arr[i];
          }
          if(arr[i]>max){
              max=arr[i];
          }
        }
        System.out.println(max + " maximum");
        System.out.println(min + " minimum");
      }
}
// Time complexity= O(n).
//Space Complexity= O(1).
