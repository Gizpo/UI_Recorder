
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({F95C7E80-BD63-4601-9782-445EBFF011FC})</p>
 */
@ComInterface(iid="{F95C7E80-BD63-4601-9782-445EBFF011FC}")
public interface IAnnotationProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param retVal [out] {@code Integer}
     */
    @ComProperty(name = "AnnotationTypeId", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT getAnnotationTypeId(VARIANT retVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param retVal [out] {@code String}
     */
    @ComProperty(name = "AnnotationTypeName", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT getAnnotationTypeName(VARIANT retVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param retVal [out] {@code String}
     */
    @ComProperty(name = "Author", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT getAuthor(VARIANT retVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param retVal [out] {@code String}
     */
    @ComProperty(name = "DateTime", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT getDateTime(VARIANT retVal);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param retVal [out] {@code IRawElementProviderSimple}
     */
    @ComProperty(name = "Target", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT getTarget(VARIANT retVal);
            
    
}