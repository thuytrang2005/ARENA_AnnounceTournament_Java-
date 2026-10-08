package arena;

/**
 * Represents the Advertiser actor that participates in the
 * AnnounceTournament use case.
 */
public class Advertiser {
    private final String id;
    private final String name;

    /**
     * Creates an advertiser.
     *
     * @param id unique advertiser identifier
     * @param name advertiser name
     */
    public Advertiser(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /** @return the advertiser identifier */
    public String getId() {
        return id;
    }

    /** @return the advertiser name */
    public String getName() {
        return name;
    }
}
