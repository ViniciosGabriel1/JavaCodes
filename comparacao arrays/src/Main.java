import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[10];
        System.out.println(Arrays.toString(names));
        Arrays.fill(names , "Show lindo");
        System.out.println(Arrays.toString(names));
    }
}