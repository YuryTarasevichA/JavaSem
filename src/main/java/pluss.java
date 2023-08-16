import java.util.Arrays;

public class pluss {
    public static void main (String[] args) {
        var s = System.currentTimeMillis();
        //        String str = "";
        StringBuilder plus = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            plus.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
    }
}
