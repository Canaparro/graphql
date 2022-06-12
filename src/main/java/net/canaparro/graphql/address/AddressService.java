package net.canaparro.graphql.address;

import java.util.List;
import java.util.Map;

import net.canaparro.graphql.customer.Customer;

public interface AddressService {

	Map<Customer, Address> getCustomerAddresses( List<Customer> customers );

	Address createOrUpdateAddress( Address address );
}
