
package UI_Recorder.uia_client;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum TreeScope implements IComEnum {
    
    /**
     * (0)
     */
    TreeScope_None(0),
    
    /**
     * (1)
     */
    TreeScope_Element(1),
    
    /**
     * (2)
     */
    TreeScope_Children(2),
    
    /**
     * (4)
     */
    TreeScope_Descendants(4),
    
    /**
     * (8)
     */
    TreeScope_Parent(8),
    
    /**
     * (16)
     */
    TreeScope_Ancestors(16),
    
    /**
     * (7)
     */
    TreeScope_Subtree(7),
    ;

    private TreeScope(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}