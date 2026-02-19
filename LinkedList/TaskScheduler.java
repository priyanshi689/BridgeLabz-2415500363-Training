class TaskScheduler {

    static class Node {
        int id;
        String name, date;
        int priority;
        Node next;

        Node(int i, String n, int p, String d) {
            id = i;
            name = n;
            priority = p;
            date = d;
        }
    }

    Node head;

    void add(int i, String n, int p, String d) {
        Node node = new Node(i, n, p, d);
        if (head == null) {
            head = node;
            node.next = node;
            return;
        }
        Node t = head;
        while (t.next != head) t = t.next;
        t.next = node;
        node.next = head;
    }

    void display() {
        if (head == null) return;
        Node t = head;
        do {
            System.out.println(t.id + " " + t.name);
            t = t.next;
        } while (t != head);
    }
}
