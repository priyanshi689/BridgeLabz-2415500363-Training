class StudentList {

    static class Node {
        int roll, age;
        String name, grade;
        Node next;

        Node(int r, String n, int a, String g) {
            roll = r;
            name = n;
            age = a;
            grade = g;
        }
    }

    Node head;

    void addFirst(int r, String n, int a, String g) {
        Node node = new Node(r, n, a, g);
        node.next = head;
        head = node;
    }

    void addLast(int r, String n, int a, String g) {
        Node node = new Node(r, n, a, g);
        if (head == null) {
            head = node;
            return;
        }
        Node t = head;
        while (t.next != null) t = t.next;
        t.next = node;
    }

    void delete(int roll) {
        if (head == null) return;
        if (head.roll == roll) {
            head = head.next;
            return;
        }
        Node t = head;
        while (t.next != null && t.next.roll != roll)
            t = t.next;
        if (t.next != null)
            t.next = t.next.next;
    }

    Node search(int roll) {
        Node t = head;
        while (t != null) {
            if (t.roll == roll) return t;
            t = t.next;
        }
        return null;
    }

    void updateGrade(int roll, String g) {
        Node s = search(roll);
        if (s != null) s.grade = g;
    }

    void display() {
        Node t = head;
        while (t != null) {
            System.out.println(t.roll + " " + t.name + " " + t.age + " " + t.grade);
            t = t.next;
        }
    }

    public static void main(String[] args) {
        StudentList s = new StudentList();
        s.addFirst(1, "A", 20, "B");
        s.addLast(2, "B", 21, "A");
        s.updateGrade(1, "A");
        s.display();
    }
}
