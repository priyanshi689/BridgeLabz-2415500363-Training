class panagram {
    static boolean isPanagram(String s) {
        s = s.toLowerCase();
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                seen[ch - 'a'] = true;
        }

        for (boolean b : seen)
            if (!b) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPanagram("The quick brown fox jumps over the lazy dog"));
    }
}
