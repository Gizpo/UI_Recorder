
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum TreeTraversalOptions implements IComEnum {
    
    /**
     * (0)
     */
    TreeTraversalOptions_Default(0),
    
    /**
     * (1)
     */
    TreeTraversalOptions_PostOrder(1),
    
    /**
     * (2)
     */
    TreeTraversalOptions_LastToFirstOrder(2),
    ;

    private TreeTraversalOptions(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}