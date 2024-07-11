package task5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Table", 10.0);
        Item item2 = new Item("Laptop", 100.5);

        Bill bill = new Bill();
        bill.addItem(item1, 5);
        bill.addItem(item2, 10);

        System.out.println("Total without discount: " + bill.getTotal());

        DiscountBill discountBill = new DiscountBill(10);
        discountBill.addItem(item1, 5);
        discountBill.addItem(item2, 10);

        System.out.println("Total with discount: " + discountBill.getTotal());
        System.out.println("Discount amount: " + discountBill.getDiscount());
    }
}


class Item {
    private String name;
    private double price;

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
    private Map <Item, Integer> items;
    private double sum;

    public Bill() {
        this.items = new HashMap<>();
        sum = 0.0;
    }
    //add things in list
    public void addItem(Item item, int cost) {
        items.put(item, items.getOrDefault(item, 0) + cost);
        sum += item.getPrice() * cost;
    }

    public double getTotal() {
        return sum;
    }
    //all price
//    public double getCost() {
//        double totalPrice = 0.0;
//        for(Map.Entry<Item, Integer> entry: items.entrySet()) {
//            totalPrice += entry.getKey().getPrice() * entry.getValue();
//        }
//        return totalPrice;
//    }

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


    public double getCost() {
        return getTotal() * (discount / 100);
    }
    @Override
    public double getTotal() {
        return super.getTotal() - getCost();

    }
}