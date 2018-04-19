
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2ACAD808-B2D4-452D-A407-91FF1AD167B2})</p>
 */
@ComInterface(iid="{2ACAD808-B2D4-452D-A407-91FF1AD167B2}")
public interface ISelectionItemProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     */
    @ComMethod(name = "Select", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT Select();
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     */
    @ComMethod(name = "AddToSelection", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT AddToSelection();
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     */
    @ComMethod(name = "RemoveFromSelection", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveFromSelection();
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "IsSelected", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsSelected(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComProperty(name = "SelectionContainer", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT getSelectionContainer(VARIANT pRetVal);
            
    
}