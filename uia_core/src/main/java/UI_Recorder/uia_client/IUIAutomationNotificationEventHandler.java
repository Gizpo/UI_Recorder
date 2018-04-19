
package UI_Recorder.uia_client;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C7CB2637-E6C2-4D0C-85DE-4948C02175C7})</p>
 */
@ComInterface(iid="{C7CB2637-E6C2-4D0C-85DE-4948C02175C7}")
public interface IUIAutomationNotificationEventHandler extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param sender [in] {@code IUIAutomationElement}
     * @param NotificationKind [] {@code NotificationKind}
     * @param NotificationProcessing [] {@code NotificationProcessing}
     * @param displayString [in] {@code String}
     * @param activityId [in] {@code String}
     */
    @ComMethod(name = "HandleNotificationEvent", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT HandleNotificationEvent(IUIAutomationElement sender,
            NotificationKind NotificationKind,
            NotificationProcessing NotificationProcessing,
            String displayString,
            String activityId);
            
    
}