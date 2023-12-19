package cs1302.ce24;

/**
 * DownUp class.
 */
public class DownUp {

    public static void main(String[] args) {
        downUp("Dawgs");
    } //main

    /**
     * This method prints out str, then str with one less letter each time until str has one
     * letter, then prints out str with one more letter each time until str returns to its original
     *  length.
     * @param str string to be manipulated
     */
    public static void downUp(String str) {
        if (str.length() <= 1) {
            System.out.println(str);
        } else {
            System.out.println(str);
            downUp(str.substring(0, str.length() - 1));
            System.out.println(str);
        } //if
    } //downUp

} //DownUp
/* CHECKPOINT 3.2
 *   i. str.length() <= 1
 *  ii. str.length() > 1
 * iii. 5
 */
