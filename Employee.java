public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public String streetAddress;
    public String city;
    public String state;
    public String zip;
    public String email;
    public String phoneNumber;

    public Employee(int id, String firstName, String lastName, String streetAddress, String city, String state, String zip, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName + ", Address: " + streetAddress + ", " + city + ", " + state + " " + zip + ", Email: " + email + ", Phone Number: " + phoneNumber;
    }
}

//This file defines the Employee class, which represents a single employee record.
//It has fields for all the data that we want to store, as well as a constructor and
//a toString() method for easy printing.