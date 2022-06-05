package net.canaparro.graphql.address;

import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import net.canaparro.graphql.customer.Customer;

@Controller
public class AddressController {

	private final AddressService addressService;

	public AddressController(
			final AddressService addressService ) {this.addressService = addressService;}

	@SchemaMapping(typeName = "Customer")
	public Address address( Customer customer ) {
		return addressService.getAddressByCustomerId( customer.id() );
	}

}
