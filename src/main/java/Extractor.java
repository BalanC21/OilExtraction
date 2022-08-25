import java.util.UUID;

public abstract class Extractor {
    private final UUID serialNumber;
    private final int capacity;
    private int quantity;

    public Extractor(int capacity, int quantity) {
        serialNumber = UUID.randomUUID();
        this.capacity = capacity;
        this.quantity = quantity;
    }

    public UUID getSerialNumber() {
        return serialNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getProcentage() {
        return (quantity * 100) / capacity;
    }

    @Override
    public String toString() {
        return "Extractor{" +
                "serialNumber=" + serialNumber +
                ", capacity=" + capacity +
                ", quantity=" + quantity +
                '}';
    }
}
