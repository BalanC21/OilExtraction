public class MobileTerrestrial extends ExtractorWithLocation implements ReportFault {
    public MobileTerrestrial(int capacity, int quantity, String location) {
        super(capacity, quantity, location);
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean isFaulty() {
        return super.getQuantity() >= (super.getCapacity() / 100) * 25;

    }
}
