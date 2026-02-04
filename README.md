# MindWars

![Logo](assets/logo.png)

 "Where brains conquer" 




### One-liner
A multiplayer trivia game where players answer knowledge-based questions to gain points and strategically conquer territories controlled by other players.


## Project structure

```text
src/main/java/mindwars/
├─ Main.java                     # Entry point (wires everything and starts the game)
│
├─ game/                         # Core game flow + state management
│  ├─ GameEngine.java            # Orchestrates setup, rounds/turns, scoring, end results
│  ├─ GameState.java             # Holds mutable state (players, round, current turn)
│  ├─ TurnManager.java           # Handles turn order logic
│  └─ WinnerCalculator.java      # Computes winner/tie from scores
│
├─ player/                       # Player data model
│  └─ Player.java                # Player name + score (+ later stats/territories)
│
├─ trivia/                       # Trivia questions + validation
│  ├─ QuestionType.java          # Enum for question types (MCQ, True/False)
│  ├─ Question.java              # Question model + console formatting
│  ├─ QuestionBank.java          # Stores and serves questions (hardcoded for MVP)
│  └─ AnswerValidator.java       # Checks if input matches correct answer
│
└─ ui/                           # Console I/O only (System.in/out)
   └─ ConsoleIO.java             # Safe input helpers + printing

