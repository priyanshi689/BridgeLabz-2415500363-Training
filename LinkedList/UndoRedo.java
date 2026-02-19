class UndoRedo {

    static class Node {
        String state;
        Node prev, next;

        Node(String s) {
            state = s;
        }
    }

    Node cur;

    void add(String s) {
        Node n = new Node(s);
        if (cur == null) {
            cur = n;
            return;
        }
        cur.next = n;
        n.prev = cur;
        cur = n;
    }

    void undo() {
        if (cur != null && cur.prev != null)
            cur = cur.prev;
    }

    void redo() {
        if (cur != null && cur.next != null)
            cur = cur.next;
    }
}
