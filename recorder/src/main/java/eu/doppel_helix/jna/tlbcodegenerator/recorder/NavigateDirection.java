
package eu.doppel_helix.jna.tlbcodegenerator.recorder;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum NavigateDirection implements IComEnum {
    
    /**
     * (0)
     */
    NavigateDirection_Parent(0),
    
    /**
     * (1)
     */
    NavigateDirection_NextSibling(1),
    
    /**
     * (2)
     */
    NavigateDirection_PreviousSibling(2),
    
    /**
     * (3)
     */
    NavigateDirection_FirstChild(3),
    
    /**
     * (4)
     */
    NavigateDirection_LastChild(4),
    ;

    private NavigateDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}