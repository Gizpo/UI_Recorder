
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum ZoomUnit implements IComEnum {
    
    /**
     * (0)
     */
    ZoomUnit_NoAmount(0),
    
    /**
     * (1)
     */
    ZoomUnit_LargeDecrement(1),
    
    /**
     * (2)
     */
    ZoomUnit_SmallDecrement(2),
    
    /**
     * (3)
     */
    ZoomUnit_LargeIncrement(3),
    
    /**
     * (4)
     */
    ZoomUnit_SmallIncrement(4),
    ;

    private ZoomUnit(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}