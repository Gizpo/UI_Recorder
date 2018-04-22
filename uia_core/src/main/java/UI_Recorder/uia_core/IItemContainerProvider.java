
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E747770B-39CE-4382-AB30-D8FB3F336F24})</p>
 */
@ComInterface(iid="{E747770B-39CE-4382-AB30-D8FB3F336F24}")
public interface IItemContainerProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pStartAfter [in] {@code IRawElementProviderSimple}
     * @param propertyId [in] {@code Integer}
     * @param Value [in] {@code Object}
     * @param pFound [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "FindItemByProperty", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT FindItemByProperty(IRawElementProviderSimple pStartAfter,
            Integer propertyId,
            Object Value,
            VARIANT pFound);
            
    
}