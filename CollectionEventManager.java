import java.util.ArrayList;
import java.util.List;

public class CollectionEventManager {
    private List<CollectionEvent> events = new ArrayList<>();

    public void addEvent(CollectionEvent event) {
        events.add(event);
    }

    public void viewEvents() {
        if (events.isEmpty()) {
            System.out.println("No Cleaning events found.");
        } else {
            System.out.println("--- Cleaning Events ---");
            for (CollectionEvent event : events) {
                System.out.println(event);
            }
        }
    }
}
