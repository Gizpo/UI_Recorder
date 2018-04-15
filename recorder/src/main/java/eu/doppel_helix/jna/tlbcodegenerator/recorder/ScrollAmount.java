
package eu.doppel_helix.jna.tlbcodegenerator.recorder;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum ScrollAmount implements IComEnum {
    
    /**
     * (0)
     */
    ScrollAmount_LargeDecrement(0),
    
    /**
     * (1)
     */
    ScrollAmount_SmallDecrement(1),
    
    /**
     * (2)
     */
    ScrollAmount_NoAmount(2),
    
    /**
     * (3)
     */
    ScrollAmount_LargeIncrement(3),
    
    /**
     * (4)
     */
    ScrollAmount_SmallIncrement(4),
    ;

    private ScrollAmount(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}