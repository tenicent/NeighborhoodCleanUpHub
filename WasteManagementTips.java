import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WasteManagementTips {
    private List<String> tips;

    public WasteManagementTips() {
        tips = new ArrayList<>();
        tips.add("Reduce single-use plastics by using reusable items.");
        tips.add("Compost organic waste to enrich the soil.");
        tips.add("Recycle electronic waste responsibly at designated centers.");
        tips.add("Avoid hazardous waste dumping by contacting proper authorities.");
        tips.add("Organize community cleanup events to raise awareness.");
    }

    public void showRandomTip() {
        Collections.shuffle(tips);
        System.out.println("Waste Management Tip: " + tips.get(0));
    }
}
