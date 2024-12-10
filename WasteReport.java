import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WasteReport {
    private String location;
    private String description;
    private String reportedBy;
    private String severityLevel;
    private String wasteType;
    private String priorityArea;
    private String date;

    public WasteReport(String location, String description, String reportedBy, String severityLevel, String wasteType) {
        this.location = location;
        this.description = description;
        this.reportedBy = reportedBy;
        this.severityLevel = severityLevel;
        this.wasteType = wasteType;
        this.priorityArea = assignPriority(severityLevel);
        this.date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    private String assignPriority(String severityLevel) {
        switch (severityLevel) {
            case "Minor":
                return "Low";
            case "Moderate":
                return "Medium";
            case "Severe":
                return "High";
            default:
                return "Low";
        }
    }

    public String getPriorityArea() {
        return priorityArea;
    }

    @Override
    public String toString() {
        return "Location: " + location + "\n" +
               "Description: " + description + "\n" +
               "Reported by: " + reportedBy + "\n" +
               "Severity Level: " + severityLevel + "\n" +
               "Type: " + wasteType + "\n" +
               "Priority Area: " + priorityArea + "\n" +
               "Date: " + date + "\n";
    }
}
