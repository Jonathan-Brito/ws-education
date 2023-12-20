package com.brito.api.ws.education.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "subscriptions_type")
public class SubscriptionType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriptions_type_id")
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "access_months")
    private Long accessMonths;

    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "product_key")
    private String productKey;
}
