
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3589C92C-63F3-4367-99BB-ADA653B77CF2})</p>
 */
@ComInterface(iid="{3589C92C-63F3-4367-99BB-ADA653B77CF2}")
public interface ITextProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComMethod(name = "GetSelection", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetSelection(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComMethod(name = "GetVisibleRanges", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT GetVisibleRanges(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param childElement [in] {@code IRawElementProviderSimple}
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComMethod(name = "RangeFromChild", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT RangeFromChild(IRawElementProviderSimple childElement,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param point [in] {@code UiaPoint}
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComMethod(name = "RangeFromPoint", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT RangeFromPoint(UiaPoint point,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComProperty(name = "DocumentRange", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT getDocumentRange(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010005)</p>
     * <p>vtableId(8)</p>
     * @param pRetVal [out] {@code SupportedTextSelection}
     */
    @ComProperty(name = "SupportedTextSelection", dispId = 0x60010005)
    com.sun.jna.platform.win32.WinNT.HRESULT getSupportedTextSelection(VARIANT pRetVal);
            
    
}