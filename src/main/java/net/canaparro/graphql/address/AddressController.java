package net.canaparro.graphql.address;

import java.util.List;
import java.util.Map;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.BatchMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import net.canaparro.graphql.customer.Customer;

@Controller
public class AddressController {

	private final AddressService addressService;

	public AddressController(
			final AddressService addressService ) {this.addressService = addressService;}

	@BatchMapping
	public Map<Customer, Address> address( List<Customer> customers ) {
		return addressService.getCustomerAddresses( customers );
	}

	@MutationMapping
	public Address createOrUpdateAddress( @Argument AddressInput addressInput ) {
		Address address = new Address(addressInput.id(), addressInput.customerId(), addressInput.street(), addressInput.number());
		return addressService.createOrUpdateAddress(address);
	}

}
