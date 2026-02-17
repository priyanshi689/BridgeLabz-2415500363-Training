class DirectorySizeCalculator {

    static int totalSize(Object node) {
        if (node instanceof FileNode)
            return ((FileNode) node).size;

        int sum = 0;
        DirectoryNode dir = (DirectoryNode) node;
        for (Object child : dir.children)
            sum += totalSize(child);

        return sum;
    }

    public static void main(String[] args) {

        DirectoryNode project = new DirectoryNode("project");
        DirectoryNode src = new DirectoryNode("src");
        DirectoryNode docs = new DirectoryNode("docs");
        DirectoryNode guides = new DirectoryNode("guides");

        src.add(new FileNode("main.java", 100));
        src.add(new FileNode("utils.java", 50));

        guides.add(new FileNode("setup.pdf", 200));
        docs.add(new FileNode("readme.txt", 10));
        docs.add(guides);

        project.add(src);
        project.add(docs);
        project.add(new FileNode("config.xml", 20));

        System.out.println(totalSize(project));
    }
}
