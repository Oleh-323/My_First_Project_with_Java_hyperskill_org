package calculator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GoodsAndPrice goodsAndPrice = new GoodsAndPrice();
        List<Map.Entry<String , Double>> list = goodsAndPrice.getListEntry();

//        System.out.println("Prices:");
//        for(Map.Entry<String , Double> entry : list){
//            System.out.println(entry.getKey() + ": $" + entry.getValue());
//        }

        System.out.println("Earned amount: ");
        System.out.println(goodsAndPrice.sum());

        System.out.println("Staff expenses:");
        double staffExpenses= sc.nextDouble();
        System.out.println("Other expenses: ");
        double otherExpenses= sc.nextDouble();
        double totalexpenses= staffExpenses + otherExpenses;
        System.out.println("Net income: $"+(goodsAndPrice.getTotalSum()-totalexpenses));
    }
}