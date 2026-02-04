// File: src/main/java/mindwars/ui/ConsoleIO.java
// AI TAG: AI-generated (ChatGPT)

package mindwars.ui;

import java.util.Scanner;

/**
 * PURPOSE:
 * - The only class allowed to interact with the console (System.in/out).
 * - Provides safe input helpers so the rest of the code never crashes on bad input.
 *
 * @TODO (MVP):
 * - Internally use Scanner or BufferedReader (Scanner is easiest).
 * - Implement:
 *   - println(String)
 *   - readLine(String prompt)
 *   - readNonEmptyString(String prompt): keep prompting until not empty
 *   - readIntInRange(String prompt, min, max): keep prompting until valid int in range
 *
 * @TODO (quality):
 * - Normalize inputs where relevant (trim).
 * - Never throw exceptions to caller (handle & re-prompt internally).
 */
public class ConsoleIO {

    // @TODO: private final Scanner scanner = new Scanner(System.in);

    public ConsoleIO() {
        // @TODO initialize scanner/reader
    }

    public void println(String s) {
        // @TODO
    }

    public String readLine(String prompt) {
        // @TODO
        return "";
    }

    public String readNonEmptyString(String prompt) {
        // @TODO
        return "";
    }

    public int readIntInRange(String prompt, int minInclusive, int maxInclusive) {
        // @TODO
        return 0;
    }
}