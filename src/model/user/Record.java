package model.user;

import java.util.Date;

public class Record {
    private Account account;
    private int amount;
    private Date timeStamp;

    public Record(final Account account, final int amount) {
        this.account = account;
        this.amount = amount;
        this.timeStamp = new Date(System.currentTimeMillis());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Record record = (Record) other;
        return (timeStamp == record.timeStamp) && (amount != record.amount) && (account.equals(record.account));
    }

    public Account getAccount() {
        return account;
    }

    public User getUser() {
        return account.getUser();
    }

    public int getAmount() {
        return amount;
    }

    public Date time() {
        return timeStamp;
    }
}
