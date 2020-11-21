package testing;

public class PeakElement {
    static  int FindPeakElement(int []arr){
        int []nums=new int[arr.length+1];
        int N=arr.length-1;
        int i=arr[0];
        int j=i+1;
        int maxSoFar=i;
        while(i>j){
           if(arr[i]<arr[j]){
               maxSoFar=arr[j];
               i++;
               j++;
           }
           else{
               nums[i]=arr[i];
               i++;
               j++;
               if(arr[j]==arr[N-1]){
                   arr[i]+=nums[i];
                   i++;
               }
           }

        }

        return nums[nums.length];
    }
    public static void main(String[] args) {
        int []arr={10,12,15,11};
//        FindPeakElement(arr);
        System.out.println(FindPeakElement(arr));
    }
}
