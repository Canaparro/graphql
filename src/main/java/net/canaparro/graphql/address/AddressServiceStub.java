package net.canaparro.graphql.address;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import net.canaparro.graphql.customer.Customer;

@Service
public class AddressServiceStub implements AddressService {

	private final AddressApi addressApi;

	public AddressServiceStub( final AddressApi addressApi ) {this.addressApi = addressApi;}

	@Override
	public Map<Customer, Address> getCustomerAddresses( final List<Customer> customers ) {

		Set<Long> customerIds = customers.stream()
				.map( Customer::getId )
				.collect( Collectors.toSet() );

		Map<Long, Address> addressByCustomerId = addressApi.getAddressesByCutsomerId( customerIds );

		return customers.stream()
				.collect( HashMap::new, ( map, customer ) -> map.put( customer,
						addressByCustomerId.get( customer.getId() ) ), HashMap::putAll );
	}

	@Override
	public Address createOrUpdateAddress( final Address address ) {
		return addressApi.createOrUpdateAddress( address );
	}
}
