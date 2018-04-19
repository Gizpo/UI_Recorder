
package UI_Recorder.uia_client;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({146C3C17-F12E-4E22-8C27-F894B9B79C69})</p>
 */
@ComInterface(iid="{146C3C17-F12E-4E22-8C27-F894B9B79C69}")
public interface IUIAutomationEventHandler extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param sender [in] {@code IUIAutomationElement}
     * @param eventId [in] {@code Integer}
     */
    @ComMethod(name = "HandleAutomationEvent", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT HandleAutomationEvent(IUIAutomationElement sender,
            Integer eventId);
            
    
}