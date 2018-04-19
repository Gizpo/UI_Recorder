
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({EA3605B4-3A05-400E-B5F9-4E91B40F6176})</p>
 */
@ComInterface(iid="{EA3605B4-3A05-400E-B5F9-4E91B40F6176}")
public interface ITextEditProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(9)</p>
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComMethod(name = "GetActiveComposition", dispId = 0x60020000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetActiveComposition(VARIANT pRetVal);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(10)</p>
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComMethod(name = "GetConversionTarget", dispId = 0x60020001)
    com.sun.jna.platform.win32.WinNT.HRESULT GetConversionTarget(VARIANT pRetVal);
            
    
}