ackage com.company;

public class JOJO11 {
    private static class Pool {
        final public int a = 25;
        final protected int b = 25;
        final private int c = 2;

        public long getVolume(int a, int b, int c) {
            long litr = (a * b * c * 1000);
            return litr;
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        long poolVolume = pool.getVolume(25, 5, 2);
        System.out.println(poolVolume);
    }

}
