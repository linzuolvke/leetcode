package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/13 9:44 上午
 * @Author: 邻座旅客
 */
public class p121 {

    public static int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            cost = Math.min(cost, price);  // 3,2,2,
            profit = Math.max(profit, price - cost); // 0,0,7
        }
        return profit;
    }

    public static void main(String[] args) {
//        int[] arr = {7,1,5,3,6,4};
//        int[] arr = {7,6,4,3,1};
        int[] arr = {3,2,9,1,4};
        System.out.println(maxProfit(arr));
    }
}
