
package eu.doppel_helix.jna.tlbcodegenerator.recorder;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum DockPosition implements IComEnum {
    
    /**
     * (0)
     */
    DockPosition_Top(0),
    
    /**
     * (1)
     */
    DockPosition_Left(1),
    
    /**
     * (2)
     */
    DockPosition_Bottom(2),
    
    /**
     * (3)
     */
    DockPosition_Right(3),
    
    /**
     * (4)
     */
    DockPosition_Fill(4),
    
    /**
     * (5)
     */
    DockPosition_None(5),
    ;

    private DockPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}