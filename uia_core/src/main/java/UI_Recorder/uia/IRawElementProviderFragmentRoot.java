
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({620CE2A5-AB8F-40A9-86CB-DE3C75599B58})</p>
 */
@ComInterface(iid="{620CE2A5-AB8F-40A9-86CB-DE3C75599B58}")
public interface IRawElementProviderFragmentRoot extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param x [in] {@code Double}
     * @param y [in] {@code Double}
     * @param pRetVal [out] {@code IRawElementProviderFragment}
     */
    @ComMethod(name = "ElementProviderFromPoint", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT ElementProviderFromPoint(Double x,
            Double y,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code IRawElementProviderFragment}
     */
    @ComMethod(name = "GetFocus", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT GetFocus(VARIANT pRetVal);
            
    
}