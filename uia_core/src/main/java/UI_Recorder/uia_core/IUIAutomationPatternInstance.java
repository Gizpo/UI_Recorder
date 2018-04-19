
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C03A7FE4-9431-409F-BED8-AE7C2299BC8D})</p>
 */
@ComInterface(iid="{C03A7FE4-9431-409F-BED8-AE7C2299BC8D}")
public interface IUIAutomationPatternInstance extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param index [in] {@code Integer}
     * @param cached [in] {@code Integer}
     * @param type [in] {@code UIAutomationType}
     * @param pPtr [out] {@code Object}
     */
    @ComMethod(name = "GetProperty", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetProperty(Integer index,
            Integer cached,
            UIAutomationType type,
            VARIANT pPtr);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param index [in] {@code Integer}
     * @param pParams [in] {@code UIAutomationParameter}
     * @param cParams [in] {@code Integer}
     */
    @ComMethod(name = "CallMethod", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT CallMethod(Integer index,
            UIAutomationParameter pParams,
            Integer cParams);
            
    
}