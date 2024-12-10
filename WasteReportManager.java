import java.util.ArrayList;
import java.util.List;

public class WasteReportManager {
    private List<WasteReport> reports = new ArrayList<>();

    public void addReport(WasteReport report) {
        reports.add(report);
    }

    public void viewReports() {
        if (reports.isEmpty()) {
            System.out.println("No waste reports found.");
        } else {
            System.out.println("--- Waste Reports ---");
            for (WasteReport report : reports) {
                System.out.println(report);
            }
        }
    }

    public void viewPriorityAreas() {
        if (reports.isEmpty()) {
            System.out.println("No priority areas found.");
        } else {
            System.out.println("--- Priority Areas ---");
            for (WasteReport report : reports) {
                System.out.println("Priority Area: " + report.getPriorityArea() +
                                   " | Location: " + report.toString().split("\n")[0].split(": ")[1]);
            }
        }
    }
}
