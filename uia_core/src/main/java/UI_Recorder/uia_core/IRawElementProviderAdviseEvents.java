
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({A407B27B-0F6D-4427-9292-473C7BF93258})</p>
 */
@ComInterface(iid="{A407B27B-0F6D-4427-9292-473C7BF93258}")
public interface IRawElementProviderAdviseEvents extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param eventId [in] {@code Integer}
     * @param propertyIDs [in] {@code Integer}
     */
    @ComMethod(name = "AdviseEventAdded", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT AdviseEventAdded(Integer eventId,
            Integer propertyIDs);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param eventId [in] {@code Integer}
     * @param propertyIDs [in] {@code Integer}
     */
    @ComMethod(name = "AdviseEventRemoved", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT AdviseEventRemoved(Integer eventId,
            Integer propertyIDs);
            
    
}