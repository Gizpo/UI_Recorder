
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({FB8B03AF-3BDF-48D4-BD36-1A65793BE168})</p>
 */
@ComInterface(iid="{FB8B03AF-3BDF-48D4-BD36-1A65793BE168}")
public interface ISelectionProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetSelection", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetSelection(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "CanSelectMultiple", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT getCanSelectMultiple(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "IsSelectionRequired", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsSelectionRequired(VARIANT pRetVal);
            
    
}