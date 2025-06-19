import java.util.ArrayList;
import java.util.List;

public class NumbersDissappearedInArray {
    public static void main(String[] args) {
        // if range is 0,N then
        // every element will be at index = value

        // if range is 1,N
        // then every element will be at index = value-1
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = cyclicSortDissappeared(arr);
        System.out.println(result);
    }

    static List<Integer> cyclicSortDissappeared(int[] arr){
        int i = 0;
        while ( i < arr.length) {
            int index = arr[i]-1;
            if(arr[i]!=arr[index]){
                swap(arr,i,index);
            }else{
                i++;
            }

        }
        // just find missing numbers
        List<Integer>  ans = new ArrayList<>();
        for(int index=0;index< arr.length;index++){
            if(arr[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
