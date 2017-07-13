package com.tomar.packets;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * Created by tomar on 13/07/17.
 */
public class Account {
    public Account(Double balance, Double fixedDeposit) {
        this.balance = balance;
        this.fixedDeposit = fixedDeposit;
    }

    private Double balance;
    private Double fixedDeposit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Objects.equal(balance, account.balance) &&
                Objects.equal(fixedDeposit, account.fixedDeposit);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(balance, fixedDeposit);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("balance", balance)
                .add("fixedDeposit", fixedDeposit)
                .toString();
    }

    public Double getBalance() {
        return balance;
    }

    public Double getFixedDeposit() {
        return fixedDeposit;
    }
}
