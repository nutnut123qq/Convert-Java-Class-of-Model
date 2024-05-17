
package ObjectComparator;
 
import java.util.Objects; 

public class Course implements Comparable<Course> {
    private String ID;
    private String name;
    private String mentor;
    private String term;
    private double price;
    private String category;
    private String description;
    private int rating;

    // Constructor
    public Course(String ID, String name, String mentor, String term, double price, String category, String description, int rating) {
        this.ID = ID;
        this.name = name;
        this.mentor = mentor;
        this.term = term;
        this.price = price;
        this.category = category;
        this.description = description;
        this.rating = rating;
    }

    // Getters and Setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return ID.equals(course.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public int compareTo(Course o) {
        return this.ID.compareTo(o.ID);
    }
}
