package com.kodilla.good.patterns.challenges.food2door.SuppliersMakeOrderClass;

import com.kodilla.good.patterns.challenges.food2door.Interfaces.MakeOrder;
import com.kodilla.good.patterns.challenges.food2door.Objects.OrderedProduct;
import com.kodilla.good.patterns.challenges.food2door.Objects.Supplier;

public class HealthyFoodShopMakeOrder implements MakeOrder {
    Supplier supplier;

    public HealthyFoodShopMakeOrder() {
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public boolean getInfo(OrderedProduct orderedProduct, OrderedProduct product) {
        System.out.println("Healthy Food Shop info got immediately.");
        return true;
    }

    @Override
    public boolean orderProcess(Supplier supplier) {
        System.out.println("Healthy Food Shop order made by internet web form.");
        return true;
    }

    @Override
    public boolean checkOrderStatus(Supplier supplier, OrderedProduct orderedProduct) {
        System.out.println("Healthy Food Shop order delivered by car!");return true;
    }
}
