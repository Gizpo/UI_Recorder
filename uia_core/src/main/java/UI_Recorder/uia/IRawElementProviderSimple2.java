
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({A0A839A9-8DA1-4A82-806A-8E0D44E79F56})</p>
 */
@ComInterface(iid="{A0A839A9-8DA1-4A82-806A-8E0D44E79F56}")
public interface IRawElementProviderSimple2 extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "ShowContextMenu", dispId = 0x60020000)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowContextMenu();
            
    
}