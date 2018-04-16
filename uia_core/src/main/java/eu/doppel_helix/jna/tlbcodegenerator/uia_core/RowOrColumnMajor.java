
package eu.doppel_helix.jna.tlbcodegenerator.uia_core;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum RowOrColumnMajor implements IComEnum {
    
    /**
     * (0)
     */
    RowOrColumnMajor_RowMajor(0),
    
    /**
     * (1)
     */
    RowOrColumnMajor_ColumnMajor(1),
    
    /**
     * (2)
     */
    RowOrColumnMajor_Indeterminate(2),
    ;

    private RowOrColumnMajor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}