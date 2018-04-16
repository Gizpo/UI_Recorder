import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        initializeLogger();
        UI_Automator automator = new UI_Automator();
    }

    private static void initializeLogger(){
        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print( lc );
    }
}
