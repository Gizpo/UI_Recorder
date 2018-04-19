
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * UIAutomation Client Blocking Core Class
 *
 * <p>uuid({8A00041D-EC5C-4194-927D-D00CA43FBF38})</p>
 * <p>interface(IUIAutomationBlockingCore)</p>
 */
@ComObject(clsId = "{8A00041D-EC5C-4194-927D-D00CA43FBF38}")
public interface CUIAutomationBlockingCore extends IUnknown
    ,IUIAutomationBlockingCore
{

}