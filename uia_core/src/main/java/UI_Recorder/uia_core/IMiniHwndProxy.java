
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({393F766C-D5EF-4CBA-BB23-935166DC30B8})</p>
 */
@ComInterface(iid="{393F766C-D5EF-4CBA-BB23-935166DC30B8}")
public interface IMiniHwndProxy extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pHwnd [out] {@code _RemotableHandle}
     */
    @ComMethod(name = "GetWindow", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetWindow(VARIANT pHwnd);
            
    
}