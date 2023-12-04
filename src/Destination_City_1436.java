import java.util.*;
import java.util.stream.Collectors;

public class Destination_City_1436 {
    public static void main(String[] args) {
        String[][] pathArray = new String[][]{
                {"jMgaf WaWA", "iinynVdmBz"},
                {" QCrEFBcAw", "wRPRHznLWS"},
                {"iinynVdmBz", "OoLjlLFzjz"},
                {"OoLjlLFzjz", " QCrEFBcAw"},
                {"IhxjNbDeXk", "jMgaf WaWA"},
                {"jmuAYy vgz", "IhxjNbDeXk"}
        };
        List<List<String>> paths = Arrays.stream(pathArray).map(Arrays::asList).collect(Collectors.toList());
        System.out.println(new Destination_City_1436().destCity(paths));
    }

    public String destCity(List<List<String>> paths) {
        Set<String> hasOutgoingCitites = paths.stream()
                .map(cityPair -> cityPair.get(0)).collect(Collectors.toSet());
        return paths.stream().filter(path -> !hasOutgoingCitites.contains(path.get(1))).findAny().get().get(1);
    }
}
