
package eu.doppel_helix.jna.tlbcodegenerator.uia_core;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum NotificationKind implements IComEnum {
    
    /**
     * (0)
     */
    NotificationKind_ItemAdded(0),
    
    /**
     * (1)
     */
    NotificationKind_ItemRemoved(1),
    
    /**
     * (2)
     */
    NotificationKind_ActionCompleted(2),
    
    /**
     * (3)
     */
    NotificationKind_ActionAborted(3),
    
    /**
     * (4)
     */
    NotificationKind_Other(4),
    ;

    private NotificationKind(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}