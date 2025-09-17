import java.time.LocalDateTime;
import java.util.*;

public class ForEachExamplesDemo {
    public static void main(String[] args) {
        // 1. Stock Price Logger
        List<Double> stockPrices = Arrays.asList(100.5, 101.2, 99.8);
        stockPrices.forEach(price -> System.out.println("Stock Price: " + price));

        // 2. Event Attendee Welcome Message
        List<String> attendees = Arrays.asList("Alice", "Bob", "Charlie");
        attendees.forEach(name -> System.out.println("Welcome " + name + "!"));

        // 3. IoT Sensor Readings above threshold
        List<Integer> readings = Arrays.asList(20, 35, 50, 15);
        readings.stream()
            .filter(r -> r > 30)
            .forEach(r -> System.out.println("High Reading: " + r));

        // 4. Email Notifications
        List<String> emails = Arrays.asList("a@test.com", "b@test.com");
        emails.forEach(email -> System.out.println("Sending email to " + email));

        // 5. Logging Transactions
        List<String> transactionIds = Arrays.asList("TX123", "TX456");
        transactionIds.forEach(id ->
            System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}
