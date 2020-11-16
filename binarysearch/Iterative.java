package binarysearch;

class Iterative {
   static int BinarySearch(int []nums, int x){
       int l=0;
       int r=nums.length-1;
       int mid=l+(r-1)/2;
       while (l<=r){
           if(nums[mid]==x){
               return mid;
           }
           if(nums[mid]<x){
               l=mid+1;
           }
           else {
               r=mid-1;
           }
       }
       return -1;
   }
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int l=0;
        int []nums={1,3,5,8,11,70,80,99};
        int r=nums.length-1;
        int x=11;

        int result=BinarySearch(nums,x);
        if(result==-1){
            System.out.println("Element not found:");
        }
        else{
            System.out.println("Element7 found is : "+ result);

        }
    }
}
