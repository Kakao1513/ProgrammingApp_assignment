public class ch12 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.format("%d * %d = %2d ", j, i, j * i);
            }
            System.out.println();
        }
    }
}
