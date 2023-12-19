package cs1302.ce10;

/** 
 * Represents a professor. Each professor has an associated ID, name, and tenure-track status.
 */
public class Professor {

    private int id;
    private String name;
    private boolean tenureTrack;

    /**
     * Constructs a {@code Professor} object.
     *
     * @param id the specified ID.
     * @param name the specified name
     * @param tenureTrack whether or not this {@code Professor}
     *        is tenure track.
     * @throws IllegalArgumentException if {@code id} is out of bounds 
     *         {@code (id < 0 || id > 999_999_999)}.
     * @throws NullPointerException if {@code name} is {@code null}.
     * @throws IllegalArgumentException if {@code name} is empty.
     */
    public Professor(int id,
                     String name,
                     boolean tenureTrack) {
        setName(name);
        setId(id);
        setTenureTrack(tenureTrack);
    } // Professor

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
        checkId(id);
        this.id = id;
    } // setId

    /** 
     * Returns the tenure-track status.
     *
     * @return the tenure-track status
     */
    public boolean isTenureTrack() {
        return tenureTrack;
    } // isTenureTrack

    /** 
     * Sets the tenure-track status.
     * 
     * @param tenureTrack the specified tenure-track status
     */
    public void setTenureTrack(boolean tenureTrack) {
        this.tenureTrack = tenureTrack;
    } // setTenureTrack

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
        checkName(name);
        this.name = name;
    } // setName

    /**
     * Checks the specified {@code name} to ensure it's neither {@code null} nor an empty string.
     *
     * @param name the specified name
     * @throws NullPointerException if {@code name} is {@code null}.
     * @throws IllegalArgumentException if {@code name} is empty.
     */
    private void checkName(String name) {
        if (name == null) {
            throw new NullPointerException("name cannot be null");
        } else if (name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be empty string");
        } // if
    } // checkName

    /** 
     * Checks the specified {@code id} to ensure it's not out of bounds.
     * 
     * @param id the specified ID.
     * @throws IllegalArgumentException if {@code id} is out of bounds 
     *         {@code (id < 0 || id > 999_999_999)}.
     */
    private void checkId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("id cannot be negative");
        } else if (id > 999_999_999) {
            throw new IllegalArgumentException("id cannot exceed nine digits");
        } // if
    } // checkId
    
    /**
     * Saves this {@code Professor} to a database.
     */
    public void save() {
        // please pretend 
        // that there is
        // suficciently fancy code
        // written here
    } // save    
    
} // Professor

