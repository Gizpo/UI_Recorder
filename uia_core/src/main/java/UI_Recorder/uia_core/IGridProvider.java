
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({B17D6187-0907-464B-A168-0EF17A1572B1})</p>
 */
@ComInterface(iid="{B17D6187-0907-464B-A168-0EF17A1572B1}")
public interface IGridProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param row [in] {@code Integer}
     * @param column [in] {@code Integer}
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetItem", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetItem(Integer row,
            Integer column,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "RowCount", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowCount(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "ColumnCount", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnCount(VARIANT pRetVal);
            
    
}