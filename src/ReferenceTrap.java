import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = { "Tommy" , "Joel" , "Ellie" };
        String[] staffThisYear = Arrays.copyOf(staffLastYear , staffLastYear.length);

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
