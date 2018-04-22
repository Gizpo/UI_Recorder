
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({FCF5D820-D7EC-4613-BDF6-42A84CE7DAAF})</p>
 */
@ComInterface(iid="{FCF5D820-D7EC-4613-BDF6-42A84CE7DAAF}")
public interface IRawElementProviderSimple3 extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(8)</p>
     * @param targetId [in] {@code Integer}
     * @param metadataId [in] {@code Integer}
     * @param returnVal [out] {@code Object}
     */
    @ComMethod(name = "GetMetadataValue", dispId = 0x60030000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetMetadataValue(Integer targetId,
            Integer metadataId,
            VARIANT returnVal);
            
    
}