
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({6278CAB1-B556-4A1A-B4E0-418ACC523201})</p>
 */
@ComInterface(iid="{6278CAB1-B556-4A1A-B4E0-418ACC523201}")
public interface IMultipleViewProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param viewId [in] {@code Integer}
     * @param pRetVal [out] {@code String}
     */
    @ComMethod(name = "GetViewName", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetViewName(Integer viewId,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param viewId [in] {@code Integer}
     */
    @ComMethod(name = "SetCurrentView", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT SetCurrentView(Integer viewId);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "CurrentView", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT getCurrentView(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComMethod(name = "GetSupportedViews", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT GetSupportedViews(VARIANT pRetVal);
            
    
}