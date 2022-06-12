package net.canaparro.graphql.address;

public class Address {

	private Long id;

	private Long customerId;

	private String street;

	private int number;

	public Address() {
	}

	public Address(Long id, Long customerId, String street, int number) {
		this.id = id;
		this.customerId = customerId;
		this.street = street;
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	public void setId( final Long id ) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId( final Long customerId ) {
		this.customerId = customerId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet( final String street ) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber( final int number ) {
		this.number = number;
	}
}
