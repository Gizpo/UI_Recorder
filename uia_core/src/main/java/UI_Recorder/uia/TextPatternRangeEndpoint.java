
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum TextPatternRangeEndpoint implements IComEnum {
    
    /**
     * (0)
     */
    TextPatternRangeEndpoint_Start(0),
    
    /**
     * (1)
     */
    TextPatternRangeEndpoint_End(1),
    ;

    private TextPatternRangeEndpoint(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}