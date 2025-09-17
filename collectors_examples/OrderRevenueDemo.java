import java.util.*;
import java.util.stream.Collectors;

class Order {
    private String customer;
    private double total;
    public Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }
    public String getCustomer() { return customer; }
    public double getTotal() { return total; }
}

public class OrderRevenueDemo {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 250.0),
            new Order("Bob", 150.0),
            new Order("Alice", 100.0)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
            .collect(Collectors.groupingBy(
                Order::getCustomer,
                Collectors.summingDouble(Order::getTotal)
            ));

        revenueByCustomer.forEach((cust, total) ->
            System.out.println(cust + " -> " + total)
        );
    }
}
