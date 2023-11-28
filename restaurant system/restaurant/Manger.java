
    class Manager extends User {
        private String department;
        public Manager() {
            // Default constructor
        }

        public Manager(int id, String name, String department) {
            super(id, name);
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void delegateTask() {
            System.out.println("Delegate task to employees.");
        }

        @Override
        public String toString() {
            return super.toString() + " Manager [department=" + department + "]";
        }
    }


