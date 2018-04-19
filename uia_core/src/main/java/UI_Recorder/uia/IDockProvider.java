
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({159BC72C-4AD3-485E-9637-D7052EDF0146})</p>
 */
@ComInterface(iid="{159BC72C-4AD3-485E-9637-D7052EDF0146}")
public interface IDockProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param DockPosition [in] {@code DockPosition}
     */
    @ComMethod(name = "SetDockPosition", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT SetDockPosition(DockPosition DockPosition);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code DockPosition}
     */
    @ComProperty(name = "DockPosition", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT getDockPosition(VARIANT pRetVal);
            
    
}