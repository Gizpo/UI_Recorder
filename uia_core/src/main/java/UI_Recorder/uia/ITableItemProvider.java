
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({B9734FA6-771F-4D78-9C90-2517999349CD})</p>
 */
@ComInterface(iid="{B9734FA6-771F-4D78-9C90-2517999349CD}")
public interface ITableItemProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetRowHeaderItems", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetRowHeaderItems(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetColumnHeaderItems", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT GetColumnHeaderItems(VARIANT pRetVal);
            
    
}