package task4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static task4.Logger.Level.*;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger("test");
        Logger logger2 = Logger.getLogger("test");
        System.out.println(logger1 == logger2);
        logger1.debug("Info about debug");
        logger1.warning("Info about warning");
        logger1.info("Info about info");
        logger1.error("Info about error");
        logger1.warning("this is info about warning message: %d", 5);
        logger1.error("this is info about error message: %d", 6);
    }
}

