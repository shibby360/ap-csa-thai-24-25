public class _2dArraysnum2 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        int n = 0;
        for(int c = 0; c < arr[0].length; c++) {
            for(int r = 0; r < arr.length; r++) {
                arr[r][c] = n;
                n++;
            }
        }
        for(int[] x : arr) {
            for(int y : x) {
                System.out.print("["+y+"]");
            }
            System.out.println();
        }
    }
}