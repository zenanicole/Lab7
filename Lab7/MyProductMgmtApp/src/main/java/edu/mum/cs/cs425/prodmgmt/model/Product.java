package edu.mum.cs.cs425.prodmgmt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    private long pid;
    private long productNumber;
    private String name;
    private double unitPrice;
    private LocalDate dateMfd;

    public Product() {}

    public Product(long pid, long productNumber, String name, double unitPrice, LocalDate dateMfd) {
        this.pid = pid;
        this.productNumber = productNumber;
        this.name = name;
        this.unitPrice = unitPrice;
        this.dateMfd = dateMfd;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(long productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDate getDateMfd() {
        return dateMfd;
    }

    public void setDateMfd(LocalDate dateMfd) {
        this.dateMfd = dateMfd;
    }
}
