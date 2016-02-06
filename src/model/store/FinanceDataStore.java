package model.store;

import model.user.Account;
import model.user.Record;
import model.user.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FinanceDataStore implements DataStore {
    private Map<String, User> users;

    public FinanceDataStore() {
        this.users = new HashMap<>();
    }

    @Override
    public User getUser(String name) {
        return (users.containsKey(name)) ? users.get(name) : null;
    }

    @Override
    public Set<String> getUserNames() {
        return users.keySet();
    }

    @Override
    public Set<Account> getAccounts(User owner) {
        return owner.getAccounts();
    }

    @Override
    public Set<Record> getRecords(Account account) {
        return account.getRecords();
    }

    @Override
    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    @Override
    public void addAccount(User user, Account account) {
        user.addAccount(account);
    }

    @Override
    public void addRecord(Account account, Record record) {
        account.addRecord(record);
    }

    @Override
    public User removeUser(String name) {
        return users.remove(name);
    }

    @Override
    public Account removeAccount(User owner, Account account) {
        return owner.removeAccount(account);
    }

    @Override
    public Record removeRecord(Account from, Record record) {
        return from.removeRecord(record);
    }
}
