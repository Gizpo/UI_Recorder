
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2360C714-4BF1-4B26-BA65-9B21316127EB})</p>
 */
@ComInterface(iid="{2360C714-4BF1-4B26-BA65-9B21316127EB}")
public interface IScrollItemProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     */
    @ComMethod(name = "ScrollIntoView", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT ScrollIntoView();
            
    
}