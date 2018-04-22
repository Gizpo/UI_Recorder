
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({89592AD4-F4E0-43D5-A3B6-BAD7E111B435})</p>
 */
@ComInterface(iid="{89592AD4-F4E0-43D5-A3B6-BAD7E111B435}")
public interface IProxyProviderWinEventHandler extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param idWinEvent [in] {@code Integer}
     * @param hwnd [in] {@code _RemotableHandle}
     * @param idObject [in] {@code Integer}
     * @param idChild [in] {@code Integer}
     * @param pSink [in] {@code IProxyProviderWinEventSink}
     */
    @ComMethod(name = "RespondToWinEvent", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT RespondToWinEvent(Integer idWinEvent,
            _RemotableHandle hwnd,
            Integer idObject,
            Integer idChild,
            IProxyProviderWinEventSink pSink);
            
    
}