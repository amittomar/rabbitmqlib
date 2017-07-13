package com.tomar.packets;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.Date;

/**
 * Created by tomar on 13/07/17.
 */
public class Employee {
    private String firstName;
    private  String lastName;
    private Date dob;
    private  Account account;
    private Address address;

    public Employee(String firstName, String lastName, Date dob, Account account, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.account = account;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equal(firstName, employee.firstName) &&
                Objects.equal(lastName, employee.lastName) &&
                Objects.equal(dob, employee.dob) &&
                Objects.equal(account, employee.account) &&
                Objects.equal(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(firstName, lastName, dob, account, address);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("dob", dob)
                .add("account", account)
                .add("address", address)
                .toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDob() {
        return dob;
    }

    public Account getAccount() {
        return account;
    }

    public Address getAddress() {
        return address;
    }
}
