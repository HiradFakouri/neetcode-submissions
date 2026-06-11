class Solution {
    public int[] replaceElements(int[] arr) {
        int[] new_arr = arr.clone();;

        int i = arr.length-1;
        int max = -1;

        while (i>=0) {
            new_arr[i] = max;
            if (arr[i] > max){
                max = arr[i];
            }

            i--;
        }

        return new_arr;
    }
}