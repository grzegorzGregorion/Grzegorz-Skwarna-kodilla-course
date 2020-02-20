package com.kodilla.patterns2.facade.api;

public class ItemDto {
    private final Long productId;
    private final double Qty;

    public ItemDto(Long productId, double qty) {
        this.productId = productId;
        Qty = qty;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQty() {
        return Qty;
    }
}
