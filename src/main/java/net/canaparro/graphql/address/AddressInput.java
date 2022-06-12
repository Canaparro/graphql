package net.canaparro.graphql.address;

public record AddressInput(Long id, Long customerId, String street, int number) {}
