package CodeWars.EqualSidesOfAnArray;

public class Kata {
    public static int findEvenIndex(int[] arr) {
        for (int i = 0 ; i < arr.length -1 ; i++ ) {
            int l = leftSum(i, arr);
            int r = rightSum(i, arr);
            if (l == r ) return i;
        }

        return -1;
    }

    private static int rightSum(Integer i, int[] arr) {
        int sum = 0;
        for (int y = arr.length-1 ; y > i ; y--){
            sum += arr[y];
        }
        return sum;

    }

    private static int leftSum(Integer i, int[] arr) {
        int sum = 0;
        for (int y =0 ; y < i ; y++){
            sum += arr[y];
        }
        return sum;
    }
}
