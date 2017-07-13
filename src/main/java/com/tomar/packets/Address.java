package com.tomar.packets;

/**
 * Created by tomar on 13/07/17.
 */
public class Address {
    private String street;
    private String houseNo;
    private String society;
    private String district;
    private String state;
    private String country;
    private String pincode;

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("street", street)
                .add("houseNo", houseNo)
                .add("society", society)
                .add("district", district)
                .add("state", state)
                .add("country", country)
                .add("pincode", pincode)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return com.google.common.base.Objects.equal(street, address.street) &&
                com.google.common.base.Objects.equal(houseNo, address.houseNo) &&
                com.google.common.base.Objects.equal(society, address.society) &&
                com.google.common.base.Objects.equal(district, address.district) &&
                com.google.common.base.Objects.equal(state, address.state) &&
                com.google.common.base.Objects.equal(country, address.country) &&
                com.google.common.base.Objects.equal(pincode, address.pincode);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(street, houseNo, society, district, state, country, pincode);
    }

    public Address(String street, String houseNo, String society, String district, String state, String country, String pincode) {
        this.street = street;
        this.houseNo = houseNo;
        this.society = society;
        this.district = district;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getSociety() {
        return society;
    }

    public String getDistrict() {
        return district;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getPincode() {
        return pincode;
    }
}
