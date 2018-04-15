
package eu.doppel_helix.jna.tlbcodegenerator.recorder;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum ExpandCollapseState implements IComEnum {
    
    /**
     * (0)
     */
    ExpandCollapseState_Collapsed(0),
    
    /**
     * (1)
     */
    ExpandCollapseState_Expanded(1),
    
    /**
     * (2)
     */
    ExpandCollapseState_PartiallyExpanded(2),
    
    /**
     * (3)
     */
    ExpandCollapseState_LeafNode(3),
    ;

    private ExpandCollapseState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}