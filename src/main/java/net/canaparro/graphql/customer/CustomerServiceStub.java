package net.canaparro.graphql.customer;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceStub implements CustomerService {

	private final Map<Long, Customer> customerMap = Map.of( 1L, new Customer( 1L, "John" ), 2L,
			new Customer( 2L, "Bob" ) );

	@Override
	public List<Customer> getCustomers() {
		return List.copyOf( customerMap.values() );
	}

	@Override
	public Customer getCustomerById( final Long id ) {
		return customerMap.get( id );
	}
}
