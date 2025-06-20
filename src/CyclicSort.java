import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[]arr = {3,5,2,1,4};
        // when given nos. from range 1,N == use cyclic sort.
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while ( i < arr.length) {
            int index = arr[i]-1;
            if(arr[i]!=arr[index]){
                swap(arr,i,index);
            }else{
                i++;
            }
            
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
