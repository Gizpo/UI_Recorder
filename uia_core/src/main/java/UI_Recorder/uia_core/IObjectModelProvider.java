
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3AD86EBD-F5EF-483D-BB18-B1042A475D64})</p>
 */
@ComInterface(iid="{3AD86EBD-F5EF-483D-BB18-B1042A475D64}")
public interface IObjectModelProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param ppUnknown [out] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "GetUnderlyingObjectModel", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetUnderlyingObjectModel(VARIANT ppUnknown);
            
    
}