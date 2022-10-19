import java.util.Objects;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<Integer> oi = Optional.ofNullable(null);
        Optional<Integer> oi2 = Optional.of(oi.orElse(1) * 2);

        Optional<Integer> oi3 = oi
                //.filter(Objects::nonNull)
                .map(e -> {
                    if (e == null)
                        return 0;
                    return e;
                });

        Integer res = oi3.get(); //ERROR No value present

        int a = 1;
    }
}
