class SocialNetwork {

    static class User {
        int id;
        String name;
        int[] friends;
        User next;

        User(int i, String n) {
            id = i;
            name = n;
            friends = new int[10];
        }
    }

    User head;
}
