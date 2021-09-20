import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("cappucino", 5.5);
        Item item2 = new Item("Mocha", 6.5);
        Item item3 = new Item("Latte", 4.5);
        Item item4 = new Item("Drip Coffee", 5.0);
    
        // Order variables -- order1, order2 etc.
        ArrayList<Item> items1 = new ArrayList<Item>();
        items1.add(item1);
        items1.add(item2);
        Order order1 = new Order();
        order1.setName("Cindhuri");
        order1.setReady(false);
        order1.setItems(items1);
        order1.setTotal(items1);
        ArrayList<Item> items2 = new ArrayList<Item>();
        items2.add(item4);
        items2.add(item3);
        Order order2 = new Order("Jimmy", false, items2);
        ArrayList<Item> items3 = new ArrayList<Item>();
        items3.add(item2);
        items3.add(item4);
        Order order3 = new Order("Noah", false, items3);
        ArrayList<Item> items4 = new ArrayList<Item>();
        items4.add(item3);
        Order order4 = new Order("Sam", false, items4);
        // Application Simulations
        items2.add(item1);
        order2.setTotal(items2);

        items3.add(item1);
        order3.setTotal(items3);

        items4.add(item3);
        order3.setTotal(items4);

        order1.setReady(true);

        items4.add(item3);
        items4.add(item3);
        order4.setTotal(items4);

        order2.setReady(true);

        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}

