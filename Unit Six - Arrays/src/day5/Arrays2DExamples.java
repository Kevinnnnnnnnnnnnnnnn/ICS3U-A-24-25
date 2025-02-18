package day5;

public class Arrays2DExamples {
    public static void main(String[] args) {
        // Creating a 2D array
        int[][] nums = new int[4][3];

        printArray(nums);
        populateArray(nums);
        printArray(nums);

        int[] sumRows = rowSum(nums);
        for (int i = 0; i < sumRows.length; i++) {
            System.out.println("Sum of row " + (i + 1) + " is " + sumRows[i]);
        }

        System.out.println();
        int[] sumCols = colSum(nums);
        for (int i = 0; i < sumCols.length; i++) {
            System.out.println("Sum of col " + (i + 1) + " is " + sumCols[i]);
        }
    }

    private static int[] colSum(int[][] nums) {
        int[] arr = new int[nums[0].length];
        for (int col = 0; col < nums[0].length; col++) {
            arr[col] = addCol(nums, col);
        }
        return arr;
    }

    private static int addCol(int[][] nums, int i) {
        int sum = 0;
        for (int row = 0; row < nums.length; row++) {
            sum += nums[row][i];
        }
        return sum;
    }

    private static int[] rowSum(int[][] nums) {
        int[] arr = new int[nums.length];
        for (int row = 0; row < nums.length; row++) {
            int sum = 0;
            for (int col = 0; col < nums[row].length; col++) {
                sum += nums[row][col];
            }
            arr[row] = sum;
        }
        return arr;
    }

    private static void printArray(int[][] nums) {
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                System.out.print(nums[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void populateArray(int[][] nums) {
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = (int) (Math.random() * 10) + 1;
            }
        }
    }
}
