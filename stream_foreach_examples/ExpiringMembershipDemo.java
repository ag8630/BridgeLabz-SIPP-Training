import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Member {
    private String name;
    private LocalDate expiryDate;
    public Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
    public LocalDate getExpiryDate() { return expiryDate; }
    @Override public String toString() {
        return name + " expires on " + expiryDate;
    }
}

public class ExpiringMembershipDemo {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Alice", LocalDate.now().plusDays(10)),
            new Member("Bob", LocalDate.now().plusDays(45)),
            new Member("Charlie", LocalDate.now().plusDays(25))
        );

        LocalDate now = LocalDate.now();
        members.stream()
            .filter(m -> !m.getExpiryDate().isBefore(now) &&
                         m.getExpiryDate().isBefore(now.plusDays(30)))
            .forEach(System.out::println);
    }
}
