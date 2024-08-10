package org.example.dto;

import jakarta.validation.constraints.NotEmpty;

public record AddressDto(

    int addressId,

    @NotEmpty(message = "City is required")
    String city,

    @NotEmpty(message = "State is required")
    String state,

    @NotEmpty(message = "Country is required")
    String country

) {}
