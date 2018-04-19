
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0DC5E6ED-3E16-4BF1-8F9A-A979878BC195})</p>
 */
@ComInterface(iid="{0DC5E6ED-3E16-4BF1-8F9A-A979878BC195}")
public interface ITextProvider2 extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(9)</p>
     * @param annotationElement [in] {@code IRawElementProviderSimple}
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComMethod(name = "RangeFromAnnotation", dispId = 0x60020000)
    com.sun.jna.platform.win32.WinNT.HRESULT RangeFromAnnotation(IRawElementProviderSimple annotationElement,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(10)</p>
     * @param isActive [out] {@code Integer}
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComMethod(name = "GetCaretRange", dispId = 0x60020001)
    com.sun.jna.platform.win32.WinNT.HRESULT GetCaretRange(VARIANT isActive,
            VARIANT pRetVal);
            
    
}