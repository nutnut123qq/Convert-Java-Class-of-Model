
package ObjectComparator;

import java.util.Objects; 

public class Category implements Comparable<Category> {
    private String ID;
    private String name;

    // Constructor
    public Category(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    // Getters and Setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return ID.equals(category.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public int compareTo(Category o) {
        return this.ID.compareTo(o.ID);
    }
}