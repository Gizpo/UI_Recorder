
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({F7063DA8-8359-439C-9297-BBC5299A7D87})</p>
 */
@ComInterface(iid="{F7063DA8-8359-439C-9297-BBC5299A7D87}")
public interface IRawElementProviderFragment extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param direction [in] {@code NavigateDirection}
     * @param pRetVal [out] {@code IRawElementProviderFragment}
     */
    @ComMethod(name = "Navigate", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT Navigate(NavigateDirection direction,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComMethod(name = "GetRuntimeId", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT GetRuntimeId(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pRetVal [out] {@code UiaRect}
     */
    @ComMethod(name = "get_BoundingRectangle", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT get_BoundingRectangle(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param pRetVal [out] {@code IRawElementProviderFragmentRoot}
     */
    @ComMethod(name = "GetEmbeddedFragmentRoots", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT GetEmbeddedFragmentRoots(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "SetFocus", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT SetFocus();
            
    /**
     * <p>id(0x60010005)</p>
     * <p>vtableId(8)</p>
     * @param pRetVal [out] {@code IRawElementProviderFragmentRoot}
     */
    @ComProperty(name = "FragmentRoot", dispId = 0x60010005)
    com.sun.jna.platform.win32.WinNT.HRESULT getFragmentRoot(VARIANT pRetVal);
            
    
}