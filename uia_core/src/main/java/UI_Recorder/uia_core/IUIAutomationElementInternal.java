
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({704DA7B3-C469-4D5A-9C4B-906CA89315A9})</p>
 */
@ComInterface(iid="{704DA7B3-C469-4D5A-9C4B-906CA89315A9}")
public interface IUIAutomationElementInternal extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param cacheRequest [in] {@code IUIAutomationCacheRequest}
     * @param element [out] {@code IUIAutomationElement}
     */
    @ComMethod(name = "GetFocusedDescendantBuildCache", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetFocusedDescendantBuildCache(IUIAutomationCacheRequest cacheRequest,
            VARIANT element);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param pt [in] {@code tagPOINT}
     * @param cacheRequest [in] {@code IUIAutomationCacheRequest}
     * @param element [out] {@code IUIAutomationElement}
     */
    @ComMethod(name = "DescendantFromPointBuildCache", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT DescendantFromPointBuildCache(tagPOINT pt,
            IUIAutomationCacheRequest cacheRequest,
            VARIANT element);
            
    
}