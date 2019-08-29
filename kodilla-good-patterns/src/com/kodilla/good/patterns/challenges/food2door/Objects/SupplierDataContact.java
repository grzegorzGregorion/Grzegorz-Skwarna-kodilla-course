package com.kodilla.good.patterns.challenges.food2door.Objects;

public class SupplierDataContact {
    String mailAddress;
    int phoneNumber;
    String webAddress;

    public SupplierDataContact(String mailAddress, int phoneNumber, String webAddress) {
        this.mailAddress = mailAddress;
        this.phoneNumber = phoneNumber;
        this.webAddress = webAddress;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getWebAddress() {
        return webAddress;
    }
}
