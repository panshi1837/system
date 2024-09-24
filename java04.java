import java.util.Scanner;

public class java04 {
    public static void main(String[] args) {
    int total_chickens = 100; // 总共的鸡的数量
    int total_money = 100;    // 总共的钱
    int price_hen = 5;        // 母鸡的价格
     int price_rooster = 3;    // 公鸡的价格
     int price_chick = 1 / 3;  // 小鸡的价格（3只1元）

        int hen, rooster, chick; // 分别表示母鸡、公鸡和小鸡的数量
        int count = 0;           // 计数可能的组合数量

        // 遍历所有可能的母鸡数量
        for (hen = 0; hen <= total_money / price_hen; ++hen) {
            // 遍历所有可能的公鸡数量
            for (rooster = 0; rooster <= (total_money - hen * price_hen) / price_rooster; ++rooster) {
                // 计算小鸡的数量
                chick = total_chickens - hen - rooster;
                // 检查小鸡的数量是否为3的倍数（因为3只1元）以及总金额是否正确
                if (chick >= 0 && chick % 3 == 0 && hen * price_hen + rooster * price_rooster + chick / 3 == total_money) {
                    // 打印出一种可能的组合
                    System.out.println("母鸡"+hen+"公鸡"+rooster+"小鸡"+chick);
                    count++; // 增加可能的组合数量
                }
            }
        }
        System.out.println("共有" + count + "种组合");
    }
}
