package com.project.Project.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum PaymentMethod {
    CREDIT,
    CRYPTO,
    PAYPAL

   // @NotNull
   // @Enumerated(EnumType.STRING)
    //@Column(name = "paymentMethod")
    //private PaymentMethod paymentMethod;
}