
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({6829DDC4-4F91-4FFA-B86F-BD3E2987CB4C})</p>
 */
@ComInterface(iid="{6829DDC4-4F91-4FFA-B86F-BD3E2987CB4C}")
public interface ITransformProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param x [in] {@code Double}
     * @param y [in] {@code Double}
     */
    @ComMethod(name = "Move", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT Move(Double x,
            Double y);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param width [in] {@code Double}
     * @param height [in] {@code Double}
     */
    @ComMethod(name = "Resize", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT Resize(Double width,
            Double height);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param degrees [in] {@code Double}
     */
    @ComMethod(name = "Rotate", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT Rotate(Double degrees);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "CanMove", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT getCanMove(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "CanResize", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT getCanResize(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010005)</p>
     * <p>vtableId(8)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "CanRotate", dispId = 0x60010005)
    com.sun.jna.platform.win32.WinNT.HRESULT getCanRotate(VARIANT pRetVal);
            
    
}