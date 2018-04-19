
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({6F6B5D35-5525-4F80-B758-85473832FFC7})</p>
 */
@ComInterface(iid="{6F6B5D35-5525-4F80-B758-85473832FFC7}")
public interface ISpreadsheetProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param Name [in] {@code com.sun.jna.platform.win32.WTypes.LPWSTR}
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetItemByName", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetItemByName(com.sun.jna.platform.win32.WTypes.LPWSTR Name,
            VARIANT pRetVal);
            
    
}