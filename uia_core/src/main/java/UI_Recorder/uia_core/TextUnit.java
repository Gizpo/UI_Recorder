
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum TextUnit implements IComEnum {
    
    /**
     * (0)
     */
    TextUnit_Character(0),
    
    /**
     * (1)
     */
    TextUnit_Format(1),
    
    /**
     * (2)
     */
    TextUnit_Word(2),
    
    /**
     * (3)
     */
    TextUnit_Line(3),
    
    /**
     * (4)
     */
    TextUnit_Paragraph(4),
    
    /**
     * (5)
     */
    TextUnit_Page(5),
    
    /**
     * (6)
     */
    TextUnit_Document(6),
    ;

    private TextUnit(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}