import java.util.List;
import java.util.ArrayList;

public class animalList {
    public static void main(String[] args) {
        List<String> petList = List.of("dog", "cat", "bird", "hamster");
        List<String> result = petList.stream()
                .sorted()
                .toList();
        System.out.println(result);
    }
}
