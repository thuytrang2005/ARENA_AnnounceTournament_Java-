package arena;

/**
 * Represents the LeagueOwner actor who initiates the AnnounceTournament
 * use case.
 */
public class LeagueOwner {
    private final String id;
    private final String name;

    /**
     * Creates a league owner.
     *
     * @param id unique owner identifier
     * @param name owner name
     */
    public LeagueOwner(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /** @return the owner identifier */
    public String getId() {
        return id;
    }

    /** @return the owner name */
    public String getName() {
        return name;
    }
}
