package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.Objects.*;
import com.kodilla.good.patterns.challenges.food2door.SuppliersMakeOrderClass.ExtraFoodShopMakeOrder;
import com.kodilla.good.patterns.challenges.food2door.SuppliersMakeOrderClass.GlutenFreeShopMakeOrder;
import com.kodilla.good.patterns.challenges.food2door.SuppliersMakeOrderClass.HealthyFoodShopMakeOrder;

public class OrderRequestRetriever {

//    ExtraFoodShopMakeOrder specificSupplierMakeOrder = new ExtraFoodShopMakeOrder();
//    public OrderRequest retrieve() {
//        SupplierAddress supplierAddress = new SupplierAddress("MainCity", 85743, "MainStreet", 689);
//        SupplierDataContact supplierDataContact = new SupplierDataContact("address@mail.com", 5674872, "www.web.com");
//        Supplier supplier = new Supplier("ExtraFoodShop", supplierAddress, supplierDataContact);
//        OrderedProduct orderedProduct = new OrderedProduct("product_1", 22.5, 56.2, "kg");
//
//        return new OrderRequest(supplier, orderedProduct);
//    }

//    GlutenFreeShopMakeOrder specificSupplierMakeOrder = new GlutenFreeShopMakeOrder();
//    public OrderRequest retrieve() {
//        SupplierAddress supplierAddress = new SupplierAddress("GlutenCity", 85743, "GluteFreeStreet", 689);
//        SupplierDataContact supplierDataContact = new SupplierDataContact("glutenFree@mail.com", 5674872, "www.glutefFree.com");
//        Supplier supplier = new Supplier("GlutenFreeShopMakeOrder", supplierAddress, supplierDataContact);
//        OrderedProduct orderedProduct = new OrderedProduct("product_glutenFree", 225.5, 7.2, "lbs");
//
//        return new OrderRequest(supplier, orderedProduct);
//    }

    HealthyFoodShopMakeOrder specificSupplierMakeOrder = new HealthyFoodShopMakeOrder();
    public OrderRequest retrieve() {
        SupplierAddress supplierAddress = new SupplierAddress("HealthyCity", 85743, "HealthyStreet", 689);
        SupplierDataContact supplierDataContact = new SupplierDataContact("healthyShop@mail.com", 5674872, "www.healthyShop.com");
        Supplier supplier = new Supplier("HealthyFoodShopMakeOrder", supplierAddress, supplierDataContact);
        OrderedProduct orderedProduct = new OrderedProduct("healthyProduct", 894.5, 5665.2, "mg");

        return new OrderRequest(supplier, orderedProduct);
    }
}
