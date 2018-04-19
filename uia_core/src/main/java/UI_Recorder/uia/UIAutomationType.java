
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum UIAutomationType implements IComEnum {
    
    /**
     * (1)
     */
    UIAutomationType_Int(1),
    
    /**
     * (2)
     */
    UIAutomationType_Bool(2),
    
    /**
     * (3)
     */
    UIAutomationType_String(3),
    
    /**
     * (4)
     */
    UIAutomationType_Double(4),
    
    /**
     * (5)
     */
    UIAutomationType_Point(5),
    
    /**
     * (6)
     */
    UIAutomationType_Rect(6),
    
    /**
     * (7)
     */
    UIAutomationType_Element(7),
    
    /**
     * (65536)
     */
    UIAutomationType_Array(65536),
    
    /**
     * (131072)
     */
    UIAutomationType_Out(131072),
    
    /**
     * (65537)
     */
    UIAutomationType_IntArray(65537),
    
    /**
     * (65538)
     */
    UIAutomationType_BoolArray(65538),
    
    /**
     * (65539)
     */
    UIAutomationType_StringArray(65539),
    
    /**
     * (65540)
     */
    UIAutomationType_DoubleArray(65540),
    
    /**
     * (65541)
     */
    UIAutomationType_PointArray(65541),
    
    /**
     * (65542)
     */
    UIAutomationType_RectArray(65542),
    
    /**
     * (65543)
     */
    UIAutomationType_ElementArray(65543),
    
    /**
     * (131073)
     */
    UIAutomationType_OutInt(131073),
    
    /**
     * (131074)
     */
    UIAutomationType_OutBool(131074),
    
    /**
     * (131075)
     */
    UIAutomationType_OutString(131075),
    
    /**
     * (131076)
     */
    UIAutomationType_OutDouble(131076),
    
    /**
     * (131077)
     */
    UIAutomationType_OutPoint(131077),
    
    /**
     * (131078)
     */
    UIAutomationType_OutRect(131078),
    
    /**
     * (131079)
     */
    UIAutomationType_OutElement(131079),
    
    /**
     * (196609)
     */
    UIAutomationType_OutIntArray(196609),
    
    /**
     * (196610)
     */
    UIAutomationType_OutBoolArray(196610),
    
    /**
     * (196611)
     */
    UIAutomationType_OutStringArray(196611),
    
    /**
     * (196612)
     */
    UIAutomationType_OutDoubleArray(196612),
    
    /**
     * (196613)
     */
    UIAutomationType_OutPointArray(196613),
    
    /**
     * (196614)
     */
    UIAutomationType_OutRectArray(196614),
    
    /**
     * (196615)
     */
    UIAutomationType_OutElementArray(196615),
    ;

    private UIAutomationType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}