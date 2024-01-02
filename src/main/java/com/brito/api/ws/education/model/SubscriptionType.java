package com.brito.api.ws.education.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "subscriptions_type")
public class SubscriptionType extends RepresentationModel<SubscriptionType> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscriptions_type_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "access_months")
    private Long accessMonths;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "product_key", unique = true)
    private String productKey;
}
