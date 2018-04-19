
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({F8B80ADA-2C44-48D0-89BE-5FF23C9CD875})</p>
 */
@ComInterface(iid="{F8B80ADA-2C44-48D0-89BE-5FF23C9CD875}")
public interface IAccessibleEx extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param idChild [in] {@code Integer}
     * @param pRetVal [out] {@code IAccessibleEx}
     */
    @ComMethod(name = "GetObjectForChild", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetObjectForChild(Integer idChild,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param ppAcc [out] {@code IAccessible}
     * @param pidChild [out] {@code Integer}
     */
    @ComMethod(name = "GetIAccessiblePair", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT GetIAccessiblePair(VARIANT ppAcc,
            VARIANT pidChild);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComMethod(name = "GetRuntimeId", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT GetRuntimeId(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param pIn [in] {@code IRawElementProviderSimple}
     * @param ppRetValOut [out] {@code IAccessibleEx}
     */
    @ComMethod(name = "ConvertReturnedElement", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT ConvertReturnedElement(IRawElementProviderSimple pIn,
            VARIANT ppRetValOut);
            
    
}