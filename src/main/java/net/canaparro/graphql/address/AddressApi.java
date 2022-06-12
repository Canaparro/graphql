package net.canaparro.graphql.address;

import java.util.Map;
import java.util.Set;

public interface AddressApi {

	Map<Long, Address> getAddressesByCutsomerId( Set<Long> cusomerIds );

	Address createOrUpdateAddress(Address address);

}
