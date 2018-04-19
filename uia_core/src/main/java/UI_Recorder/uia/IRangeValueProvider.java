
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({36DC7AEF-33E6-4691-AFE1-2BE7274B3D33})</p>
 */
@ComInterface(iid="{36DC7AEF-33E6-4691-AFE1-2BE7274B3D33}")
public interface IRangeValueProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param val [in] {@code Double}
     */
    @ComMethod(name = "SetValue", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT SetValue(Double val);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComProperty(name = "Value", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "IsReadOnly", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsReadOnly(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComProperty(name = "Maximum", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaximum(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComProperty(name = "Minimum", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinimum(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010005)</p>
     * <p>vtableId(8)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComProperty(name = "LargeChange", dispId = 0x60010005)
    com.sun.jna.platform.win32.WinNT.HRESULT getLargeChange(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010006)</p>
     * <p>vtableId(9)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComProperty(name = "SmallChange", dispId = 0x60010006)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmallChange(VARIANT pRetVal);
            
    
}