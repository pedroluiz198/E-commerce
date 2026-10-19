package com.devsuperior.dscommerce.entities;

import jakarta.persistence.*;

import java.time.Instant;
@Entity
@Table(name = "tb_payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant momemnt;

    @OneToOne
    @MapsId
    private Order order;

    public Payment(Long id, Instant momemnt, Order order) {
        this.id = id;
        this.momemnt = momemnt;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMomemnt() {
        return momemnt;
    }

    public void setMomemnt(Instant momemnt) {
        this.momemnt = momemnt;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment(){

    }
}
