/* class MenuItem extends Menu {
    private int itemId;
    private String description;
    private double price;

    public MenuItem() {
        // Default constructor
    }

    public MenuItem(int itemId) {
        this.itemId = itemId;
    }

    public MenuItem(int itemId, String description, double price) {
        this.itemId = itemId;
        this.description = description;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem [itemId=" + itemId + ", description=" + description + ", price=" + price + "]";
    }
}*/


class MenuItem extends Menu {
    private int itemId;
    private String description;
    private double price;

    public MenuItem() {
        super();
    }

    public MenuItem(int itemId) {
        super();
        this.itemId = itemId;
    }

    public MenuItem(int itemId, String description, double price) {
        super();
        this.itemId = itemId;
        this.description = description;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId + ", Description: " + description + ", Price: $" + price;
    }
}

