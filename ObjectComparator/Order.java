
package ObjectComparator;

import java.util.Objects;

public class Order implements Comparable<Order> {
    private String ID;
    private String customerID;
    private String campus;
    private String status;
    private double amountPaid;

    // Constructor
    public Order(String ID, String customerID, String campus, String status, double amountPaid) {
        this.ID = ID;
        this.customerID = customerID;
        this.campus = campus;
        this.status = status;
        this.amountPaid = amountPaid;
    }

    // Getters and Setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return ID.equals(order.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public int compareTo(Order o) {
        return this.ID.compareTo(o.ID);
    }
}