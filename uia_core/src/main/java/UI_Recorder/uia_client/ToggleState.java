
package UI_Recorder.uia_client;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum ToggleState implements IComEnum {
    
    /**
     * (0)
     */
    ToggleState_Off(0),
    
    /**
     * (1)
     */
    ToggleState_On(1),
    
    /**
     * (2)
     */
    ToggleState_Indeterminate(2),
    ;

    private ToggleState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}