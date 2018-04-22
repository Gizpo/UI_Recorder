
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({8609C4EC-4A1A-4D88-A357-5A66E060E1CF})</p>
 */
@ComInterface(iid="{8609C4EC-4A1A-4D88-A357-5A66E060E1CF}")
public interface IUIAutomationRegistrar extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param property [in] {@code UIAutomationPropertyInfo}
     * @param propertyId [out] {@code Integer}
     */
    @ComMethod(name = "RegisterProperty", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT RegisterProperty(UIAutomationPropertyInfo property,
            VARIANT propertyId);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param event [in] {@code UIAutomationEventInfo}
     * @param eventId [out] {@code Integer}
     */
    @ComMethod(name = "RegisterEvent", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT RegisterEvent(UIAutomationEventInfo event,
            VARIANT eventId);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pattern [in] {@code UIAutomationPatternInfo}
     * @param pPatternId [out] {@code Integer}
     * @param pPatternAvailablePropertyId [out] {@code Integer}
     * @param propertyIdCount [in] {@code Integer}
     * @param pPropertyIds [out] {@code Integer}
     * @param eventIdCount [in] {@code Integer}
     * @param pEventIds [out] {@code Integer}
     */
    @ComMethod(name = "RegisterPattern", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT RegisterPattern(UIAutomationPatternInfo pattern,
            VARIANT pPatternId,
            VARIANT pPatternAvailablePropertyId,
            Integer propertyIdCount,
            VARIANT pPropertyIds,
            Integer eventIdCount,
            VARIANT pEventIds);
            
    
}