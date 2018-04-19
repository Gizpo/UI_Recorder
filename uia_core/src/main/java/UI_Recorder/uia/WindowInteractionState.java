
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WindowInteractionState implements IComEnum {
    
    /**
     * (0)
     */
    WindowInteractionState_Running(0),
    
    /**
     * (1)
     */
    WindowInteractionState_Closing(1),
    
    /**
     * (2)
     */
    WindowInteractionState_ReadyForUserInteraction(2),
    
    /**
     * (3)
     */
    WindowInteractionState_BlockedByModalWindow(3),
    
    /**
     * (4)
     */
    WindowInteractionState_NotResponding(4),
    ;

    private WindowInteractionState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}