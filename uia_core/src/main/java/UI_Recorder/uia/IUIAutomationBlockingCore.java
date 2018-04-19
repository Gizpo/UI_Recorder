
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IUIAutomationBlockingCore Interface
 *
 * <p>uuid({016F611A-B360-4768-8B28-6779DDFDE2E0})</p>
 */
@ComInterface(iid="{016F611A-B360-4768-8B28-6779DDFDE2E0}")
public interface IUIAutomationBlockingCore extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param eventId [in] {@code Integer}
     * @param element [in] {@code IUIAutomationElement}
     * @param scope [in] {@code TreeScope}
     * @param cacheRequest [in] {@code IUIAutomationCacheRequest}
     * @param handler [in] {@code IUIAutomationEventHandler}
     */
    @ComMethod(name = "AddAutomationEventHandler", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT AddAutomationEventHandler(CUIAutomation automation,
            Integer eventId,
            IUIAutomationElement element,
            TreeScope scope,
            IUIAutomationCacheRequest cacheRequest,
            IUIAutomationEventHandler handler);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param eventId [in] {@code Integer}
     * @param element [in] {@code IUIAutomationElement}
     * @param handler [in] {@code IUIAutomationEventHandler}
     */
    @ComMethod(name = "RemoveAutomationEventHandler", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveAutomationEventHandler(CUIAutomation automation,
            Integer eventId,
            IUIAutomationElement element,
            IUIAutomationEventHandler handler);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param element [in] {@code IUIAutomationElement}
     * @param scope [in] {@code TreeScope}
     * @param cacheRequest [in] {@code IUIAutomationCacheRequest}
     * @param handler [in] {@code IUIAutomationPropertyChangedEventHandler}
     * @param propertyArray [in] {@code Integer}
     * @param propertyCount [in] {@code Integer}
     */
    @ComMethod(name = "AddPropertyChangedEventHandlerNativeArray", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT AddPropertyChangedEventHandlerNativeArray(CUIAutomation automation,
            IUIAutomationElement element,
            TreeScope scope,
            IUIAutomationCacheRequest cacheRequest,
            IUIAutomationPropertyChangedEventHandler handler,
            Integer propertyArray,
            Integer propertyCount);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param element [in] {@code IUIAutomationElement}
     * @param scope [in] {@code TreeScope}
     * @param cacheRequest [in] {@code IUIAutomationCacheRequest}
     * @param handler [in] {@code IUIAutomationPropertyChangedEventHandler}
     * @param propertyArray [in] {@code Integer}
     */
    @ComMethod(name = "AddPropertyChangedEventHandler", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT AddPropertyChangedEventHandler(CUIAutomation automation,
            IUIAutomationElement element,
            TreeScope scope,
            IUIAutomationCacheRequest cacheRequest,
            IUIAutomationPropertyChangedEventHandler handler,
            Integer propertyArray);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param element [in] {@code IUIAutomationElement}
     * @param handler [in] {@code IUIAutomationPropertyChangedEventHandler}
     */
    @ComMethod(name = "RemovePropertyChangedEventHandler", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT RemovePropertyChangedEventHandler(CUIAutomation automation,
            IUIAutomationElement element,
            IUIAutomationPropertyChangedEventHandler handler);
            
    /**
     * <p>id(0x60010005)</p>
     * <p>vtableId(8)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param element [in] {@code IUIAutomationElement}
     * @param scope [in] {@code TreeScope}
     * @param cacheRequest [in] {@code IUIAutomationCacheRequest}
     * @param handler [in] {@code IUIAutomationStructureChangedEventHandler}
     */
    @ComMethod(name = "AddStructureChangedEventHandler", dispId = 0x60010005)
    com.sun.jna.platform.win32.WinNT.HRESULT AddStructureChangedEventHandler(CUIAutomation automation,
            IUIAutomationElement element,
            TreeScope scope,
            IUIAutomationCacheRequest cacheRequest,
            IUIAutomationStructureChangedEventHandler handler);
            
    /**
     * <p>id(0x60010006)</p>
     * <p>vtableId(9)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param element [in] {@code IUIAutomationElement}
     * @param handler [in] {@code IUIAutomationStructureChangedEventHandler}
     */
    @ComMethod(name = "RemoveStructureChangedEventHandler", dispId = 0x60010006)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveStructureChangedEventHandler(CUIAutomation automation,
            IUIAutomationElement element,
            IUIAutomationStructureChangedEventHandler handler);
            
    /**
     * <p>id(0x60010007)</p>
     * <p>vtableId(10)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param cacheRequest [in] {@code IUIAutomationCacheRequest}
     * @param handler [in] {@code IUIAutomationFocusChangedEventHandler}
     */
    @ComMethod(name = "AddFocusChangedEventHandler", dispId = 0x60010007)
    com.sun.jna.platform.win32.WinNT.HRESULT AddFocusChangedEventHandler(CUIAutomation automation,
            IUIAutomationCacheRequest cacheRequest,
            IUIAutomationFocusChangedEventHandler handler);
            
    /**
     * <p>id(0x60010008)</p>
     * <p>vtableId(11)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param handler [in] {@code IUIAutomationFocusChangedEventHandler}
     */
    @ComMethod(name = "RemoveFocusChangedEventHandler", dispId = 0x60010008)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveFocusChangedEventHandler(CUIAutomation automation,
            IUIAutomationFocusChangedEventHandler handler);
            
    /**
     * <p>id(0x60010009)</p>
     * <p>vtableId(12)</p>
     * @param automation [in] {@code CUIAutomation}
     */
    @ComMethod(name = "RemoveAllEventHandlers", dispId = 0x60010009)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveAllEventHandlers(CUIAutomation automation);
            
    /**
     * <p>id(0x6001000a)</p>
     * <p>vtableId(13)</p>
     * @param clientConnection [in] {@code Long}
     * @param pRequest [in] {@code Long}
     * @param requestLen [in] {@code Integer}
     * @param fUseCAutomation8TimeoutBehavior [in] {@code Integer}
     * @param dwTimeout [in] {@code Integer}
     * @param pResponseType [in] {@code Long}
     * @param pResponse [in] {@code Long}
     * @param pResponseLen [in] {@code Long}
     */
    @ComMethod(name = "DoCallWithReturn", dispId = 0x6001000a)
    com.sun.jna.platform.win32.WinNT.HRESULT DoCallWithReturn(Long clientConnection,
            Long pRequest,
            Integer requestLen,
            Integer fUseCAutomation8TimeoutBehavior,
            Integer dwTimeout,
            Long pResponseType,
            Long pResponse,
            Long pResponseLen);
            
    /**
     * <p>id(0x6001000b)</p>
     * <p>vtableId(14)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param element [in] {@code IUIAutomationElement}
     * @param scope [in] {@code TreeScope}
     * @param TextEditChangeType [in] {@code TextEditChangeType}
     * @param cacheRequest [in] {@code IUIAutomationCacheRequest}
     * @param handler [in] {@code IUIAutomationTextEditTextChangedEventHandler}
     */
    @ComMethod(name = "AddTextEditTextChangedEventHandler", dispId = 0x6001000b)
    com.sun.jna.platform.win32.WinNT.HRESULT AddTextEditTextChangedEventHandler(CUIAutomation automation,
            IUIAutomationElement element,
            TreeScope scope,
            TextEditChangeType TextEditChangeType,
            IUIAutomationCacheRequest cacheRequest,
            IUIAutomationTextEditTextChangedEventHandler handler);
            
    /**
     * <p>id(0x6001000c)</p>
     * <p>vtableId(15)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param element [in] {@code IUIAutomationElement}
     * @param handler [in] {@code IUIAutomationTextEditTextChangedEventHandler}
     */
    @ComMethod(name = "RemoveTextEditTextChangedEventHandler", dispId = 0x6001000c)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveTextEditTextChangedEventHandler(CUIAutomation automation,
            IUIAutomationElement element,
            IUIAutomationTextEditTextChangedEventHandler handler);
            
    /**
     * <p>id(0x6001000d)</p>
     * <p>vtableId(16)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param element [in] {@code IUIAutomationElement}
     * @param scope [in] {@code TreeScope}
     * @param changeTypes [in] {@code Integer}
     * @param changesCount [in] {@code Integer}
     * @param pCacheRequest [in] {@code IUIAutomationCacheRequest}
     * @param handler [in] {@code IUIAutomationChangesEventHandler}
     */
    @ComMethod(name = "AddChangesEventHandler", dispId = 0x6001000d)
    com.sun.jna.platform.win32.WinNT.HRESULT AddChangesEventHandler(CUIAutomation automation,
            IUIAutomationElement element,
            TreeScope scope,
            Integer changeTypes,
            Integer changesCount,
            IUIAutomationCacheRequest pCacheRequest,
            IUIAutomationChangesEventHandler handler);
            
    /**
     * <p>id(0x6001000e)</p>
     * <p>vtableId(17)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param element [in] {@code IUIAutomationElement}
     * @param handler [in] {@code IUIAutomationChangesEventHandler}
     */
    @ComMethod(name = "RemoveChangesEventHandler", dispId = 0x6001000e)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveChangesEventHandler(CUIAutomation automation,
            IUIAutomationElement element,
            IUIAutomationChangesEventHandler handler);
            
    /**
     * <p>id(0x6001000f)</p>
     * <p>vtableId(18)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param element [in] {@code IUIAutomationElement}
     * @param scope [in] {@code TreeScope}
     * @param cacheRequest [in] {@code IUIAutomationCacheRequest}
     * @param handler [in] {@code IUIAutomationNotificationEventHandler}
     */
    @ComMethod(name = "AddNotificationEventHandler", dispId = 0x6001000f)
    com.sun.jna.platform.win32.WinNT.HRESULT AddNotificationEventHandler(CUIAutomation automation,
            IUIAutomationElement element,
            TreeScope scope,
            IUIAutomationCacheRequest cacheRequest,
            IUIAutomationNotificationEventHandler handler);
            
    /**
     * <p>id(0x60010010)</p>
     * <p>vtableId(19)</p>
     * @param automation [in] {@code CUIAutomation}
     * @param element [in] {@code IUIAutomationElement}
     * @param handler [in] {@code IUIAutomationNotificationEventHandler}
     */
    @ComMethod(name = "RemoveNotificationEventHandler", dispId = 0x60010010)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveNotificationEventHandler(CUIAutomation automation,
            IUIAutomationElement element,
            IUIAutomationNotificationEventHandler handler);
            
    
}