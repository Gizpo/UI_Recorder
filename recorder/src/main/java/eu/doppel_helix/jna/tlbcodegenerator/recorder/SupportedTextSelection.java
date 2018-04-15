
package eu.doppel_helix.jna.tlbcodegenerator.recorder;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum SupportedTextSelection implements IComEnum {
    
    /**
     * (0)
     */
    SupportedTextSelection_None(0),
    
    /**
     * (1)
     */
    SupportedTextSelection_Single(1),
    
    /**
     * (2)
     */
    SupportedTextSelection_Multiple(2),
    ;

    private SupportedTextSelection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}