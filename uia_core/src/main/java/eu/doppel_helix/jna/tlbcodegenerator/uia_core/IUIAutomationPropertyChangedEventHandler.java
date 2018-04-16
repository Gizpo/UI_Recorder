
package eu.doppel_helix.jna.tlbcodegenerator.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({40CD37D4-C756-4B0C-8C6F-BDDFEEB13B50})</p>
 */
@ComInterface(iid="{40CD37D4-C756-4B0C-8C6F-BDDFEEB13B50}")
public interface IUIAutomationPropertyChangedEventHandler extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param sender [in] {@code IUIAutomationElement}
     * @param propertyId [in] {@code Integer}
     * @param newValue [in] {@code Object}
     */
    @ComMethod(name = "HandlePropertyChangedEvent", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT HandlePropertyChangedEvent(IUIAutomationElement sender,
            Integer propertyId,
            Object newValue);
            
    
}