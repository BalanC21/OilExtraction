import java.util.ArrayList;
import java.util.List;

public class OffshorePlatform extends Extractor implements ReportFault {
    public static int FAULT_PERCENTAGE = 70;
    public static int MAX_NUMBER_OF_DAYS = 14;
    private List<Worker> workers;

    public OffshorePlatform(int capacity, int quantity) {
        super(capacity,quantity);
        this.workers = new ArrayList<>();
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    @Override
    public boolean isFaulty() {
        return hasDoctor() && howManyDays() && extractLessThen();
    }

    private boolean hasDoctor() {
        return workers.stream().anyMatch(worker -> worker.getWorkerType().equals(WorkerType.MEDIC));
    }

    private boolean howManyDays() {
        return workers.stream().anyMatch(worker -> worker.getDaysOnBoard() < MAX_NUMBER_OF_DAYS);
    }

    private boolean extractLessThen() {
        return (super.getQuantity()*100)/super.getCapacity() > FAULT_PERCENTAGE;
    }
}
