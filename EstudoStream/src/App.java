
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        List<Integer> inteiro = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = inteiro.stream();
        System.out.println(Arrays.toString(st1.toArray()));

    }
}
