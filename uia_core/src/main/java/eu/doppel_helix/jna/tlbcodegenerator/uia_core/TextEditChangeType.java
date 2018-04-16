
package eu.doppel_helix.jna.tlbcodegenerator.uia_core;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum TextEditChangeType implements IComEnum {
    
    /**
     * (0)
     */
    TextEditChangeType_None(0),
    
    /**
     * (1)
     */
    TextEditChangeType_AutoCorrect(1),
    
    /**
     * (2)
     */
    TextEditChangeType_Composition(2),
    
    /**
     * (3)
     */
    TextEditChangeType_CompositionFinalized(3),
    
    /**
     * (4)
     */
    TextEditChangeType_AutoComplete(4),
    ;

    private TextEditChangeType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}