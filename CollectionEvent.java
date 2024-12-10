public class CollectionEvent {
    private String location;
    private String date;
    private String organizer;
    private String details;

    public CollectionEvent(String location, String date, String organizer, String details) {
        this.location = location;
        this.date = date;
        this.organizer = organizer;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Location: " + location + "\n" +
               "Date: " + date + "\n" +
               "Organizer: " + organizer + "\n" +
               "Details: " + details + "\n";
    }
}
