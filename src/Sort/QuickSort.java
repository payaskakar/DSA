package Sort;
//Assuming last element as Pivot.
public class QuickSort {
    static int partitionIndex(int []arr, int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot) {
                i++;

                int x = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
            }
        }
        //swap pivot
        int swap=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=swap;

        return i+1;
    }
    static  void sort(int []arr, int low, int high){
            if(low<high){
                int index=partitionIndex(arr, low, high);

                sort(arr,low,index-1);
                sort(arr,index+1,high);
            }


    }
   static void print (int []arr){
        int n=arr.length;
        for(int i=0;i<n;++i){
            System.out.println(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
     int []arr={10, 20, 50, 30, 5, 75, 60, 65, 35};
        int n=arr.length;
     sort(arr, 0,n-1);
        System.out.println("Sorted Array via QuickSort");
        print(arr);

    }
}
