
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({4FD82B78-A43E-46AC-9803-0A6969C7C183})</p>
 */
@ComInterface(iid="{4FD82B78-A43E-46AC-9803-0A6969C7C183}")
public interface IProxyProviderWinEventSink extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pProvider [in] {@code IRawElementProviderSimple}
     * @param id [in] {@code Integer}
     * @param newValue [in] {@code Object}
     */
    @ComMethod(name = "AddAutomationPropertyChangedEvent", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT AddAutomationPropertyChangedEvent(IRawElementProviderSimple pProvider,
            Integer id,
            Object newValue);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pProvider [in] {@code IRawElementProviderSimple}
     * @param id [in] {@code Integer}
     */
    @ComMethod(name = "AddAutomationEvent", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT AddAutomationEvent(IRawElementProviderSimple pProvider,
            Integer id);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pProvider [in] {@code IRawElementProviderSimple}
     * @param StructureChangeType [in] {@code StructureChangeType}
     * @param runtimeId [in] {@code Integer}
     */
    @ComMethod(name = "AddStructureChangedEvent", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT AddStructureChangedEvent(IRawElementProviderSimple pProvider,
            StructureChangeType StructureChangeType,
            Integer runtimeId);
            
    
}