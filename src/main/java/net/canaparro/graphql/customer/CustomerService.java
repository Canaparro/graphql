package net.canaparro.graphql.customer;

import java.util.List;

public interface CustomerService {

	List<Customer> getCustomers();

	Customer getCustomerById(Long id);

	Customer createOrUpdateCustomer( Customer customer );
}
