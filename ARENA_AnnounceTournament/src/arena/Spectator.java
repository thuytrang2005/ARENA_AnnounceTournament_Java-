package arena;

/**
 * Represents a spectator participating in ARENA.
 *
 * <p>This class is included to reflect the actor in the provided
 * ARENA use-case diagram. It is not directly manipulated by
 * AnnounceTournament.</p>
 */
public class Spectator {
    private final String id;
    private final String name;

    /**
     * Creates a spectator.
     *
     * @param id unique spectator identifier
     * @param name spectator name
     */
    public Spectator(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /** @return the spectator identifier */
    public String getId() {
        return id;
    }

    /** @return the spectator name */
    public String getName() {
        return name;
    }
}
