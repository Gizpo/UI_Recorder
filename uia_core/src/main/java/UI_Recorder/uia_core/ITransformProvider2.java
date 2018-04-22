
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({4758742F-7AC2-460C-BC48-09FC09308A93})</p>
 */
@ComInterface(iid="{4758742F-7AC2-460C-BC48-09FC09308A93}")
public interface ITransformProvider2 extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(9)</p>
     * @param Zoom [in] {@code Double}
     */
    @ComMethod(name = "Zoom", dispId = 0x60020000)
    com.sun.jna.platform.win32.WinNT.HRESULT Zoom(Double Zoom);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(10)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "CanZoom", dispId = 0x60020001)
    com.sun.jna.platform.win32.WinNT.HRESULT getCanZoom(VARIANT pRetVal);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(11)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComProperty(name = "ZoomLevel", dispId = 0x60020002)
    com.sun.jna.platform.win32.WinNT.HRESULT getZoomLevel(VARIANT pRetVal);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(12)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComProperty(name = "ZoomMinimum", dispId = 0x60020003)
    com.sun.jna.platform.win32.WinNT.HRESULT getZoomMinimum(VARIANT pRetVal);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(13)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComProperty(name = "ZoomMaximum", dispId = 0x60020004)
    com.sun.jna.platform.win32.WinNT.HRESULT getZoomMaximum(VARIANT pRetVal);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(14)</p>
     * @param ZoomUnit [in] {@code ZoomUnit}
     */
    @ComMethod(name = "ZoomByUnit", dispId = 0x60020005)
    com.sun.jna.platform.win32.WinNT.HRESULT ZoomByUnit(ZoomUnit ZoomUnit);
            
    
}