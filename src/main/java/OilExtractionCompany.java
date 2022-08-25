import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OilExtractionCompany {

    private List<Extractor> extractorList;

    public OilExtractionCompany(List<Extractor> extractorList) {
        this.extractorList = extractorList;
    }

    public int calculateNumberOfDevicesWithFaults() {
        int counter = 0;
        for (Extractor extractor : extractorList) {
            if (extractor instanceof MobileTerrestrial || extractor instanceof OffshorePlatform)
                if (((ReportFault) extractor).isFaulty())
                    counter++;
        }
        return counter;
    }

    public List<Extractor> getExtractorsWithMoreThan95() {
        return extractorList.stream().filter(extractor -> extractor.getProcentage() >= 95).collect(Collectors.toList());
    }

    public void addExtractor(Extractor extractor) {
        extractorList.add(extractor);
    }
}
