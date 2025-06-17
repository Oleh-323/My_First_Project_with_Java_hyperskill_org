package calculator;

import java.util.*;

public class GoodsAndPrice {
    private double totalSum;

    private LinkedHashMap<String,Double> priceOfGoods;
    private LinkedHashMap<String,Double> counts;

    public GoodsAndPrice(){
        priceOfGoods = new LinkedHashMap<>();
        counts = new LinkedHashMap<>();

        priceOfGoods.put("Bubblegum", 2.0);
        priceOfGoods.put("Toffee", 0.2);
        priceOfGoods.put("Ice cream", 5.0);
        priceOfGoods.put("Milk chocolate", 4.0);
        priceOfGoods.put("Doughnut", 2.5);
        priceOfGoods.put("Pancake", 3.2);

        counts.put("Bubblegum", 101.0);
        counts.put("Toffee", 590.0);
        counts.put("Ice cream", 450.0);
        counts.put("Milk chocolate", 420.0);
        counts.put("Doughnut", 430.0);
        counts.put("Pancake", 25.0);
    }

    public List<Map.Entry<String , Double>> getListEntry (){
        List<Map.Entry<String , Double>> list = new ArrayList<>();
        list.addAll(priceOfGoods.entrySet());
        return list;
    }



    public String sum(){
        double totalSum = 0;
        for(String key : priceOfGoods.keySet()){
            double price = priceOfGoods.get(key);
                double count= counts.get(key);
            double sum = price * count;
            totalSum += sum;
            setTotalSum(totalSum);
            System.out.println(key+" $"+sum);
        }
        return "\nIncome: $"+getTotalSum();
    }



    public LinkedHashMap<String, Double> getCounts() {
        return counts;
    }

    public void setCounts(LinkedHashMap<String, Double> counts) {
        this.counts = counts;
    }

    public HashMap<String, Double> getPriceOfGoods() {
        return priceOfGoods;
    }

    public void setPriceOfGoods(LinkedHashMap<String, Double> priceOfGoods) {
        this.priceOfGoods = priceOfGoods;
    }

    public double getTotalSum() {
        return totalSum;
    }
    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }
}
