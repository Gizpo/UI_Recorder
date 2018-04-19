
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({33AC331B-943E-4020-B295-DB37784974A3})</p>
 */
@ComInterface(iid="{33AC331B-943E-4020-B295-DB37784974A3}")
public interface IAccessibleHostingElementProviders extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code IRawElementProviderFragmentRoot}
     */
    @ComMethod(name = "GetEmbeddedFragmentRoots", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetEmbeddedFragmentRoots(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pProvider [in] {@code IRawElementProviderSimple}
     * @param pidObject [out] {@code Integer}
     */
    @ComMethod(name = "GetObjectIdForProvider", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT GetObjectIdForProvider(IRawElementProviderSimple pProvider,
            VARIANT pidObject);
            
    
}