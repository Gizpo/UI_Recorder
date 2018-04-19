
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * Class for registering UIAutomation patterns, properties and events.
 *
 * <p>uuid({6E29FABF-9977-42D1-8D0E-CA7E61AD87E6})</p>
 * <p>interface(IUIAutomationRegistrar)</p>
 */
@ComObject(clsId = "{6E29FABF-9977-42D1-8D0E-CA7E61AD87E6}")
public interface CUIAutomationRegistrar extends IUnknown
    ,IUIAutomationRegistrar
{

}