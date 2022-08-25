import java.util.ArrayList;
import java.util.List;

public class OffshorePlatform extends Extractor implements ReportFault {
    public static int FAULT_PERCENTAGE = 70;
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
        return workers.stream().anyMatch(worker -> worker.getDaysOnBoard() < 14);
    }

    private boolean extractLessThen() {
        return (super.getQuantity()*100)/super.getCapacity() > 70;
    }
}
