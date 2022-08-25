public abstract class ExtractorWithLocation extends Extractor {
    protected String location;

    public ExtractorWithLocation(int capacity, int quantity, String location) {
        super(capacity, quantity);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
