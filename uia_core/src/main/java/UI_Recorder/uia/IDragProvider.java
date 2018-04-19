
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({6AA7BBBB-7FF9-497D-904F-D20B897929D8})</p>
 */
@ComInterface(iid="{6AA7BBBB-7FF9-497D-904F-D20B897929D8}")
public interface IDragProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "IsGrabbed", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsGrabbed(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pRetVal [out] {@code String}
     */
    @ComProperty(name = "DropEffect", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT getDropEffect(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pRetVal [out] {@code String}
     */
    @ComProperty(name = "DropEffects", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT getDropEffects(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetGrabbedItems", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT GetGrabbedItems(VARIANT pRetVal);
            
    
}