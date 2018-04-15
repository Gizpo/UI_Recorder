import mmarquee.automation.AutomationElement;
import mmarquee.automation.AutomationException;
import mmarquee.automation.UIAutomation;
import mmarquee.automation.controls.AutomationTreeView;
import mmarquee.automation.controls.AutomationWindow;
import mmarquee.automation.pattern.PatternNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UI_Automator {
   private UIAutomation automation;
   final Logger logger = LoggerFactory.getLogger(UI_Automator.class);

    public UI_Automator(){
        logger.info( "Initializing UI Automation Interface" );
        automation = UIAutomation.getInstance();
    }

    protected void generateAutomationTree() throws PatternNotFoundException, AutomationException {
        AutomationElement root = automation.getRootElement();
        logger.info( root.getName() );
    }

}
