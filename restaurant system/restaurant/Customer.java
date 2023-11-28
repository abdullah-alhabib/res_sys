class Customer extends User {
    private int rewardPoints;

    public Customer() {
        // Default constructor
    }

    public Customer(int id) {
        super(id, "");
        this.rewardPoints = 0;
    }

    public Customer(int id, String name, int rewardPoints) {
        super(id, name);
        this.rewardPoints = rewardPoints;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public Menu viewMenu() {
        // Return the menu
        return new Menu();
    }

    @Override
    public String toString() {
        return super.toString() + " Customer [rewardPoints=" + rewardPoints + "]";
    }
}

