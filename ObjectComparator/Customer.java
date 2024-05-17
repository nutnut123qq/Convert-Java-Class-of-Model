
package ObjectComparator;

import java.util.Objects; 

public class Customer implements Comparable<Customer> {
    private String ID;
    private String fullName;
    private String campus;
    private String phoneNumber;
    private String email;

    // Constructor
    public Customer(String ID, String fullName, String campus, String phoneNumber, String email) {
        this.ID = ID;
        this.fullName = fullName;
        this.campus = campus;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters and Setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return ID.equals(customer.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public int compareTo(Customer o) {
        return this.ID.compareTo(o.ID);
    }
}
