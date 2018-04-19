
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({B38B8077-1FC3-42A5-8CAE-D40C2215055A})</p>
 */
@ComInterface(iid="{B38B8077-1FC3-42A5-8CAE-D40C2215055A}")
public interface IScrollProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param horizontalAmount [in] {@code ScrollAmount}
     * @param verticalAmount [in] {@code ScrollAmount}
     */
    @ComMethod(name = "Scroll", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT Scroll(ScrollAmount horizontalAmount,
            ScrollAmount verticalAmount);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param horizontalPercent [in] {@code Double}
     * @param verticalPercent [in] {@code Double}
     */
    @ComMethod(name = "SetScrollPercent", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT SetScrollPercent(Double horizontalPercent,
            Double verticalPercent);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComProperty(name = "HorizontalScrollPercent", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalScrollPercent(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComProperty(name = "VerticalScrollPercent", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalScrollPercent(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComProperty(name = "HorizontalViewSize", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalViewSize(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010005)</p>
     * <p>vtableId(8)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComProperty(name = "VerticalViewSize", dispId = 0x60010005)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalViewSize(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010006)</p>
     * <p>vtableId(9)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "HorizontallyScrollable", dispId = 0x60010006)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontallyScrollable(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010007)</p>
     * <p>vtableId(10)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "VerticallyScrollable", dispId = 0x60010007)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticallyScrollable(VARIANT pRetVal);
            
    
}