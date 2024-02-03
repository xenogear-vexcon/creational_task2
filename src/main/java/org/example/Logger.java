package org.example;

public class Logger {
    private static Logger logger;
    protected int num = 1;

    private Logger() {
    }

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
