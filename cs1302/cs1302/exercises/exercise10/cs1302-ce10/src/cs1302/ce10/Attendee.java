package cs1302.ce10;

/**
 * Represents a student. Each student has an associated ID, name, and GPA.
 */
public class Attendee {

    private int id;
    private String name;

    /**
     * Constructs a {@code Student} object.
     *
     * @param id the specified ID.
     * @param name the specified name
     * @param gpa the specified GPA
     * @throws IllegalArgumentException if {@code id} is out of bounds
     *         {@code (id < 0 || id > 999_999_999)}.
     * @throws NullPointerException if {@code name} is {@code null}.
     * @throws IllegalArgumentException if {@code name} is empty.
     */
    public Attendee(int id,
                   String name,
                   ) {
        setName(name);
        setId(id);
    } // Attendee

    /**
     * Returns the ID.
     *
     * @return the ID
     */
    public int getId() {
        return id;
    } // getId

    /**
     * Sets the ID.
     *
     * @param id the specified ID.
     * @throws IllegalArgumentException if {@code id} is out of bounds
     *         {@code (id < 0 || id > 999_999_999)}.
     */
    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("id cannot be negative");
        } else if (id > 999_999_999) {
            throw new IllegalArgumentException("id cannot exceed nine digits");
        } // if
        this.id = id;
    } // setId

    /**
     * Returns the name.
     *
     * @return the name.
     */
    public String getName() {
        return name;
    } // getName

    /**
     * Sets the name.
     *
     * @param name the specified name
     * @throws NullPointerException if {@code name} is {@code null}.
     * @throws IllegalArgumentException if {@code name} is empty.
     */
    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("name cannot be null");
        } else if (name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be empty string");
        } // if
        this.name = name;
    } // setName

} // Student
