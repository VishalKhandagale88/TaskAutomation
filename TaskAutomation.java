public class TaskAutomation {
    public static void main(String[] args) {

    }

    public static void openChrome(String url){
        String[] command = {"cmd","/c","start",url};
        ProcessBuilder processBuilder = new ProcessBuilder(command);

    }
}
