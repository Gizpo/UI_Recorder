
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D6DD68D1-86FD-4332-8666-9ABEDEA2D24C})</p>
 */
@ComInterface(iid="{D6DD68D1-86FD-4332-8666-9ABEDEA2D24C}")
public interface IRawElementProviderSimple extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code ProviderOptions}
     */
    @ComProperty(name = "ProviderOptions", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT getProviderOptions(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param patternId [in] {@code Integer}
     * @param pRetVal [out] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "GetPatternProvider", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT GetPatternProvider(Integer patternId,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param propertyId [in] {@code Integer}
     * @param pRetVal [out] {@code Object}
     */
    @ComMethod(name = "GetPropertyValue", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT GetPropertyValue(Integer propertyId,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComProperty(name = "HostRawElementProvider", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT getHostRawElementProvider(VARIANT pRetVal);
            
    
}