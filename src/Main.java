import model.store.DataStore;
import model.store.FinanceDataStore;
import model.user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        DataStore ds = new FinanceDataStore();
        ds.addUser(createUser());
        ds.addUser(createUser());
        ds.getUserNames().forEach(System.out::println);
    }

    public User createUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the name of the user: ");
        User user = new User(scanner.nextLine());
        System.out.printf("Enter the password for %s:  ", user.getName());
        user.setPassword(scanner.nextLine());
        return user;
    }
}
