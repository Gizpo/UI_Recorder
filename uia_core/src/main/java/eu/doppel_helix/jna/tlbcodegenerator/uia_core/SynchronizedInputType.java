
package eu.doppel_helix.jna.tlbcodegenerator.uia_core;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum SynchronizedInputType implements IComEnum {
    
    /**
     * (1)
     */
    SynchronizedInputType_KeyUp(1),
    
    /**
     * (2)
     */
    SynchronizedInputType_KeyDown(2),
    
    /**
     * (4)
     */
    SynchronizedInputType_LeftMouseUp(4),
    
    /**
     * (8)
     */
    SynchronizedInputType_LeftMouseDown(8),
    
    /**
     * (16)
     */
    SynchronizedInputType_RightMouseUp(16),
    
    /**
     * (32)
     */
    SynchronizedInputType_RightMouseDown(32),
    ;

    private SynchronizedInputType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}