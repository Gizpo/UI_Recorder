
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D02541F1-FB81-4D64-AE32-F520F8A6DBD1})</p>
 */
@ComInterface(iid="{D02541F1-FB81-4D64-AE32-F520F8A6DBD1}")
public interface IGridItemProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "row", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT getRow(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "column", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumn(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "RowSpan", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowSpan(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "ColumnSpan", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnSpan(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComProperty(name = "ContainingGrid", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT getContainingGrid(VARIANT pRetVal);
            
    
}