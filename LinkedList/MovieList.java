class MovieList {

    static class Node {
        String title, director;
        int year;
        double rating;
        Node next, prev;

        Node(String t, String d, int y, double r) {
            title = t;
            director = d;
            year = y;
            rating = r;
        }
    }

    Node head, tail;

    void addLast(String t, String d, int y, double r) {
        Node n = new Node(t, d, y, r);
        if (head == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    void remove(String title) {
        Node t = head;
        while (t != null && !t.title.equals(title))
            t = t.next;

        if (t == null) return;

        if (t == head) head = head.next;
        if (t == tail) tail = tail.prev;
        if (t.prev != null) t.prev.next = t.next;
        if (t.next != null) t.next.prev = t.prev;
    }

    void displayForward() {
        Node t = head;
        while (t != null) {
            System.out.println(t.title);
            t = t.next;
        }
    }

    void displayReverse() {
        Node t = tail;
        while (t != null) {
            System.out.println(t.title);
            t = t.prev;
        }
    }
}
