package testing;

public class array {
    static  int[] fun(){
        int k=3;
        int nums[]={1,2,3,4,5,6,7};
        int []arr=new int[nums.length];
        for(int i=nums.length-1;i>k;i--){
            arr[i]=nums[i];
        }
        for(int i=0;i<nums.length-1-k;i++){
            arr[i]=nums[i];
        }
        return arr;
    }
    public static void  main(String[] args) {

        System.out.println(fun());
    }
}
