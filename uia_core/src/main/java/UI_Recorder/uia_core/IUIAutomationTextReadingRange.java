
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({21063AD6-EC07-4414-90AD-EA51394BF3D0})</p>
 */
@ComInterface(iid="{21063AD6-EC07-4414-90AD-EA51394BF3D0}")
public interface IUIAutomationTextReadingRange extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pUIASelectedRange [in] {@code IUIAutomationTextRange}
     * @param pdwEndOrEmptyDocument [out] {@code Integer}
     * @param punit [out] {@code TextUnit}
     */
    @ComMethod(name = "GetTextUnitChange", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetTextUnitChange(IUIAutomationTextRange pUIASelectedRange,
            VARIANT pdwEndOrEmptyDocument,
            VARIANT punit);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param fTrimPunctuation [in] {@code Integer}
     * @param ppTrimmedRange [out] {@code IUIAutomationTextRange}
     */
    @ComMethod(name = "TrimRange", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT TrimRange(Integer fTrimPunctuation,
            VARIANT ppTrimmedRange);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param fTrimPunctuation [in] {@code Integer}
     * @param ppTrimmedRange [out] {@code IUIAutomationTextRange}
     */
    @ComMethod(name = "TrimRangeLeading", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT TrimRangeLeading(Integer fTrimPunctuation,
            VARIANT ppTrimmedRange);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param fTrimPunctuation [in] {@code Integer}
     * @param ppTrimmedRange [out] {@code IUIAutomationTextRange}
     */
    @ComMethod(name = "TrimRangeTrailing", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT TrimRangeTrailing(Integer fTrimPunctuation,
            VARIANT ppTrimmedRange);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param pdwCharacterPosition [out] {@code Integer}
     * @param pbstrBefore [out] {@code String}
     * @param pbstrAfter [out] {@code String}
     */
    @ComMethod(name = "GetCharactersAroundTheCursor", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT GetCharactersAroundTheCursor(VARIANT pdwCharacterPosition,
            VARIANT pbstrBefore,
            VARIANT pbstrAfter);
            
    
}