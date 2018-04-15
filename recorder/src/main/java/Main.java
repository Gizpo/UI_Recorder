import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import mmarquee.automation.AutomationException;
import mmarquee.automation.pattern.PatternNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        initializeLogger();
            UI_Automator automator = new UI_Automator();
        try {
            automator.generateAutomationTree();
        } catch (PatternNotFoundException e) {
            e.printStackTrace();
        } catch (AutomationException e) {
            e.printStackTrace();
        }
    }

    private static void initializeLogger(){
        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print( lc );
    }
}
