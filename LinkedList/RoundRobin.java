class RoundRobin {

    static class Node {
        int id, burst;
        Node next;

        Node(int i, int b) {
            id = i;
            burst = b;
        }
    }

    Node head;

    void add(int i, int b) {
        Node n = new Node(i, b);
        if (head == null) {
            head = n;
            n.next = n;
            return;
        }
        Node t = head;
        while (t.next != head) t = t.next;
        t.next = n;
        n.next = head;
    }
}
