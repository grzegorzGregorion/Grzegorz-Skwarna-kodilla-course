package com.kodilla.stream.invoice.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SimpleInvoice {
    private final List<SimpleItem> theItemList = new ArrayList<>();

    public void addItem(SimpleItem item) {
        theItemList.add(item);
    }

    public boolean removeItem(SimpleItem item) {
        return theItemList.remove(item);
    }

    public double getValueToPay(){
        return theItemList.stream()
            .collect(Collectors.summingDouble(SimpleItem::getValue));
    }
}
