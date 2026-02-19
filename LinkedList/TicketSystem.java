class TicketSystem {

    static class Node {
        int id;
        String name, movie;
        Node next;

        Node(int i, String n, String m) {
            id = i;
            name = n;
            movie = m;
        }
    }

    Node head;

    void add(int i, String n, String m) {
        Node node = new Node(i, n, m);
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
}
