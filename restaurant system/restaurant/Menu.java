/* class Menu {
    private List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void displayMenu() {
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }
} */
import java.util.ArrayList;
import java.util.List;

public class Menu {
    public List<MenuItem> items;

    public Menu() {
        this.items = new ArrayList<>();
    }

    public void displayMenu() {
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }
}
