package net.canaparro.graphql.address;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class AddressApiStub implements AddressApi {

	private final Map<Long, Address> addressDatabase = new HashMap<>();

	public AddressApiStub() {
		this.addressDatabase.put( 1L, new Address( 1L, 1L, "5th Street", 45 ) );
		this.addressDatabase.put( 2L, new Address( 2L, 2L, "11th Street", 609 ) );
		this.addressDatabase.put( 3L, new Address( 3L, 3L, "15th Street", 473 ) );
		this.addressDatabase.put( 4L, new Address( 4L, 4L, "Applegate Street", 59 ) );
	}

	@Override
	public Map<Long, Address> getAddressesByCutsomerId( final Set<Long> customerIds ) {
		return customerIds.stream()
				.collect( HashMap::new, ( map, customerId ) -> map.put( customerId,
						addressDatabase.get( customerId ) ), HashMap::putAll );

	}

	@Override
	public Address createOrUpdateAddress( final Address address ) {
		if ( address.getId() == null ) {
			address.setId( (long) ( this.addressDatabase.size() + 1 ) );
		}
		this.addressDatabase.put( address.getCustomerId(), address );
		return address;
	}
}
