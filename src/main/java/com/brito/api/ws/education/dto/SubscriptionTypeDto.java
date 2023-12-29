package com.brito.api.ws.education.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionTypeDto {

    private Long id;

    @NotBlank(message = "O campo name não pode ser nulo ou vazio")
    @Size(min = 5, max = 30, message = "O campo name deve ter entre 5 a 30")
    private String name;

    @Max(value = 12, message = "O campo accessMonths não pode ser maior do que 12")
    private Long accessMonths;

    @NotNull(message = "O campo price não pode ser nulo")
    private BigDecimal price;

    @NotBlank(message = "O campo productKey não pode ser nulo ou vazio")
    @Size(min = 5, max = 15, message = "O campo productKey deve ter entre 5 a 15")
    private String productKey;
}
