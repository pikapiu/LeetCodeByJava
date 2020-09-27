package main.code.array;

import java.util.List;
import java.util.Random;

/**
 * @Author: zs
 * @Date: 2020/4/24 11:19
 */
public class LunchChoice {
    /**
     * 1.0
     */
    public static void main(String[] args) {
        String[] stores = {"鸭血粉丝","牛肉面","如意菜饭","四海游龙","三根米线","外卖","台湾牛肉面"};
        Random ran = new Random();
        System.out.println(stores[ran.nextInt(stores.length)]);
    }


}
