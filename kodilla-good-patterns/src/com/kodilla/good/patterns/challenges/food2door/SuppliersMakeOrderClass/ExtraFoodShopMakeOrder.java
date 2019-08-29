package com.kodilla.good.patterns.challenges.food2door.SuppliersMakeOrderClass;

import com.kodilla.good.patterns.challenges.food2door.Interfaces.MakeOrder;
import com.kodilla.good.patterns.challenges.food2door.Objects.OrderedProduct;
import com.kodilla.good.patterns.challenges.food2door.Objects.Supplier;

public class ExtraFoodShopMakeOrder implements MakeOrder {
    Supplier supplier;

    public ExtraFoodShopMakeOrder() {

    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public boolean getInfo(OrderedProduct orderedProduct, OrderedProduct product) {
        System.out.println("Extra Food Shop info received.");
        return true;
    }

    @Override
    public boolean orderProcess(Supplier supplier) {
        System.out.println("Extra Food Shop order made by mail.");
        return true;
    }

    @Override
    public boolean checkOrderStatus(Supplier supplier, OrderedProduct orderedProduct) {
        System.out.println("Extra Food Shop order delivered by bicycle!");return true;
    }
}
