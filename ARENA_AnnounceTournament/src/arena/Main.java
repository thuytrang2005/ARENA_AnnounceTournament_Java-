package arena;

import java.time.LocalDate;

/**
 * Demonstrates the simplified AnnounceTournament use case.
 */
public class Main {

    /**
     * Runs a sample announcement.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        LeagueOwner owner = new LeagueOwner("LO01", "Nguyen Van A");
        League league = new League("LG01", "Tic Tac Toe Beginners", owner);
        Advertiser advertiser = new Advertiser("AD01", "ABC Advertising");

        AnnounceTournamentForm form = new AnnounceTournamentForm(
                "ARENA Summer Tournament",
                LocalDate.of(2027, 6, 10),
                LocalDate.of(2027, 6, 12),
                32);

        AnnounceTournamentControl control =
                new AnnounceTournamentControl();

        AnnouncementResult result =
                control.announce(league, owner, form, advertiser);

        System.out.println(result.getMessage());

        if (result.isSuccessful()) {
            Tournament tournament = result.getTournament();

            System.out.println("ID: " + tournament.getId());
            System.out.println("Name: " + tournament.getName());
            System.out.println("League: " + tournament.getLeague().getName());
            System.out.println("Start: " + tournament.getStartDate());
            System.out.println("End: " + tournament.getEndDate());
            System.out.println("Max players: " + tournament.getMaxPlayers());

            if (tournament.getAdvertiser() != null) {
                System.out.println(
                        "Advertiser: "
                                + tournament.getAdvertiser().getName());
            }
        }
    }
}
