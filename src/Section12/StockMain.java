package Section12;

import java.util.Map;

public class StockMain {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 3.12, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 5.3, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 10.23, 63);
        stockList.addStock(temp);

        temp = new StockItem("cup", 50.1, 31);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.15, 7);
        stockList.addStock(temp);

        temp = new StockItem("juice", 23.12, 8);
        stockList.addStock(temp);

        temp = new StockItem("door", 213.51, 52);
        stockList.addStock(temp);

        temp = new StockItem("phone", 15.12, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 86.00, 12);
        stockList.addStock(temp);

        temp = new StockItem("vase", 24.61, 75);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket haisBasket = new Basket("hai");

        sellItems(haisBasket, "car", 1);
        System.out.println(haisBasket);

        sellItems(haisBasket, "car", 1);
        System.out.println(haisBasket);

        sellItems(haisBasket, "car", 1);
        System.out.println(haisBasket);

        if (sellItems(haisBasket, "car", 1) != 1) {
            System.out.println("there are no more car in stock");
        }
        sellItems(haisBasket, "spanner", 5);
        System.out.println(haisBasket);

        sellItems(haisBasket, "juice", 4);
        sellItems(haisBasket, "cup", 12);
        sellItems(haisBasket, "bread", 3);

//        System.out.println(haisBasket);
//        System.out.println(stockList);

        Basket basket = new Basket("customer");
        sellItems(basket, "cup", 100);
        sellItems(basket, "juice", 5);
        sellItems(basket, "cup", 1);
        System.out.println(basket);

        removeItem(haisBasket, "car", 1);
        removeItem(haisBasket, "cup", 9);
        removeItem(haisBasket, "car", 1);

        System.out.println("cars removed " + removeItem(haisBasket, "car", 1));
        System.out.println(haisBasket);

        removeItem(haisBasket, "bread", 1);
        removeItem(haisBasket, "cup", 3);
        removeItem(haisBasket, "juice", 4);
        removeItem(haisBasket, "cup", 3);

        System.out.println(haisBasket);
        System.out.println("\n display stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);


//        temp = new StockItem("pen",1.12);
//        stockList.Items().put(temp.getName(),temp);

        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);
//        for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
//            System.out.println(price.getKey() + " cost " + price.getValue());
//        }
        checkOut(haisBasket);
        System.out.println(haisBasket);
    }

    public static int sellItems(Basket basket, String item, int quantity) {
        //retrieve item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("we dont sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        //retrieve item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("we dont sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }

}
