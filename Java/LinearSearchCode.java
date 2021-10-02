package linearSearch;

public class LinearSearchCode {
    public static void main(String[] args) {
        int[] arr = {12,44,55,22,98,11};
        int target = 11;
        int ans = linearSearchCode01(arr, target);
        System.out.println(ans);
    }
    static int linearSearchCode01(int[] arr, int target){
        if(arr.length == 0){
            // array is empty hence return -1
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                // element found hence return index
                return i;
            }
        }
        // element not found hence return -1
        return -1;
    }
}

/*
Time Complexity 
Best Case :- O(1)
Worst Case :- O(n)
*/