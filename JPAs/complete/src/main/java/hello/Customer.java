// tag::sample[]
package hello;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name="address1", column = @Column(name = "addressLine1")),
            @AttributeOverride(name="city", column = @Column(name = "city"))
    })
    private Address address;

    protected Customer() {}

    public Customer(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }


    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

    public Address getAddress() {
        return address;
    }
}

