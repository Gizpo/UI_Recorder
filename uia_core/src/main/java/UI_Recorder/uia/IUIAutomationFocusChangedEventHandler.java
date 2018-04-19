
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C270F6B5-5C69-4290-9745-7A7F97169468})</p>
 */
@ComInterface(iid="{C270F6B5-5C69-4290-9745-7A7F97169468}")
public interface IUIAutomationFocusChangedEventHandler extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param sender [in] {@code IUIAutomationElement}
     */
    @ComMethod(name = "HandleFocusChangedEvent", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT HandleFocusChangedEvent(IUIAutomationElement sender);
            
    
}