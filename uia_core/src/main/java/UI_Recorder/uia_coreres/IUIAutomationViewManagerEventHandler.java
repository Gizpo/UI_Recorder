
package UI_Recorder.uia_coreres;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IUIAutomationViewManagerEventHandler Interface
 *
 * <p>uuid({0941D2BA-E6C1-42CD-A101-7698A78D3DF4})</p>
 */
@ComInterface(iid="{0941D2BA-E6C1-42CD-A101-7698A78D3DF4}")
public interface IUIAutomationViewManagerEventHandler extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param viewId [in] {@code Integer}
     * @param isCrossMachine [in] {@code Integer}
     */
    @ComMethod(name = "HandleViewAdded", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT HandleViewAdded(Integer viewId,
            Integer isCrossMachine);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param viewId [in] {@code Integer}
     * @param isCrossMachine [in] {@code Integer}
     */
    @ComMethod(name = "HandleViewRemoved", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT HandleViewRemoved(Integer viewId,
            Integer isCrossMachine);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param activeViewId [in] {@code Integer}
     * @param isCrossMachine [in] {@code Integer}
     */
    @ComMethod(name = "HandleActiveViewChanged", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT HandleActiveViewChanged(Integer activeViewId,
            Integer isCrossMachine);
            
    
}