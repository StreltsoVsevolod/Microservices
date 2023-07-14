package com.streltsovsevolod.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("aoi/v1/customers")
public record CustomerController(CustomerService customerService) {

    @PostMapping
    public void RegisterCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){
        log.info("new customer registration {}", customerRegistrationRequest);
        customerService.register(customerRegistrationRequest);
    }
}
