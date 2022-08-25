public class Worker {
    private WorkerType workerType;
    private int daysOnBoard;

    public Worker(WorkerType workerType, int daysOnBoard) {
        this.workerType = workerType;
        this.daysOnBoard = daysOnBoard;
    }

    public WorkerType getWorkerType() {
        return workerType;
    }

    public int getDaysOnBoard() {
        return daysOnBoard;
    }
}
