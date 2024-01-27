import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class FixtureGenerator {
	  public static List<String> generateFixture(List<String> teams) {
	        List<String> fixture = new ArrayList<>();
	        if (teams.size() % 2 != 0) {
	            teams.add("Bay");
	        }
	        int numWeeks=teams.size()-1;
	        int numMatchesPerWeek = teams.size() / 2;
	        Collections.shuffle(teams);
	        for (int week = 1; week <= numWeeks; week++) {
	            for (int match = 0; match < numMatchesPerWeek; match++) {
	                String homeTeam = teams.get(match);
	                String awayTeam = teams.get(teams.size() - 1 - match);
	                if (!homeTeam.equals("Bay") && !awayTeam.equals("Bay")) {
	                    fixture.add(homeTeam + " vs " + awayTeam + " (Week " + week + ")");
	                }
	            }
	            String lastTeam = teams.remove(teams.size() - 1);
	            teams.add(1, lastTeam);
	        }
	        return fixture;
	}
}
