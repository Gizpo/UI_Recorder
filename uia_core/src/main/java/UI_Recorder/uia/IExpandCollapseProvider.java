
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D847D3A5-CAB0-4A98-8C32-ECB45C59AD24})</p>
 */
@ComInterface(iid="{D847D3A5-CAB0-4A98-8C32-ECB45C59AD24}")
public interface IExpandCollapseProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     */
    @ComMethod(name = "Expand", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT Expand();
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     */
    @ComMethod(name = "Collapse", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT Collapse();
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pRetVal [out] {@code ExpandCollapseState}
     */
    @ComProperty(name = "ExpandCollapseState", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT getExpandCollapseState(VARIANT pRetVal);
            
    
}