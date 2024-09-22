package com.cafe.management.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")  // Rename the table to 'orders' to avoid SQL keyword conflict
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "status")
    private String status;

    @Column(name = "total_price")
    private Double totalPrice;

    @ManyToMany
    @JoinTable(
            name = "order_items",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    private List<CafeItem> items;

    // Constructors
    public Order() {
    }

    public Order(String customerName, String status, Double totalPrice, List<CafeItem> items) {
        this.customerName = customerName;
        this.status = status;
        this.totalPrice = totalPrice;
        this.items = items;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<CafeItem> getItems() {
        return items;
    }

    public void setItems(List<CafeItem> items) {
        this.items = items;
    }
}
