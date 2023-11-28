/* package com.mycompany.restaurantsystem;

class Order extends Menu {
    private int orderId;
    private Customer customer;
    private List<MenuItem> orderedItems;
    private double nPrice;

    public Order() {
        // Default constructor
    }

    public Order(int orderId) {
        this.orderId = orderId;
        this.orderedItems = new ArrayList<>();
        this.nPrice = 0.0;
    }

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderedItems = new ArrayList<>();
        this.nPrice = 0.0;
    }

    public void addOrderedItem(MenuItem item) {
        orderedItems.add(item);
        nPrice += computeTotal(item);
    }

    public double getNewPrice() {
        return nPrice;
    }

    public void setNewPrice(double nPrice) {
        this.nPrice = nPrice;
    }

    public double computeTotal(MenuItem item) {
        return item.getPrice();
    }

    @Overridepublic String toString() {
        return "Order [orderId=" + orderId + ", customer=" + customer + ", orderedItems=" + orderedItems + ", nPrice=" + nPrice + "]";
    }
}*/

public class Order extends Menu {
    //data fields
    private int orderId;
    private Customer customer;
    private MenuItem[] orderItems;
    private double nPrice;

    //Constructors

//تأكدي من الديفولت كونستركتر اوردر

    public Order(){

        this.orderId = orderId;
        this.customer = customer;
        this.orderItems = orderItems;
        this.nPrice = nPrice;

    }

    public Order(int orderId){

        this.orderId=orderId;
    }

    public Order(int orderId, Customer customer){

        this.orderId=orderId;
        this.customer=customer;
    }

    //Methods

    public void addOrderItem(MenuItem[] orderItems){
        this.orderItems=orderItems;

    }

    public void setNewPrice(double nPrice){
        this.nPrice=nPrice;
    }

    public double getNewPrice(){
        return nPrice;
    }

    public double computeTotal(MenuItem[] orderItems){
        double total =0.0;

        for (MenuItem item: orderItems){

            total += item.getPrice();
        }
        return total;
    }

    public String toString(){
        return "Order ID: "+orderId+" - Customer: "+customer+" - Order Items: "+orderItems+" - Price: "+nPrice;
    }


    // Existing methods...

    }

