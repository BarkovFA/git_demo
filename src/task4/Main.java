package task4;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}

class Logger {

    public enum Level  {
        DEBUG, INFO, WARNING, ERROR;
    }
    private String name;
    private Level currentName;

    private Logger(String name) {
        this.name = name;
        this.currentName = Level.DEBUG;

    }



    public String getName() {
        return name;
    }

    public static Logger getLogger (String name) {

    }

    private void logMessage(Level level, String message) {

    }


    //Debug 2 method
    public void debug (String message) {
    }
    public void debug (String message, Object...args) {
    }

    //Info 2 method
    public void info (String message) {
    }
    public void info (String message, Object...args) {
    }

    //warning 2 method
    public void warning (String message) {
    }

    public void warning (String message, Object...args) {
    }

    //error 2 method
    public void error (String message) {
    }

    public void error (String message, Object...args) {
    }

    //Two method log

    public void log(String level, String message) {

    }

    public void log(String level, Object ... args) {
    }

    public void setLevel(Level level) {
        this.currentName = level;
    }

    public String getLevel() {
        return currentName;
    }

}
