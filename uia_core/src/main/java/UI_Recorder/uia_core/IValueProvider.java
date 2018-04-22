
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C7935180-6FB3-4201-B174-7DF73ADBF64A})</p>
 */
@ComInterface(iid="{C7935180-6FB3-4201-B174-7DF73ADBF64A}")
public interface IValueProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param val [in] {@code com.sun.jna.platform.win32.WTypes.LPWSTR}
     */
    @ComMethod(name = "SetValue", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT SetValue(com.sun.jna.platform.win32.WTypes.LPWSTR val);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code String}
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
            
    
}