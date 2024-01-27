import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Team1");
        teams.add("Team2");
        teams.add("Team3");
        teams.add("Team4");
        teams.add("Team5");
        teams.add("Team6");

        List<String> fixture = FixtureGenerator.generateFixture(teams);

        for (String match : fixture) {
            System.out.println(match);
        }
    }
}
