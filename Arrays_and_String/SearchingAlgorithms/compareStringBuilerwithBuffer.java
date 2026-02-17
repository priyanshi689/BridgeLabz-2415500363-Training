class CompareSpeed {
    public static void main(String[] args) {

        int n = 1_000_000;

        long t1 = System.nanoTime();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < n; i++) sb1.append("hello");
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < n; i++) sb2.append("hello");
        long t4 = System.nanoTime();

        System.out.println("StringBuffer: " + (t2 - t1));
        System.out.println("StringBuilder: " + (t4 - t3));
    }
}
