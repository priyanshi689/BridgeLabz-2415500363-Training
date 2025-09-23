    class Manager extends Employee {
        private int teamSize;

        public Manager(String name, String empID, double salary, int teamSize) {
            super(name, empID, salary);
            this.teamSize = teamSize;
        }

        @Override
        public void displayEmpDetails() {
            super.displayEmpDetails();
            System.out.println("Team Size: " + teamSize);
        }
    }