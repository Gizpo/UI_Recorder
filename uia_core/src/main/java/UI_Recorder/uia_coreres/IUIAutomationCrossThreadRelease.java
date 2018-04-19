
package UI_Recorder.uia_coreres;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IUIAutomationCrossThreadRelease Interface
 *
 * <p>uuid({2AD63A67-F12F-4BD7-B1BF-6213290A552A})</p>
 */
@ComInterface(iid="{2AD63A67-F12F-4BD7-B1BF-6213290A552A}")
public interface IUIAutomationCrossThreadRelease extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pObjToRelease [in] {@code Long}
     */
    @ComMethod(name = "ReleaseObject", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT ReleaseObject(Long pObjToRelease);
            
    
}