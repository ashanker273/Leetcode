package org.apple;

import java.util.logging.Logger;

/**
 * Entry point for the sample Apple application.
 * <p>
 * This class provides a small, well-formatted example of a Java CLI application
 * with proper naming conventions and logging.
 */
public final class AppleMain {
    private static final Logger LOGGER = Logger.getLogger(AppleMain.class.getName());

    private AppleMain() {
        // Prevent instantiation
    }

    /**
     * Main method. Prints a greeting and echoes provided arguments.
     *
     * @param args CLI arguments
     */
    public static void main(String[] args) {
        LOGGER.info("Hello Apple");
        if (args != null && args.length > 0) {
            LOGGER.info("Arguments: " + String.join(" ", args));
        }
    }
}
