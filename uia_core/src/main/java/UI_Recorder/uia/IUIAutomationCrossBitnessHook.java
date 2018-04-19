
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IUIAutomationCrossBitnessHook Interface
 *
 * <p>uuid({4ECE4541-81D4-44AC-9DF6-D199EF66F904})</p>
 */
@ComInterface(iid="{4ECE4541-81D4-44AC-9DF6-D199EF66F904}")
public interface IUIAutomationCrossBitnessHook extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(3)</p>
     * @param dwTargetThreadId [in] {@code Integer}
     * @param pdwHookId [out] {@code Integer}
     */
    @ComMethod(name = "SetCrossBitnessCallWndProcHook", dispId = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT SetCrossBitnessCallWndProcHook(Integer dwTargetThreadId,
            VARIANT pdwHookId);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(4)</p>
     * @param dwHookId [in] {@code Integer}
     */
    @ComMethod(name = "UnhookCrossBitnessCallWndProcHook", dispId = 0x2)
    com.sun.jna.platform.win32.WinNT.HRESULT UnhookCrossBitnessCallWndProcHook(Integer dwHookId);
            
    
}