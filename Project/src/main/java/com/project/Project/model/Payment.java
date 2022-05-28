package com.project.Project.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "payment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    @Column(name = "paymentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @NotNull
    @Size(max = 65)
    @Column(name = "cardholderFirstName")
    private String cardholderFirstName;

    @NotNull
    @Size(max = 65)
    @Column(name = "cardholderLastName")
    private String cardholderLastName;

    @NotNull
    @Column(name = "cardNumber")
    private Long cardNumber;

    @NotNull
    @Column(name = "securityCode")
    private Integer securityCode;

    @Temporal(TemporalType.DATE)
    @Column(name="orderDate")
    private Date orderDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "payementType")
    private PaymentType paymentType;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
}