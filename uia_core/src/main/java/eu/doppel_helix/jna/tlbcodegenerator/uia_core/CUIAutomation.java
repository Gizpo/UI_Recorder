
package eu.doppel_helix.jna.tlbcodegenerator.uia_core;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The Central Class for UIAutomation
 *
 * <p>uuid({FF48DBA4-60EF-4201-AA87-54103EEF594E})</p>
 * <p>interface(IUIAutomation)</p>
 */
@ComObject(clsId = "{FF48DBA4-60EF-4201-AA87-54103EEF594E}")
public interface CUIAutomation extends IUnknown
    ,IUIAutomation
{

}