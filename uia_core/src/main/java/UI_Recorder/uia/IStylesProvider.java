
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({19B6B649-F5D7-4A6D-BDCB-129252BE588A})</p>
 */
@ComInterface(iid="{19B6B649-F5D7-4A6D-BDCB-129252BE588A}")
public interface IStylesProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param retVal [out] {@code Integer}
     */
    @ComProperty(name = "StyleId", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT getStyleId(VARIANT retVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param retVal [out] {@code String}
     */
    @ComProperty(name = "StyleName", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT getStyleName(VARIANT retVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param retVal [out] {@code Integer}
     */
    @ComProperty(name = "FillColor", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT getFillColor(VARIANT retVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param retVal [out] {@code String}
     */
    @ComProperty(name = "FillPatternStyle", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT getFillPatternStyle(VARIANT retVal);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param retVal [out] {@code String}
     */
    @ComProperty(name = "Shape", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT getShape(VARIANT retVal);
            
    /**
     * <p>id(0x60010005)</p>
     * <p>vtableId(8)</p>
     * @param retVal [out] {@code Integer}
     */
    @ComProperty(name = "FillPatternColor", dispId = 0x60010005)
    com.sun.jna.platform.win32.WinNT.HRESULT getFillPatternColor(VARIANT retVal);
            
    /**
     * <p>id(0x60010006)</p>
     * <p>vtableId(9)</p>
     * @param retVal [out] {@code String}
     */
    @ComProperty(name = "ExtendedProperties", dispId = 0x60010006)
    com.sun.jna.platform.win32.WinNT.HRESULT getExtendedProperties(VARIANT retVal);
            
    
}