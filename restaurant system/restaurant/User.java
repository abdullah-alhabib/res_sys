/* class User {
    private int id;
    private String name;

    public User() {
        // Default constructor
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("User ID: " + id);
        System.out.println("Name: " + name);
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }
} */
/* import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    private LocalDate currentDate;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    // Method to display date
    public void displayDate() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + name);
        System.out.println("the Date: " + currentDate );
    }
    }

    // toString method
    @Override
    public String toString()
        return "-Name"+ name+ "-ID"+id+"-currentDate"+currentDate ;
    */

import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    private LocalDate currentDate;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    } }
