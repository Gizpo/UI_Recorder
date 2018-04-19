
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E44C3566-915D-4070-99C6-047BFF5A08F5})</p>
 */
@ComInterface(iid="{E44C3566-915D-4070-99C6-047BFF5A08F5}")
public interface ILegacyIAccessibleProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param flagsSelect [] {@code Integer}
     */
    @ComMethod(name = "Select", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(Integer flagsSelect);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     */
    @ComMethod(name = "DoDefaultAction", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT DoDefaultAction();
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param szValue [] {@code com.sun.jna.platform.win32.WTypes.LPWSTR}
     */
    @ComMethod(name = "SetValue", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT SetValue(com.sun.jna.platform.win32.WTypes.LPWSTR szValue);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param ppAccessible [out] {@code IAccessible}
     */
    @ComMethod(name = "GetIAccessible", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT GetIAccessible(VARIANT ppAccessible);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param pRetVal [out] {@code Integer}
     */
    @ComProperty(name = "ChildId", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT getChildId(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010005)</p>
     * <p>vtableId(8)</p>
     * @param pszName [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x60010005)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT pszName);
            
    /**
     * <p>id(0x60010006)</p>
     * <p>vtableId(9)</p>
     * @param pszValue [out] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x60010006)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT pszValue);
            
    /**
     * <p>id(0x60010007)</p>
     * <p>vtableId(10)</p>
     * @param pszDescription [out] {@code String}
     */
    @ComProperty(name = "Description", dispId = 0x60010007)
    com.sun.jna.platform.win32.WinNT.HRESULT getDescription(VARIANT pszDescription);
            
    /**
     * <p>id(0x60010008)</p>
     * <p>vtableId(11)</p>
     * @param pdwRole [out] {@code Integer}
     */
    @ComProperty(name = "Role", dispId = 0x60010008)
    com.sun.jna.platform.win32.WinNT.HRESULT getRole(VARIANT pdwRole);
            
    /**
     * <p>id(0x60010009)</p>
     * <p>vtableId(12)</p>
     * @param pdwState [out] {@code Integer}
     */
    @ComProperty(name = "state", dispId = 0x60010009)
    com.sun.jna.platform.win32.WinNT.HRESULT getState(VARIANT pdwState);
            
    /**
     * <p>id(0x6001000a)</p>
     * <p>vtableId(13)</p>
     * @param pszHelp [out] {@code String}
     */
    @ComProperty(name = "Help", dispId = 0x6001000a)
    com.sun.jna.platform.win32.WinNT.HRESULT getHelp(VARIANT pszHelp);
            
    /**
     * <p>id(0x6001000b)</p>
     * <p>vtableId(14)</p>
     * @param pszKeyboardShortcut [out] {@code String}
     */
    @ComProperty(name = "KeyboardShortcut", dispId = 0x6001000b)
    com.sun.jna.platform.win32.WinNT.HRESULT getKeyboardShortcut(VARIANT pszKeyboardShortcut);
            
    /**
     * <p>id(0x6001000c)</p>
     * <p>vtableId(15)</p>
     * @param pvarSelectedChildren [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetSelection", dispId = 0x6001000c)
    com.sun.jna.platform.win32.WinNT.HRESULT GetSelection(VARIANT pvarSelectedChildren);
            
    /**
     * <p>id(0x6001000d)</p>
     * <p>vtableId(16)</p>
     * @param pszDefaultAction [out] {@code String}
     */
    @ComProperty(name = "DefaultAction", dispId = 0x6001000d)
    com.sun.jna.platform.win32.WinNT.HRESULT getDefaultAction(VARIANT pszDefaultAction);
            
    
}