import java.util.Scanner;

public class java03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = scanner.nextInt();
if(num<=5) System.out.println("10元");
if (num>5&&num<=15) {
            System.out.println(10+(num-5)*0.3);
        }
        if(num>15){
            System.out.println("行李重量太大666，不可以托运");
        }

    }
}
