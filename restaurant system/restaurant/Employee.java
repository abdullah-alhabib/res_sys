class Employee extends User {
    private int employeeId;

    public Employee(int id, String name, int employeeId) {
        super(id, name);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void timeIn() {
        System.out.println("Employee " + getName() + " timed in.");
    }

    public void timeOut() {
        System.out.println("Employee " + getName() + " timed out.");
    }

    @Override
    public String toString() {
        return super.toString() + " Employee [employeeId=" + employeeId + "]";
    }
}
