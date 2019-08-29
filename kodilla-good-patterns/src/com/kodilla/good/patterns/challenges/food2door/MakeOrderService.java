package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.Interfaces.MakeOrder;
import com.kodilla.good.patterns.challenges.food2door.Objects.OrderRequest;

public class MakeOrderService {
    private MakeOrder makeOrder;

    public MakeOrderService(final MakeOrder makeOrder) {
        this.makeOrder = makeOrder;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = makeOrder.getInfo(orderRequest.getOrderedProduct(  ), orderRequest.getOrderedProduct());

        if (isOrdered) {
            makeOrder.orderProcess(orderRequest.getSupplier());
            makeOrder.checkOrderStatus(orderRequest.getSupplier(), orderRequest.getOrderedProduct());
            System.out.println("Finished with success!");
            System.out.println("Supplier name " + orderRequest.getSupplier().getSupplierName() +
                    "Supplier address: " + orderRequest.getSupplier().getSupplierAddress().getCity() + " " +
                    orderRequest.getSupplier().getSupplierAddress().getPostalCode() + " " +
                    orderRequest.getSupplier().getSupplierAddress().getStreet() + " " +
                    orderRequest.getSupplier().getSupplierAddress().getNumber() + " " +
                    "Supplier data contact: " + orderRequest.getSupplier().getSupplierDataContact().getMailAddress() + " " +
                    orderRequest.getSupplier().getSupplierDataContact().getWebAddress() + " " +
                    orderRequest.getSupplier().getSupplierDataContact().getPhoneNumber());

            return new OrderDto(orderRequest.getSupplier(), orderRequest.getOrderedProduct());
        } else {
            return new OrderDto(orderRequest.getSupplier(), orderRequest.getOrderedProduct());
        }
    }

}
