package com.project.ecommerce.vo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.project.ecommerce.dto.OrderItemDto;
import com.project.ecommerce.dto.UserDto;
import com.project.ecommerce.entitiy.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Slf4j
public class OrderDetailVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long orderId;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate orderDate;

    private double totalPrice;

    private UserDto user;

    private Status status;

    private Address address;

    public OrderDetailVo(Order order) {
        this.orderId = order.getId();
        this.orderDate = order.getOrderDate();
        this.totalPrice = order.getTotalPrice();
        this.status = order.getStatus();
        this.user = new UserDto(order.getUser());
        this.address = order.getAddress();
    }

}
