package br.com.bank.controller.request;


import br.com.bank.model.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerRequest {

    private String email;
    private String document;
}
