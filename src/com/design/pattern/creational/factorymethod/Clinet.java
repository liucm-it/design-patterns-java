package design.pattern.creational.factorymethod;

public class Clinet {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new FileLoggerFactory();
        Logger logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}
