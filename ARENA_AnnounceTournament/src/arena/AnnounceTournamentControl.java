package arena;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Control class for the AnnounceTournament use case.
 *
 * <p>The control coordinates validation, tournament creation,
 * and optional association of an advertiser. This is a simplified
 * in-memory implementation of the analysis model.</p>
 */
public class AnnounceTournamentControl {

    /**
     * Executes the AnnounceTournament use case.
     *
     * @param owner league owner initiating the use case
     * @param form tournament information entered by the owner
     * @param advertiser advertiser participating in the announcement;
     *                   may be {@code null}
     * @return result of the announcement
     */
    public AnnouncementResult announce(League league, LeagueOwner owner,
                                        AnnounceTournamentForm form,
                                        Advertiser advertiser) {
        String validationMessage = validate(league, owner, form);

        if (validationMessage != null) {
            return new AnnouncementResult(false, validationMessage, null);
        }

        Tournament tournament = new Tournament(
                UUID.randomUUID().toString(),
                form.getTournamentName().trim(),
                form.getStartDate(),
                form.getEndDate(),
                form.getMaxPlayers(),
                league);

        if (advertiser != null) {
            tournament.setAdvertiser(advertiser);
        }

        return new AnnouncementResult(
                true,
                "Tournament announced successfully.",
                tournament);
    }

    /**
     * Validates the data needed to announce a tournament.
     *
     * @param league the league in which the tournament is created
     * @param owner league owner initiating the use case
     * @param form announcement form
     * @return {@code null} when valid; otherwise an error message
     */
    private String validate(League league, LeagueOwner owner, AnnounceTournamentForm form) {
        if (league == null) {
            return "League is required.";
        }

        if (owner == null) {
            return "LeagueOwner is required.";
        }

        if (form == null) {
            return "Tournament information is required.";
        }

        if (form.getTournamentName() == null
                || form.getTournamentName().isBlank()) {
            return "Tournament name is required.";
        }

        if (form.getStartDate() == null || form.getEndDate() == null) {
            return "Tournament dates are required.";
        }

        if (form.getStartDate().isAfter(form.getEndDate())) {
            return "Start date must not be after end date.";
        }

        if (form.getMaxPlayers() <= 0) {
            return "Maximum players must be greater than zero.";
        }

        return null;
    }
}
