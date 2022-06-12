package net.canaparro.graphql.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class CustomerApiStub implements CustomerApi {

	private final Map<Long, Customer> customerDatabase = new HashMap<>();

	public CustomerApiStub() {
		customerDatabase.put( 1L, new Customer( 1L, "John" ) );
		customerDatabase.put( 2L, new Customer( 2L, "Bob" ) );
		customerDatabase.put( 3L, new Customer( 3L, "William" ) );
		customerDatabase.put( 4L, new Customer( 4L, "Nicole" ) );
	}

	@Override
	public Customer getCustomer( final Long customerId ) {
		return customerDatabase.get( customerId );
	}

	@Override
	public List<Customer> getAllCustomers() {
		return List.copyOf( customerDatabase.values() );
	}

	@Override
	public Customer createOrUpdateCustomer( final Customer customer ) {
		if ( customer.getId() == null ) {
			customer.setId( (long) customerDatabase.size() + 1 );
		}
		customerDatabase.put( customer.getId(), customer );
		return customer;
	}
}
