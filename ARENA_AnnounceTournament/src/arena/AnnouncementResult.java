package arena;

/**
 * Boundary result returned after the AnnounceTournament use case
 * has been executed.
 */
public class AnnouncementResult {
    private final boolean successful;
    private final String message;
    private final Tournament tournament;

    /**
     * Creates an announcement result.
     *
     * @param successful whether the operation succeeded
     * @param message result message
     * @param tournament created tournament, or {@code null} on failure
     */
    public AnnouncementResult(boolean successful, String message,
                              Tournament tournament) {
        this.successful = successful;
        this.message = message;
        this.tournament = tournament;
    }

    /** @return whether the announcement succeeded */
    public boolean isSuccessful() {
        return successful;
    }

    /** @return result message */
    public String getMessage() {
        return message;
    }

    /** @return created tournament, or {@code null} */
    public Tournament getTournament() {
        return tournament;
    }
}
