package task4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static task4.Logger.Level.*;

public class Logger {

    public enum Level {
        DEBUG, INFO, WARNING, ERROR;
    }

    private static final String DATA_FORMAT = "yyyy.MM.dd";
    private static final String TIME_FORMAT = "HH:mm:ss";
    private String name;
    private Level currentLevel;
    private static final Map<String, Logger> loggers = new HashMap<>();

    private Logger(String name) {
        this.name = name;
        this.currentLevel = DEBUG;

    }

    public static Logger getLogger(String name) {
        return loggers.get(name);
    }

    public String getName() {
        return name;
    }


    //Debug 2 method
    public void debug(String message) {
        logMessage(Level.DEBUG, message);
    }

    public void debug(String message, Object... args) {
        logMessage(DEBUG, String.format(message, args));
    }

    //Info 2 method
    public void info(String message) {
        logMessage(INFO, message);
    }

    public void info(String message, Object... args) {
        logMessage(INFO, String.format(message, args));
    }

    //warning 2 method
    public void warning(String message) {
        logMessage(WARNING, message);
    }

    public void warning(String message, Object... args) {
        logMessage(WARNING, String.format(message, args));
    }

    //error 2 method
    public void error(String message) {
        logMessage(ERROR, message);
    }

    public void error(String message, Object... args) {
        logMessage(ERROR, String.format(message, args));
    }

    //Two method log

    public void log(String level, String message) {
        logMessage(Level.valueOf(level), message);

    }

    public void log(String level, String message, Object... args) {
        logMessage(Level.valueOf(level), String.format(message, args));
    }

    public void setLevel(Level level) {
        this.currentLevel = level;
    }

    public Level getLevel() {
        return currentLevel;
    }

    private void logMessage(Level level, String message) {
        if (level.ordinal() >= currentLevel.ordinal()) {
            String data = new SimpleDateFormat(DATA_FORMAT).format(new Date());
            String time = new SimpleDateFormat(TIME_FORMAT).format(new Date());
            System.out.printf("[%s] %s %s - %s%n", level, data, time, name, message);
        }

    }

}
