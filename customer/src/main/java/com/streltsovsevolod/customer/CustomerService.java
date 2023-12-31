package com.streltsovsevolod.customer;

public record CustomerService() {
    public void register(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder().
                firstName(request.firstName()).
                lastName(request.lastName()).
                email(request.email()).
                build();

        //todo: check if email valid
        //todo: check if email not taken
        //todo: store customer in db
    }
}
