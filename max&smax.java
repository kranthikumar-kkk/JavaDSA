public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    smax = max;
                    max = arr[i][j];
                } else if (arr[i][j] != max && arr[i][j] > smax) {
                    smax = arr[i][j];
                }
            }
        }
        System.out.println("Max = " + max);
        System.out.println("SMax= " + smax);
    }
}
