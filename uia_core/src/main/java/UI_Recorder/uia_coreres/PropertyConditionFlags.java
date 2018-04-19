
package UI_Recorder.uia_coreres;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum PropertyConditionFlags implements IComEnum {
    
    /**
     * (0)
     */
    PropertyConditionFlags_None(0),
    
    /**
     * (1)
     */
    PropertyConditionFlags_IgnoreCase(1),
    ;

    private PropertyConditionFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}