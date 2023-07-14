package com.streltsovsevolod.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
