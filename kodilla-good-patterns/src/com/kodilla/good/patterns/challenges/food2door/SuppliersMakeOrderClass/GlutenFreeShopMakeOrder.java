package com.kodilla.good.patterns.challenges.food2door.SuppliersMakeOrderClass;

import com.kodilla.good.patterns.challenges.food2door.Interfaces.MakeOrder;
import com.kodilla.good.patterns.challenges.food2door.Objects.OrderedProduct;
import com.kodilla.good.patterns.challenges.food2door.Objects.Supplier;

public class GlutenFreeShopMakeOrder implements MakeOrder {
    Supplier supplier;

    public GlutenFreeShopMakeOrder() {
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public boolean getInfo(OrderedProduct orderedProduct, OrderedProduct product) {
        System.out.println("Gluten Free Shop info was delivered.");
        return true;
    }

    @Override
    public boolean orderProcess(Supplier supplier) {
        System.out.println("Gluten Free Shop order made by SMS.");
        return true;
    }

    @Override
    public boolean checkOrderStatus(Supplier supplier, OrderedProduct orderedProduct) {
        System.out.println("Gluten Free Shop order delivered by train!");return true;
    }
}
