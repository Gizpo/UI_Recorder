
package UI_Recorder.uia_core;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({987DF77B-DB06-4D77-8F8A-86A9C3BB90B9})</p>
 */
@ComInterface(iid="{987DF77B-DB06-4D77-8F8A-86A9C3BB90B9}")
public interface IWindowProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param state [in] {@code WindowVisualState}
     */
    @ComMethod(name = "SetVisualState", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT SetVisualState(WindowVisualState state);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     */
    @ComMethod(name = "Close", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT Close();
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param milliseconds [in] {@code Integer}
     * @param pRetVal [out] {@code Integer}
     */
    @ComMethod(name = "WaitForInputIdle", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT WaitForInputIdle(Integer milliseconds,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "CanMaximize", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT getCanMaximize(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "CanMinimize", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT getCanMinimize(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010005)</p>
     * <p>vtableId(8)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "IsModal", dispId = 0x60010005)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsModal(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010006)</p>
     * <p>vtableId(9)</p>
     * @param pRetVal [out] {@code WindowVisualState}
     */
    @ComProperty(name = "WindowVisualState", dispId = 0x60010006)
    com.sun.jna.platform.win32.WinNT.HRESULT getWindowVisualState(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010007)</p>
     * <p>vtableId(10)</p>
     * @param pRetVal [out] {@code WindowInteractionState}
     */
    @ComProperty(name = "WindowInteractionState", dispId = 0x60010007)
    com.sun.jna.platform.win32.WinNT.HRESULT getWindowInteractionState(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010008)</p>
     * <p>vtableId(11)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "IsTopmost", dispId = 0x60010008)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsTopmost(VARIANT pRetVal);
            
    
}