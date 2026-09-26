import java.util.Arrays;

class Player implements Comparable<Player> {

    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    Player(String name, int matchesPlayed,
           double battingAverage, boolean injured) {

        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    // Rule for experienced players
    boolean isDraftable() {

        return matchesPlayed >= 10 && !injured;
    }

    // Rule for everyone else
    boolean isDraftable(boolean checkFitness) {

        if (matchesPlayed >= 5 && battingAverage >= 30) {
            return !checkFitness || !injured;
        }

        return false;
    }

    @Override
    public int compareTo(Player other) {

        return Double.compare(
                other.battingAverage,
                this.battingAverage
        );
    }

    public String getName() {
        return name;
    }
}

public class FantasyLeagueAutoDraft {

    static String draftAndRank(Player[] players) {

        Player[] draftablePlayers = new Player[players.length];

        int count = 0;

        for (Player player : players) {

            if (player.isDraftable()
                    || player.isDraftable(true)) {

                draftablePlayers[count] = player;
                count++;
            }
        }

        Player[] finalPlayers = Arrays.copyOf(
                draftablePlayers, count
        );

        Arrays.sort(finalPlayers);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < finalPlayers.length; i++) {

            result.append(i + 1)
                  .append(". ")
                  .append(finalPlayers[i].getName());

            if (i < finalPlayers.length - 1) {
                result.append(" | ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 3, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}