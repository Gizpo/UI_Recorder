
package eu.doppel_helix.jna.tlbcodegenerator.uia_core;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum StructureChangeType implements IComEnum {
    
    /**
     * (0)
     */
    StructureChangeType_ChildAdded(0),
    
    /**
     * (1)
     */
    StructureChangeType_ChildRemoved(1),
    
    /**
     * (2)
     */
    StructureChangeType_ChildrenInvalidated(2),
    
    /**
     * (3)
     */
    StructureChangeType_ChildrenBulkAdded(3),
    
    /**
     * (4)
     */
    StructureChangeType_ChildrenBulkRemoved(4),
    
    /**
     * (5)
     */
    StructureChangeType_ChildrenReordered(5),
    ;

    private StructureChangeType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}