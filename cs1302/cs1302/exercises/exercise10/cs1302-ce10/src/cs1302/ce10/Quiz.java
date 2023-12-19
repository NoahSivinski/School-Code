package cs1302.ce10;

/**
 * Represents a quiz in the cs1302 mock eLC application.
 *
 * @author Brad Barnes
 * @version 1.0; Feb 9 2019
 */
public class Quiz {

    /** Time (in minutes) students have to complete the quiz. */
    private int timeLimit;
    /** Total point value for this quiz. */
    private int points;
    /** Indicates if this is a bonus quiz. */
    private boolean bonus;
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
     * Updates the time limit for this quiz.
     *
     * @param limit the new time limit.
     * @throws IllegalArgumentException if {@code limit} is negative.
     */
    public void setTimeLimit(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("setTimeLimit: " +
                                               "Invalid time limit");
        } // if
        this.timeLimit = limit;
    } // setDueDate

    /**
     * Returns the time limit for this quiz.
     *
     * @return the time limit for this {@code Quiz}.
     */
    public int getDueDate() {
        return this.timeLimit;
    } // getDueDate

    /**
     * Returns the number of points associated with this quiz.
     *
     * @return the points associated with this {@code Quiz} object.
     */
    public int getPoints() {
        return points;
    } // getPoints

    /**
     * Throws a {@code NullPointerException} if any values in the
     * varargs parameter, {@code o} are {@code null}. The
     * method performs no actions if all values in {@code o}
     * are non-null.
     *
     * @param method the name of the calling method.
     * @param o varargs parameter containing all objects to verify
     * @throws NullPointerException if any element of parameter
     * {@code o} is null.
     */
    private void nullCheck(String method, Object ... o) {
        for (Object obj: o) {
            if (o == null) {
                throw new NullPointerException(method +
                                               ": Null Argument Provided");
            } // if
        } // for
    } // nullCheck

} // Quiz
