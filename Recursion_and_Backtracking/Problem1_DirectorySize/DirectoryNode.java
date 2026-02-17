import java.util.*;

class DirectoryNode {
    String name;
    List<Object> children = new ArrayList<>();

    DirectoryNode(String name) {
        this.name = name;
    }

    void add(Object node) {
        children.add(node);
    }
}
