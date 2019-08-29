package com.kodilla.good.patterns.challenges.food2door.Objects;

import com.kodilla.good.patterns.challenges.food2door.Objects.SupplierAddress;
import com.kodilla.good.patterns.challenges.food2door.Objects.SupplierDataContact;

public class Supplier {
    String supplierName;
    SupplierAddress supplierAddress;
    SupplierDataContact supplierDataContact;

    public Supplier(String supplierName, SupplierAddress supplierAddress, SupplierDataContact supplierDataContact) {
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.supplierDataContact = supplierDataContact;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public SupplierAddress getSupplierAddress() {
        return supplierAddress;
    }

    public SupplierDataContact getSupplierDataContact() {
        return supplierDataContact;
    }
}
