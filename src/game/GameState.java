//AI-generated (ChatGPT) then reviewed by human

package mindwars.game;

import mindwars.player.Player;

import java.util.List;

/**
 * PURPOSE:
 * - Stores the evolving state of the game while it runs.
 * - Data-only (should not print / read input).
 *
 * @TODO (MVP fields):
 * - List<Player> players
 * - int roundNumber
 * - int currentPlayerIndex
 *
 * @TODO (methods):
 * - getters/setters OR safe helper methods (recommended):
 *   - getPlayers()
 *   - getRoundNumber(), setRoundNumber(...)
 *   - getCurrentPlayerIndex(), setCurrentPlayerIndex(...)
 *
 * @TODO (quality):
 * - Ensure the players list is not null once set.
 * - Prefer returning read-only views if possible (later improvement).
 */
public class GameState {
    private List<Player> players;
    private int roundNumber;
    private int currentPlayerIndex;

    public GameState() {
        // @TODO initialize defaults (roundNumber=1, currentPlayerIndex=0)
    }

    // @TODO getters/setters
}