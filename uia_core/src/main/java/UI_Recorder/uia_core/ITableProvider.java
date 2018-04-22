
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({9C860395-97B3-490A-B52A-858CC22AF166})</p>
 */
@ComInterface(iid="{9C860395-97B3-490A-B52A-858CC22AF166}")
public interface ITableProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetRowHeaders", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetRowHeaders(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetColumnHeaders", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT GetColumnHeaders(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pRetVal [out] {@code RowOrColumnMajor}
     */
    @ComProperty(name = "RowOrColumnMajor", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowOrColumnMajor(VARIANT pRetVal);
            
    
}