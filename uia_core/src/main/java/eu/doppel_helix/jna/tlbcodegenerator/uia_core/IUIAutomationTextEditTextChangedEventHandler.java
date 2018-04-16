
package eu.doppel_helix.jna.tlbcodegenerator.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({92FAA680-E704-4156-931A-E32D5BB38F3F})</p>
 */
@ComInterface(iid="{92FAA680-E704-4156-931A-E32D5BB38F3F}")
public interface IUIAutomationTextEditTextChangedEventHandler extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param sender [in] {@code IUIAutomationElement}
     * @param TextEditChangeType [in] {@code TextEditChangeType}
     * @param eventStrings [in] {@code String}
     */
    @ComMethod(name = "HandleTextEditTextChangedEvent", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT HandleTextEditTextChangedEvent(IUIAutomationElement sender,
            TextEditChangeType TextEditChangeType,
            String eventStrings);
            
    
}