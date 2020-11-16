package binarysearch;

public class Recursive {
    static int BinarySearch(int []arr,int x, int l, int r) {
        if(r>=1){
        int mid = l + (r - 1) / 2;
        if (arr[mid] == x) {
            return mid;
        }
            if(arr[mid] > x){
                return BinarySearch(arr, x, l,mid-1);
            }
           else{
                return BinarySearch(arr, x, mid + 1, r);

           }
            }

        return -1;

    }

        public static void main (String[] args){
            int[] arr = {1, 2, 4, 5, 12, 33, 47, 81};
            int l=0;
            int r = arr.length - 1;
            int x=12;
            BinarySearch(arr,x,0,arr.length-1);
        }
    }

