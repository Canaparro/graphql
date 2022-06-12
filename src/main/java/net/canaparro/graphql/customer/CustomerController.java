package net.canaparro.graphql.customer;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

	private final CustomerService customerService;

	public CustomerController(
			final CustomerService customerService ) {this.customerService = customerService;}

	@QueryMapping
	public List<Customer> customers() {
		return customerService.getCustomers();
	}


	@QueryMapping
	public Customer customerById( @Argument Long id ) {
		return customerService.getCustomerById( id );
	}

	@MutationMapping
	public Customer createOrUpdateCustomer(@Argument CustomerInput customerInput) {
		Customer customer = new Customer(customerInput.id(), customerInput.name());
		return customerService.createOrUpdateCustomer( customer );
	}
}

