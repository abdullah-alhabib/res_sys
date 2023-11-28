
    /*
import java.util.List;

public class RestaurantSystem {
    private List<User> users;
    private Menu menu;
    private List<Order> orders;
    private List<Payment> payments;

    public RestaurantSystem() {
        users = new ArrayList<>();
        menu = new Menu();
        orders = new ArrayList<>();
        payments = new ArrayList<>();
    }

    // Add getters and setters for the private attributes

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void processOrder(Order order) {
        orders.add(order);
    }

    public void processPayment(Payment payment) {
        payments.add(payment);
    }
} */

import java.util.ArrayList;
import java.util.List;

    public class RestaurantSystem {
        private List<User> users;
        private Menu menu;
        private List<Order> orders = new ArrayList<>();
        private List<Payment> payments = new ArrayList<>();

        public RestaurantSystem() {
            users = new ArrayList<>();
            menu = new Menu();
        }

        // Add getters and setters for the private attributes

        public List<User> getUsers() {
            return users;
        }

        public void setUsers(List<User> users) {
            this.users = users;
        }

        public Menu getMenu() {
            return menu;
        }


        public void setMenu(Menu menu) {
            this.menu = menu;
        }

        public List<Order> getOrders() {
            return orders;
        }

        public void setOrders(List<Order> orders) {
            this.orders = orders;
        }
        // Existing constructor and methods...


        public void updateOrder(Order order, MenuItem newItem) {
            // Logic to update the order
        }


        public List<Payment> getPayments() {
            return payments;
        }

        public void setPayments(List<Payment> payments) {
            this.payments = payments;
        }

        public void addUser(User user) {
            users.add(user);
        }

        public void removeUser(User user) {
            users.remove(user);
        }

        public void processOrder(Order order) {
            orders.add(order);
        }

        public void processPayment(Payment payment) {
            payments.add(payment);
        }
    }



