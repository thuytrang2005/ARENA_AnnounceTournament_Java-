package arena;

import java.time.LocalDate;

/**
 * Boundary object containing data entered by the LeagueOwner
 * when announcing a tournament.
 */
public class AnnounceTournamentForm {
    private final String tournamentName;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final int maxPlayers;

    /**
     * Creates the announcement form.
     *
     * @param tournamentName tournament name
     * @param startDate tournament start date
     * @param endDate tournament end date
     * @param maxPlayers maximum number of players
     */
    public AnnounceTournamentForm(String tournamentName, LocalDate startDate,
                                  LocalDate endDate, int maxPlayers) {
        this.tournamentName = tournamentName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxPlayers = maxPlayers;
    }

    /** @return tournament name */
    public String getTournamentName() {
        return tournamentName;
    }

    /** @return start date */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** @return end date */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** @return maximum number of players */
    public int getMaxPlayers() {
        return maxPlayers;
    }
}
