
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D97022F3-A947-465E-8B2A-AC4315FA54E8})</p>
 */
@ComInterface(iid="{D97022F3-A947-465E-8B2A-AC4315FA54E8}")
public interface IUIAutomationPatternHandler extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pPatternInstance [in] {@code IUIAutomationPatternInstance}
     * @param pClientWrapper [out] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "CreateClientWrapper", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT CreateClientWrapper(IUIAutomationPatternInstance pPatternInstance,
            VARIANT pClientWrapper);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pTarget [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param index [in] {@code Integer}
     * @param pParams [in] {@code UIAutomationParameter}
     * @param cParams [in] {@code Integer}
     */
    @ComMethod(name = "Dispatch", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT Dispatch(com.sun.jna.platform.win32.COM.util.IUnknown pTarget,
            Integer index,
            UIAutomationParameter pParams,
            Integer cParams);
            
    
}