
package UI_Recorder.uia_client;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({58EDCA55-2C3E-4980-B1B9-56C17F27A2A0})</p>
 */
@ComInterface(iid="{58EDCA55-2C3E-4980-B1B9-56C17F27A2A0}")
public interface IUIAutomationChangesEventHandler extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param sender [in] {@code IUIAutomationElement}
     * @param uiaChanges [in] {@code UiaChangeInfo}
     * @param changesCount [in] {@code Integer}
     */
    @ComMethod(name = "HandleChangesEvent", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT HandleChangesEvent(IUIAutomationElement sender,
            UiaChangeInfo uiaChanges,
            Integer changesCount);
            
    
}