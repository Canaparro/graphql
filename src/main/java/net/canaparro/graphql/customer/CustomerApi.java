package net.canaparro.graphql.customer;

import java.util.List;

public interface CustomerApi {

	Customer getCustomer(Long customerId);

	List<Customer> getAllCustomers();

	Customer createOrUpdateCustomer( Customer customer );

}
