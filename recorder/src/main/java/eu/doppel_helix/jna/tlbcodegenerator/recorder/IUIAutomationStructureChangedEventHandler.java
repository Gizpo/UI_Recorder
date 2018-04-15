
package eu.doppel_helix.jna.tlbcodegenerator.recorder;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E81D1B4E-11C5-42F8-9754-E7036C79F054})</p>
 */
@ComInterface(iid="{E81D1B4E-11C5-42F8-9754-E7036C79F054}")
public interface IUIAutomationStructureChangedEventHandler extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param sender [in] {@code IUIAutomationElement}
     * @param changeType [in] {@code StructureChangeType}
     * @param runtimeId [in] {@code Integer}
     */
    @ComMethod(name = "HandleStructureChangedEvent", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT HandleStructureChangedEvent(IUIAutomationElement sender,
            StructureChangeType changeType,
            Integer runtimeId);
            
    
}