
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({4C2DE2B9-C88F-4F88-A111-F1D336B7D1A9})</p>
 */
@ComInterface(iid="{4C2DE2B9-C88F-4F88-A111-F1D336B7D1A9}")
public interface ITextChildProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComProperty(name = "TextContainer", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextContainer(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComProperty(name = "TextRange", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextRange(VARIANT pRetVal);
            
    
}