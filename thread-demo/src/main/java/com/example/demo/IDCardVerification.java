package com.example.demo;

import java.util.Scanner;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2019/8/9 9:06.
 */
public class IDCardVerification {


    /**
     * 身份证校验逻辑 b
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //加权系数
        long[] x = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        //校验映射表
        /**
         * 对应值：  1 0 X 9 8 7 6 5 4 3 2；
         * 算出来的：0 1 2 3 4 5 6 7 8 9 10
         */
        int[] a = {1, 0, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        while (true) {
            System.out.println("请输入身份证：");
            String in = scanner.nextLine();

            if (in.equalsIgnoreCase("out")) {
                break;
            }

            int lastNumber = in.charAt(in.length() - 1) - 48;
            in = in.substring(0, in.length() - 1);

            long sum = 0L;
            for (int i = 0; i < in.length(); i++) {
                sum += (in.charAt(i) - 48) * x[i];
            }

            int index = (int)(sum % 11);
            int result = a[index];

            if (lastNumber == result) {
                System.out.println("验证成功");
                System.out.println("身份证尾号验证：" + result);
            } else {
                System.out.println("验证失败");
            }

        }
    }

}
