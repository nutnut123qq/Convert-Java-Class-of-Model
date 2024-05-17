
package ObjectComparator;

import java.util.Objects; 

public class Mentor implements Comparable<Mentor> {
    private String ID;
    private String fullName;
    private String dateOfBirth;
    private String info;

    // Constructor
    public Mentor(String ID, String fullName, String dateOfBirth, String info) {
        this.ID = ID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.info = info;
    }

    // Getters and Setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentor mentor = (Mentor) o;
        return ID.equals(mentor.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public int compareTo(Mentor o) {
        return this.ID.compareTo(o.ID);
    }
}
