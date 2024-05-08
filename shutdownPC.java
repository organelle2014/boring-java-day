import java.io.IOException;

public class shutdownPC {
    public static void main(String[] args) {

        Runtime run = Runtime.getRuntime();

        try {
            // run.exec("shutdown /s /t 60"); // shutdown pc in 60 seconds
            // run.exec("shutown / r"); // restart pc
            // run.exec("showtdown /l");// logoff pc
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
