package com.food.ordering.system.order.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

public class OrderDomainExeption extends DomainException {
    public OrderDomainExeption(String message) {
        super(message);
    }

    public OrderDomainExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
