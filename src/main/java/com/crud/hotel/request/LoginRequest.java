package com.crud.hotel.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Asish Sutar
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
