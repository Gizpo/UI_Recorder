
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2062A28A-8C07-4B94-8E12-7037C622AEB8})</p>
 */
@ComInterface(iid="{2062A28A-8C07-4B94-8E12-7037C622AEB8}")
public interface ICustomNavigationProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param direction [in] {@code NavigateDirection}
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "Navigate", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT Navigate(NavigateDirection direction,
            VARIANT pRetVal);
            
    
}