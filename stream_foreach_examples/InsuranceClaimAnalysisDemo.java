import java.util.*;
import java.util.stream.Collectors;

class Claim {
    private String type;
    private double amount;
    public Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    public String getType() { return type; }
    public double getAmount() { return amount; }
}

public class InsuranceClaimAnalysisDemo {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 5000),
            new Claim("Car", 2000),
            new Claim("Health", 3000),
            new Claim("Car", 4000)
        );

        Map<String, Double> avgByType = claims.stream()
            .collect(Collectors.groupingBy(
                Claim::getType,
                Collectors.averagingDouble(Claim::getAmount)
            ));

        avgByType.forEach((type, avg) -> System.out.println(type + " -> " + avg));
    }
}
