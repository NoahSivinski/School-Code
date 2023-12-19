package cs1302.generics;

/**
 * Class that represents a shipping container.
 * @param ContentType type of contents
 */
public class ShippingContainer <ContentType> {

    private ContentType contents;
    private double weight;

    /**
     * Constructor.
     * @param contents type of contents
     * @param weight weight of contents
     */
    public ShippingContainer(ContentType contents, double weight) {
        setWeight(weight);
        setContents(contents);
    } //ShippingContainer

    /**
     * Sets weight.
     * @param weight weight of contents
     */
    public void setWeight(double weight) {
        if (weight > 0.0) {
            this.weight = weight;
        } else {
            this.weight = 1.0;
        } //is-else
    } //setWeight

    /**
     * Sets contents.
     * @param contents type of contents
     */
    public void setContents(ContentType contents) {
        this.contents = contents;
    } //setContents

    /**
     * Gets weight.
     * @return weight
     */
    public double getWeight() {
        return weight;
    } //getWeight

    /**
     * Gets contents.
     * @return contents
     */
    public ContentType getContents() {
        return contents;
    } //getContents

} //ShippingContainer
