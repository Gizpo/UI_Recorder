
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({56D00BD0-C4F4-433C-A836-1A52A57E0892})</p>
 */
@ComInterface(iid="{56D00BD0-C4F4-433C-A836-1A52A57E0892}")
public interface IToggleProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     */
    @ComMethod(name = "Toggle", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT Toggle();
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code ToggleState}
     */
    @ComProperty(name = "ToggleState", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT getToggleState(VARIANT pRetVal);
            
    
}