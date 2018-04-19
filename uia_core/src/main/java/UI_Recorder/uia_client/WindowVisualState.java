
package UI_Recorder.uia_client;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WindowVisualState implements IComEnum {
    
    /**
     * (0)
     */
    WindowVisualState_Normal(0),
    
    /**
     * (1)
     */
    WindowVisualState_Maximized(1),
    
    /**
     * (2)
     */
    WindowVisualState_Minimized(2),
    ;

    private WindowVisualState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}