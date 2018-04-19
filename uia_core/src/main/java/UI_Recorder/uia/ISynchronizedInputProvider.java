
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({29DB1A06-02CE-4CF7-9B42-565D4FAB20EE})</p>
 */
@ComInterface(iid="{29DB1A06-02CE-4CF7-9B42-565D4FAB20EE}")
public interface ISynchronizedInputProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param inputType [in] {@code SynchronizedInputType}
     */
    @ComMethod(name = "StartListening", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT StartListening(SynchronizedInputType inputType);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     */
    @ComMethod(name = "Cancel", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT Cancel();
            
    
}