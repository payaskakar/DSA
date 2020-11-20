public class floodfill {
    static void floodfiller(int nums[][],int r,int c,int tofill,int prevfill)
    {
      int rows=nums.length;
      int coloums= nums[0].length;
      if(r<0 || r>=rows || c<0 || c>=coloums)
          return;
      if (nums[r][c]!=prevfill)
          return;
      nums[r][c]=tofill;

      floodfiller(nums,r,c-1,tofill,prevfill);
        floodfiller(nums,r-1,c,tofill,prevfill);
        floodfiller(nums,r+1,c,tofill,prevfill);
        floodfiller(nums,r,c+1,tofill,prevfill);

    }
    public static void main(String []args)
    {
      int nums[][]={{1,2,0,0,2,0,2},
                    {1,2,0,0,2,0,2},
                    {1,2,0,0,2,0,2},
                    {1,2,0,0,2,0,2},
                    {1,2,0,0,2,0,2},
                    {1,2,0,0,2,0,2}};
      floodfiller(nums,3,2,1,2);
        System.out.println(nums);
     }
  
}
