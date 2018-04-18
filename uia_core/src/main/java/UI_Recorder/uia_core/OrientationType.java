
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OrientationType implements IComEnum {
    
    /**
     * (0)
     */
    OrientationType_None(0),
    
    /**
     * (1)
     */
    OrientationType_Horizontal(1),
    
    /**
     * (2)
     */
    OrientationType_Vertical(2),
    ;

    private OrientationType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}