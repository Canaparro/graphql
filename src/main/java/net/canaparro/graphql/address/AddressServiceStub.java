package net.canaparro.graphql.address;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class AddressServiceStub implements AddressService {

	private final Map<Long, Address> addressByCustomerIdMap = Map.of( 1L,
			new Address( 1L, 1L, "5th Street", 45 ), 2L, new Address( 2L, 2L, "11th Street", 609 ) );

	@Override
	public Address getAddressByCustomerId( final Long customerId ) {
		return addressByCustomerIdMap.get( customerId );
	}
}
