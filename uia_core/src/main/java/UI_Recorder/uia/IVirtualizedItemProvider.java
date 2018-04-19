
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({CB98B665-2D35-4FAC-AD35-F3C60D0C0B8B})</p>
 */
@ComInterface(iid="{CB98B665-2D35-4FAC-AD35-F3C60D0C0B8B}")
public interface IVirtualizedItemProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     */
    @ComMethod(name = "Realize", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT Realize();
            
    
}