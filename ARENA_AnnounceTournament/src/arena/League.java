package arena;

/**
 * Represents a League in ARENA.
 * A League is a community for running Tournaments, associated with a specific Game
 * and TournamentStyle.
 */
public class League {
    private final String id;
    private final String name;
    private final LeagueOwner owner;

    /**
     * Creates a league.
     *
     * @param id unique league identifier
     * @param name league name
     * @param owner the owner of the league
     */
    public League(String id, String name, LeagueOwner owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    /** @return the league identifier */
    public String getId() {
        return id;
    }

    /** @return the league name */
    public String getName() {
        return name;
    }

    /** @return the owner of the league */
    public LeagueOwner getOwner() {
        return owner;
    }
}