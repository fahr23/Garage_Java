package hello;


import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String addressLine1;

    private String city;

    public Address() {
    }

    public Address(String addressLine1, String city) {
        this.addressLine1 = addressLine1;
        this.city = city;
    }


}
