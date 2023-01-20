public class Address {
    private String street;
    private String houseNumber;
    private String postcode;
    private String city;

    public Address(String street, String houseNumber, String postcode, String city) throws Exception{
        this.street = street;
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.city = city;

        if (street == null) {
            throw new NullPointerException("Street cannot be null");
        }
        if(!houseNumber.matches("\\d+[a-zA-Z]*")){
            throw new IllegalArgumentException("House number must consist of a number and possibly a letter");
        }
        if (!postcode.matches("\\d{2}-\\d{3}")) {
            throw new IllegalArgumentException("Postcode must have the format DD-DDD (D is digit)");
        }
        if (city == null) {
            throw new NullPointerException("City cannot be null");
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
