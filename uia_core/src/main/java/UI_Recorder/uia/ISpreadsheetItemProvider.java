
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({EAED4660-7B3D-4879-A2E6-365CE603F3D0})</p>
 */
@ComInterface(iid="{EAED4660-7B3D-4879-A2E6-365CE603F3D0}")
public interface ISpreadsheetItemProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetAnnotationObjects", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT GetAnnotationObjects(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComMethod(name = "GetAnnotationTypes", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT GetAnnotationTypes(VARIANT pRetVal);
            
    
}