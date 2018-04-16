
package eu.doppel_helix.jna.tlbcodegenerator.uia_core;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum NotificationProcessing implements IComEnum {
    
    /**
     * (0)
     */
    NotificationProcessing_ImportantAll(0),
    
    /**
     * (1)
     */
    NotificationProcessing_ImportantMostRecent(1),
    
    /**
     * (2)
     */
    NotificationProcessing_All(2),
    
    /**
     * (3)
     */
    NotificationProcessing_MostRecent(3),
    
    /**
     * (4)
     */
    NotificationProcessing_CurrentThenMostRecent(4),
    ;

    private NotificationProcessing(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}