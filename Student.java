class Student {

    private int id;
    private String name;
    private int[] marks;

    Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    int getId() {
        return id;
    }

    int getMax() {
        int max = marks[0];
        for (int m : marks) {
            if (m > max) max = m;
        }
        return max;
    }

    int getMin() {
        int min = marks[0];
        for (int m : marks) {
            if (m < min) min = m;
        }
        return min;
    }

    int getAvg() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / marks.length;
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Highest Mark: " + getMax());
        System.out.println("Lowest Mark: " + getMin());
        System.out.println("Average: " + getAvg());
    }

    void displaySummary() {
        System.out.println(
            id + " | " + name + " | " +
            getMax() + " | " + getMin() + " | " + getAvg()
        );
    }
}
