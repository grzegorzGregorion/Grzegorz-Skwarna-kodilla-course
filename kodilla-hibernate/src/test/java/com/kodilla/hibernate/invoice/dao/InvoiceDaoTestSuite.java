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
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;
    private static final String PRODUCT_NAME = "FIRST PRODUCT";

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("DE-234");
        Product product = new Product(PRODUCT_NAME);
        Product product2 = new Product("SECOND PRODUCT");
        Item item = new Item(new BigDecimal(23), 32);
        Item item2 = new Item(new BigDecimal(23), 65);
        Item item3 = new Item(new BigDecimal(56), 2);

        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product2);

        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(product);
        productDao.save(product2);
        invoiceDao.save(invoice);
        itemDao.save(item);
        itemDao.save(item2);

        //Then
        int id = invoice.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(id);
        Assert.assertTrue(readInvoice.isPresent());

        //CleanUp
        productDao.deleteAll();
        itemDao.deleteAll();
        invoiceDao.deleteAll();
    }

//    @Test
//    public void testProductDaoSave() {
//        //Given
//        Product product = new Product(PRODUCT_NAME);
//
//        //When
//        productDao.save(product);
//        //Then
//        int id = product.getId();
//        Optional<Product> readProduct = productDao.findById(id);
//        Assert.assertTrue(readProduct.isPresent());
//
//        //CleanUp
//        productDao.deleteById(id);
//    }
//
//    @Test
//    public void testItemDaoSave() {
//        //Given
//        Item item = new Item(new BigDecimal(235), 32);
//        Product product = new Product(PRODUCT_NAME);
//        item.setProduct(product);
//
//        //When
//        productDao.save(product);
//        itemDao.save(item);
//
//        //Then
//        int id = item.getId();
//        Optional<Item> readItem = itemDao.findById(id);
//        Assert.assertTrue(readItem.isPresent());
//
//        //CleanUp
//        itemDao.deleteById(id);
//    }
//
//    @Test
//    public void testItemDaoSaveWithProduct() {
//        //Given
//        Product product = new Product(PRODUCT_NAME);
//        Product product2 = new Product("Second product");
//        Item item = new Item(new BigDecimal(23), 32);
//        Item item2 = new Item(new BigDecimal(23), 65);
//        Invoice invoice = new Invoice("DE-354");
//        item.setProduct(product);
//        item.setProduct(product2);
//        item2.setProduct(product);
//
//        //When
//        productDao.save(product);
//        productDao.save(product2);
//        itemDao.save(item);
//        itemDao.save(item2);
//
//        //Then
//        int id = item.getId();
//        Optional<Item> readItem = itemDao.findById(id);
//        Assert.assertTrue(readItem.isPresent());
//
//        //CleanUp
//        itemDao.deleteAll();
//    }
}
