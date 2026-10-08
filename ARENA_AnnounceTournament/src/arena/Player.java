package arena;

/**
 * Represents a player participating in ARENA.
 *
 * <p>The player is shown in the overall ARENA use-case model.
 * This class is kept simple because the AnnounceTournament use case
 * does not require player-specific processing.</p>
 */
public class Player {
    private final String id;
    private final String name;

    /**
     * Creates a player.
     *
     * @param id unique player identifier
     * @param name player name
     */
    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /** @return the player identifier */
    public String getId() {
        return id;
    }

    /** @return the player name */
    public String getName() {
        return name;
    }
}
