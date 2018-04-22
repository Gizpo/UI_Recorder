
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({24BE0B07-D37D-487A-98CF-A13ED465E9B3})</p>
 */
@ComInterface(iid="{24BE0B07-D37D-487A-98CF-A13ED465E9B3}")
public interface IRawElementProviderHostingAccessibles extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code IAccessible}
     */
    @ComMethod(name = "GetEmbeddedAccessibles", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetEmbeddedAccessibles(VARIANT pRetVal);
            
    
}