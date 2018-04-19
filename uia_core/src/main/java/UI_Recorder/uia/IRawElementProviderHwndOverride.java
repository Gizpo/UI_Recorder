
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({1D5DF27C-8947-4425-B8D9-79787BB460B8})</p>
 */
@ComInterface(iid="{1D5DF27C-8947-4425-B8D9-79787BB460B8}")
public interface IRawElementProviderHwndOverride extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param hwnd [in] {@code _RemotableHandle}
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetOverrideProviderForHwnd", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetOverrideProviderForHwnd(_RemotableHandle hwnd,
            VARIANT pRetVal);
            
    
}