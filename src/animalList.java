import java.util.List;
import java.util.ArrayList;

public class animalList {
    public static void main(String[] args) {
        List<String> petList = List.of("dog", "cat", "bird");
        for (String petLists : petList) {
            System.out.println(petLists);
        }
    }
}
