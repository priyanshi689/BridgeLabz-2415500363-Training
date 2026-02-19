class LibraryList {

    static class Node {
        String title, author, genre;
        int id;
        boolean available;
        Node next, prev;

        Node(int i, String t, String a, String g, boolean av) {
            id = i;
            title = t;
            author = a;
            genre = g;
            available = av;
        }
    }

    Node head, tail;

    void add(int i, String t, String a, String g, boolean av) {
        Node n = new Node(i, t, a, g, av);
        if (head == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    int count() {
        int c = 0;
        Node t = head;
        while (t != null) {
            c++;
            t = t.next;
        }
        return c;
    }
}
