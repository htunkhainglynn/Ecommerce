package com.project.ecommerce.dto;

import com.project.ecommerce.entitiy.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDto {
    private Long id;
    private String street;
    private String city;
    private String postalCode;
}
