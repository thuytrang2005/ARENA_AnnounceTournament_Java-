package arena;

import java.time.LocalDate;

/**
 * Entity representing a tournament announced by a LeagueOwner.
 */
public class Tournament {
    private final String id;
    private final String name;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final int maxPlayers;
    private final League league;
    private String status;
    private Advertiser advertiser;

    /**
     * Creates a tournament.
     *
     * @param id unique tournament identifier
     * @param name tournament name
     * @param startDate tournament start date
     * @param endDate tournament end date
     * @param maxPlayers maximum number of players
     * @param league the league this tournament belongs to
     */
    public Tournament(String id, String name, LocalDate startDate,
                      LocalDate endDate, int maxPlayers, League league) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxPlayers = maxPlayers;
        this.league = league;
        this.status = "ANNOUNCED";
    }

    /** @return tournament identifier */
    public String getId() {
        return id;
    }

    /** @return tournament name */
    public String getName() {
        return name;
    }

    /** @return tournament start date */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** @return tournament end date */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** @return maximum number of players */
    public int getMaxPlayers() {
        return maxPlayers;
    }

    /** @return tournament status */
    public String getStatus() {
        return status;
    }

    /** @return advertiser associated with the announcement */
    public Advertiser getAdvertiser() {
        return advertiser;
    }

    /**
     * Associates an advertiser with the tournament announcement.
     *
     * @param advertiser advertiser participating in the announcement
     */
    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    /** @return the league this tournament belongs to */
    public League getLeague() {
        return league;
    }
}