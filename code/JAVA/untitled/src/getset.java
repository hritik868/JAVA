public class getset {
    public static void main(String[] args) {
//        Num n = new Num();
//        int n1 = n.getx();
//        System.out.println(n1);
//        n.setx(500);
        System.out.println(getx());
    }

    static class Num {
        private int x = 25;

        public int getx() {
            return x;
        }

        public void setx(int a) {
            x = a;
        }
    }
}
