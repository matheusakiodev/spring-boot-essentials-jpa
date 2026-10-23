package br.com.matheusakio.spring_boot_essentials_jpa.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ErrorResponse {

    private String message;
    private Integer status;
}
