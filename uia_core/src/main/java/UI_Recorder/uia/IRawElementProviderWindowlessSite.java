
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0A2A93CC-BFAD-42AC-9B2E-0991FB0D3EA0})</p>
 */
@ComInterface(iid="{0A2A93CC-BFAD-42AC-9B2E-0991FB0D3EA0}")
public interface IRawElementProviderWindowlessSite extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param direction [in] {@code NavigateDirection}
     * @param ppParent [out] {@code IRawElementProviderFragment}
     */
    @ComMethod(name = "GetAdjacentFragment", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetAdjacentFragment(NavigateDirection direction,
            VARIANT ppParent);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComMethod(name = "GetRuntimeIdPrefix", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT GetRuntimeIdPrefix(VARIANT pRetVal);
            
    
}