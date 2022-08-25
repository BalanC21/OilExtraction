import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Extractor> extractorList = new ArrayList<>();

        extractorList.add(new MobileTerrestrial(1500, 1440, "Roma"));
        extractorList.add(new OffshorePlatform(1500, 1430));
        extractorList.add(new FixedTerrestrial(1500, 1000, "China"));
        extractorList.add(new OffshorePlatform(1500, 850));
        extractorList.add(new MobileTerrestrial(1500, 750, "Tamas"));
        extractorList.add(new FixedTerrestrial(1500, 1490, "Lala"));

        for (Extractor extractor : extractorList) {
            if (extractor instanceof OffshorePlatform)
                ((OffshorePlatform) extractor).addWorker(new Worker(WorkerType.MEDIC, 10));
        }


        OilExtractionCompany oilExtractionCompany = new OilExtractionCompany(extractorList);

        System.out.println(oilExtractionCompany.calculateNumberOfDevicesWithFaults());
        System.out.println(oilExtractionCompany.getExtractorsWithMoreThan95());
    }
}
