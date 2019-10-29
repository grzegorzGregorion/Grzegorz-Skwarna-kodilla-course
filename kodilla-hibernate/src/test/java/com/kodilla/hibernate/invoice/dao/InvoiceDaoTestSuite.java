package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("firstProduct");
        Product product2 = new Product("secondProduct");
        Item item = new Item(product, new BigDecimal(25), 47);
        Item item2 = new Item(product2, new BigDecimal(153), 89);
        Invoice invoice = new Invoice();
        invoice.getItems().add(item);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int id = item.getId();
        int id2 = item2.getId();

        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertNotEquals(0, id2);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
