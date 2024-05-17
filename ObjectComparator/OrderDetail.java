
package ObjectComparator;

import java.util.Objects;

public class OrderDetail implements Comparable<OrderDetail> {
    private String ID;
    private String orderID;
    private String courseID;
    private int quantity;
    private double discount;
    private double price;
    private double totalAmount;

    // Constructor
    public OrderDetail(String ID, String orderID, String courseID, int quantity, double discount, double price, double totalAmount) {
        this.ID = ID;
        this.orderID = orderID;
        this.courseID = courseID;
        this.quantity = quantity;
        this.discount = discount;
        this.price = price;
        this.totalAmount = totalAmount;
    }

    // Getters and Setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetail that = (OrderDetail) o;
        return ID.equals(that.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public int compareTo(OrderDetail o) {
        return this.ID.compareTo(o.ID);
    }
}