package shared;

import java.io.IOException;

public class ClientSpawner {

    /**
     * Launches multiple client instances in separate terminal windows.
     *
     * Example:
     *
     * ClientSpawner.spawn(5);
     */
    public static void spawn(int count)
            throws IOException {

        for (int i = 0; i < count; i++) {

            ProcessBuilder builder =
                    new ProcessBuilder(
                            "gnome-terminal",
                            "--",
                            "java",
                            "-jar",
                            "client.jar");

            builder.start();
        }
    }
}
