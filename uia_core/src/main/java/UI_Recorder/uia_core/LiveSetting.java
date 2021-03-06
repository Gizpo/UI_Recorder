
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum LiveSetting implements IComEnum {
    
    /**
     * (0)
     */
    Off(0),
    
    /**
     * (1)
     */
    Polite(1),
    
    /**
     * (2)
     */
    Assertive(2),
    ;

    private LiveSetting(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}