package cs1302.ce10;

/**
 * Represents an assignment in the cs1302 mock eLC application.
 *
 * @author Brad Barnes
 * @version 1.0; Feb 9 2019
 */
public class Assignment {

    /** Course where this quiz is assigned. */
    private Course course;

    /**
     * Constructs a new {@code Quiz} object with the specified
     * arguments.
     *
     * @param points the total points allocated to this quiz.
     * @param bonus indicates if this is a bonus quiz.
     * @param course the course where this quiz is assigned.
     * @param limit the time (in minutes) students have to complete
     * this quiz.
     *
     * @throws IllegalArgumentException if {@code points} or {@code limit}
     * is negative or if {@code course} is {@code null}.
     */
    public Quiz(int points, boolean bonus, Course course,
                int limit) {
        nullCheck("Quiz Constructor", course);

        if (points < 0) {
            throw new IllegalArgumentException("Quiz Constructor: " +
                                               "Invalid quiz point total");
        } // if
        if (limit < 0) {
            throw new IllegalArgumentException("Quiz Constructor: " +
                                               "Invalid time limit");
        } // if
        this.bonus = bonus;
        this.points = points;
        this.course = course;
        this.timeLimit = limit;
    } // Quiz

    /**
     * Modifies the point total associated with this quiz.
     *
     * @param pointValue the new point value.
     * @throws IllegalArgumentException if {@code pointValue}
     * is negative.
     */
    public void setPoints(int pointValue) {
        if (pointValue < 0) {
            throw new IllegalArgumentException("Quiz Constructor: " +
                                               "Invalid quiz point total");
        } // if
        this.points = pointValue;
    } // setPoints

    /**
     * Updates whether or not this quiz is bonus.
     *
     * @param bonus the bonus indicator.
     */
    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    } // setBonus

    /**
     * Returns whether or not this quiz is bonus.
     *
     * @return {@code true} if this {@code Quiz} is bonus and false
     * otherwise.
     */
    public boolean isBonus() {
        return bonus;
    } // isBonus
    /**
     * Returns the course in which this quiz is assigned.
     *
     * @return the {@link cs1302.ce10.Course} that assigned this
     * quiz.
     */
    public Course getCourse() {
        return course;
    } // getCourse

} // Quiz
