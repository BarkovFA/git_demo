package task5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Table", 500.5);
        Item item2 = new Item("Mouse", 500.5);
        Bill bill1 = new Bill(item1, 3);
        Bill bill2 = new Bill(item2, 2);
        System.out.println("Price without sale: " + bill1.getCost());
        DiscountBill discountBill = new DiscountBill(5);
        discountBill.addItem(item1, 12);
        discountBill.addItem(item2, 2);
        System.out.println("Sale, % : " + discountBill.getDiscount());
        System.out.println("Total price without sale: " + discountBill.getCost());
    }
}


class Item {
    public String name;
    public double price;

    public Item (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Bill {
    public Map <Item, Integer> items;

    public Bill(Item item1, int i) {
        this.items = new HashMap<>();
    }
    //add things in list
    public void addItem(Item item, int cost) {
        items.put(item, items.getOrDefault(item, 0) + cost);
    }
    //all price
    public double getCost() {
        double totalPrice = 0.0;
        for(Map.Entry<Item, Integer> entry: items.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
        return totalPrice;
    }

    public Map<Item, Integer> getItems() {
        return items;
    }
}

class DiscountBill extends Bill{
    private double discount;

    public DiscountBill(double discount) {
        super();
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public double getCost() {
        double totalNotDisc = super.getCost();
        double totalDic = totalNotDisc*(discount/100);
        double lastPrice = totalNotDisc - totalDic;
        return lastPrice;
    }

    public double getDisc() {
        double totalNotDisc = super.getCost();
        double totalDic = totalNotDisc*(discount/100);
        return totalDic;

    }
}