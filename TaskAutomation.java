import java.io.IOException;

public class TaskAutomation {
    public static void main(String[] args) {
        openChrome("https://www.youtube.com/");
    }

    public static void openChrome(String url){
        String[] command = {"cmd","/c","start",url};
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        try {
            processBuilder.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
