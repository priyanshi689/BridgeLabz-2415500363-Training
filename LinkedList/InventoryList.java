class InventoryList {

    static class Node {
        int id, qty;
        String name;
        double price;
        Node next;

        Node(int i, String n, int q, double p) {
            id = i;
            name = n;
            qty = q;
            price = p;
        }
    }

    Node head;

    void add(int i, String n, int q, double p) {
        Node node = new Node(i, n, q, p);
        node.next = head;
        head = node;
    }

    double totalValue() {
        double sum = 0;
        Node t = head;
        while (t != null) {
            sum += t.qty * t.price;
            t = t.next;
        }
        return sum;
    }
}
