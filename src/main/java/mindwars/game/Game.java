//AI-generated (ChatGPT) then reviewed by human

package mindwars.game;

import mindwars.trivia.AnswerValidator;
import mindwars.trivia.Question;
import mindwars.trivia.QuestionBank;
import mindwars.ui.ConsoleIO;

/**
 * PURPOSE:
 * - Orchestrates the whole game flow (setup → rounds/turns → end).
 * - Calls into UI (ConsoleIO) for input/output.
 * - Requests questions from QuestionBank and checks answers using AnswerValidator.
 *
 * @TODO (MVP):
 * 1) Setup:
 *    - Ask number of players (2 now, allow 3–4).
 *    - Ask each player's name.
 *    - Create GameState + TurnManager + AnswerValidator.
 * 2) Gameplay:
 *    - Loop for N rounds (choose a constant like 5/10 for now).
 *    - For each player turn:
 *      - Get next question from QuestionBank.
 *      - Print question (q.formatForConsole()).
 *      - Read player answer.
 *      - Validate with AnswerValidator.
 *      - If correct: add points to the player (e.g., +10).
 * 3) End:
 *    - Print scoreboard.
 *    - Compute winner with WinnerCalculator.
 *
 * @TODO (Rules hygiene):
 * - Do not read input directly from System.in here (only ConsoleIO).
 * - Do not hardcode question lists here (QuestionBank owns that).
 */
public class Game {
    private final ConsoleIO io;
    private final QuestionBank questionBank;

    public Game(ConsoleIO io, QuestionBank questionBank) {
        this.io = io;
        this.questionBank = questionBank;
    }

    public void run() {
        //@TODO implement full MVP loop
    }

    // Optional helpers you can create:
    // private void setupPlayers(GameState state) { ... }
    // private void playTurn(GameState state, TurnManager tm, AnswerValidator v) { ... }
}