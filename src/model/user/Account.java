package model.user;

import java.util.HashSet;
import java.util.Set;

public class Account {
    private String number;
    private User user;
    private int amount;
    private Set<Record> records;

    public Account(final String number, final User user) {
        this.number = number;
        this.user = user;
        amount = 0;
        records = new HashSet<>();
    }

    public String getNumber() {
        return number;
    }

    public User getUser() {
        return user;
    }

    public int balance() {
        return amount;
    }

    public boolean withdraw(final int amount) {
        if (this.amount < amount) {
            return false;
        }
        this.amount -= amount;
        return true;
    }

    public void deposit(final int amount) {
        this.amount += amount;
    }


    public Set<Record> getRecords() {
        return records;
    }

    public void addRecord(Record record) {
        records.add(record);
    }

    public Record removeRecord(Record record) {
        return (records.remove(record)) ? record : null;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Account account = (Account) other;
        return (number.equals(account.number));
    }
}
