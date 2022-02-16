package com.robert.rivera.customer.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Customer_Table")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_number", nullable = false)
    private Integer customerNumber;
    @Column(name = "customer_name", nullable = false, length = 50)
    private String customerName;
    @Column(name = "customer_mobile", nullable = false, length = 20)
    private String customerMobile;
    @Column(name = "customer_email", nullable = false, length = 50)
    private String customerEmail;
    @Column(name = "address1", nullable = false, length = 100)
    private String address1;
    @Column(name = "address2", length = 100)
    private String address2;
    @Column(name = "account_type")
    @Enumerated(EnumType.STRING)
    private AccountTypes accountType;

}
