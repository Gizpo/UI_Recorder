
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({9BBCE42C-1921-4F18-89CA-DBA1910A0386})</p>
 */
@ComInterface(iid="{9BBCE42C-1921-4F18-89CA-DBA1910A0386}")
public interface ITextRangeProvider2 extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "ShowContextMenu", dispId = 0x60020000)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowContextMenu();
            
    
}