
package eu.doppel_helix.jna.tlbcodegenerator.uia_core;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The Central Class for UIAutomation8
 *
 * <p>uuid({E22AD333-B25F-460C-83D0-0581107395C9})</p>
 * <p>interface(IUIAutomation2)</p>
 */
@ComObject(clsId = "{E22AD333-B25F-460C-83D0-0581107395C9}")
public interface CUIAutomation8 extends IUnknown
    ,IUIAutomation2
{

}