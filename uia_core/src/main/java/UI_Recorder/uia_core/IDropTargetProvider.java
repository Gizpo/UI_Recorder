
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({BAE82BFD-358A-481C-85A0-D8B4D90A5D61})</p>
 */
@ComInterface(iid="{BAE82BFD-358A-481C-85A0-D8B4D90A5D61}")
public interface IDropTargetProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code String}
     */
    @ComProperty(name = "DropTargetEffect", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT getDropTargetEffect(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code String}
     */
    @ComProperty(name = "DropTargetEffects", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT getDropTargetEffects(VARIANT pRetVal);
            
    
}