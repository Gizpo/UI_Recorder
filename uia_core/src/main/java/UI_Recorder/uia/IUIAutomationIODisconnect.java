
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IUIAutomationIODisconnect Interface
 *
 * <p>uuid({E87645F8-F771-4847-8F57-E030E9F03D5F})</p>
 */
@ComInterface(iid="{E87645F8-F771-4847-8F57-E030E9F03D5F}")
public interface IUIAutomationIODisconnect extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRuntimeId [in] {@code Long}
     */
    @ComMethod(name = "DisconnectProvider", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT DisconnectProvider(Long pRuntimeId);
            
    
}