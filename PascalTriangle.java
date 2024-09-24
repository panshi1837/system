import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入杨辉三角形的行数 n: ");
        int n = scanner.nextInt();

        int[][] triangle = new int[n][];

        // 构建杨辉三角形
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            // 每行的第一个和最后一个数字都是1
            triangle[i][0] = triangle[i][i] = 1;

            // 计算中间的数字
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // 打印杨辉三角形
        for (int i = 0; i < n; i++) {
            // 打印前置空格，使三角形居中
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            // 打印数字
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            // 换行
            System.out.println();
        }

        scanner.close();
    }
}
