package model.user;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String name;
    private String password;
    private Set<Account> accounts;

    public User(final String name) {
        this.name = name;
        accounts = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public boolean doesPasswordMatch(final String password) {
        return password.compareTo(this.password) == 0;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public Account removeAccount(final Account account) {
        return (accounts.remove(account)) ? account : null;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        User user = (User) other;
        return (user.getName().equals(this.name));
    }
}
