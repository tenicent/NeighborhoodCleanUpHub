import java.util.Scanner;

public class NeighborhoodCleanUpHub {
    public static void main(String[] args) {
        WasteReportManager reportManager = new WasteReportManager();
        CollectionEventManager eventManager = new CollectionEventManager();
        WasteManagementTips tips = new WasteManagementTips();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            tips.showRandomTip();
            System.out.println("\n--- Neighborhood Clean-Up Hub ---");
            System.out.println("1. Report Waste");
            System.out.println("2. View Waste Reports");
            System.out.println("3. View Priority Areas");
            System.out.println("4. Create Cleanup Event");
            System.out.println("5. View Cleanup Events");
            System.out.println("6. Exit");

            System.out.print("Select an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter location of waste: ");
                    String location = scanner.nextLine();

                    System.out.print("Enter description of the waste: ");
                    String description = scanner.nextLine();

                    System.out.print("Enter your name: ");
                    String reporterName = scanner.nextLine();

                    System.out.println("\n--- Severity Level of Waste ---");
                    System.out.println("1. Minor\n2. Moderate\n3. Severe");
                    System.out.print("What level of Waste: ");
                    String severity = switch (scanner.nextLine()) {
                    case "1" -> "Minor";
                    case "2" -> "Moderate";
                    case "3" -> "Severe";
                    default -> "Minor";
                    };

                    System.out.println("\n--- Type of Waste ---");
                    System.out.println("1. Organic\n2. Plastic\n3. Hazardous\n4. Electronic\n5. Miscellaneous");
                    System.out.print("Select the Type of Waste: ");
                    String wasteType = switch (scanner.nextLine()) {
                    case "1" -> "Organic";
                    case "2" -> "Plastic";
                    case "3" -> "Hazardous";
                    case "4" -> "Electronic";
                    case "5" -> "Miscellaneous";
                    default -> "Miscellaneous";
                    };

                    WasteReport report = new WasteReport(location, description, reporterName, severity, wasteType);
                    reportManager.addReport(report);
                    System.out.println("\nWaste report added successfully!");
                    // Show the waste management tip only once
                    tips.showRandomTip();
                    break;

                case 2:
                    reportManager.viewReports();
                    break;

                case 3:
                    reportManager.viewPriorityAreas();
                    break;

                case 4:
                    System.out.print("Enter location of event: ");
                    String eventLocation = scanner.nextLine();

                    System.out.print("Enter date of event (DD-MM-YYYY): ");
                    String eventDate = scanner.nextLine();

                    System.out.print("Enter organizer name: ");
                    String organizer = scanner.nextLine();

                    System.out.print("Enter event details: ");
                    String details = scanner.nextLine();

                    CollectionEvent event = new CollectionEvent(eventLocation, eventDate, organizer, details);
                    eventManager.addEvent(event);
                    System.out.println("\nCleanup event created successfully!");
                    tips.showRandomTip();
                    break;

                case 5:
                    eventManager.viewEvents();
                    break;

                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
