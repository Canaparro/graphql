package net.canaparro.graphql.customer;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceStub implements CustomerService {

	private final CustomerApi customerApi;

	public CustomerServiceStub( final CustomerApi customerApi ) {this.customerApi = customerApi;}

	@Override
	public List<Customer> getCustomers() {
		return customerApi.getAllCustomers();
	}

	@Override
	public Customer getCustomerById( final Long id ) {
		return customerApi.getCustomer( id );
	}

	@Override
	public Customer createOrUpdateCustomer( final Customer customer ) {
		return customerApi.createOrUpdateCustomer( customer );
	}
}
