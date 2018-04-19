
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum AutomationElementMode implements IComEnum {
    
    /**
     * (0)
     */
    AutomationElementMode_None(0),
    
    /**
     * (1)
     */
    AutomationElementMode_Full(1),
    ;

    private AutomationElementMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}