
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({14F68475-EE1C-44F6-A869-D239381F0FE7})</p>
 */
@ComInterface(iid="{14F68475-EE1C-44F6-A869-D239381F0FE7}")
public interface ISelectionProvider2 extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(6)</p>
     * @param retVal [out] {@code IRawElementProviderSimple}
     */
    @ComProperty(name = "FirstSelectedItem", dispId = 0x60020000)
    com.sun.jna.platform.win32.WinNT.HRESULT getFirstSelectedItem(VARIANT retVal);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(7)</p>
     * @param retVal [out] {@code IRawElementProviderSimple}
     */
    @ComProperty(name = "LastSelectedItem", dispId = 0x60020001)
    com.sun.jna.platform.win32.WinNT.HRESULT getLastSelectedItem(VARIANT retVal);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(8)</p>
     * @param retVal [out] {@code IRawElementProviderSimple}
     */
    @ComProperty(name = "CurrentSelectedItem", dispId = 0x60020002)
    com.sun.jna.platform.win32.WinNT.HRESULT getCurrentSelectedItem(VARIANT retVal);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(9)</p>
     * @param retVal [out] {@code Integer}
     */
    @ComProperty(name = "ItemCount", dispId = 0x60020003)
    com.sun.jna.platform.win32.WinNT.HRESULT getItemCount(VARIANT retVal);
            
    
}