
package UI_Recorder.uia;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({5347AD7B-C355-46F8-AFF5-909033582F63})</p>
 */
@ComInterface(iid="{5347AD7B-C355-46F8-AFF5-909033582F63}")
public interface ITextRangeProvider extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     * <p>vtableId(3)</p>
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComMethod(name = "Clone", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT Clone(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010001)</p>
     * <p>vtableId(4)</p>
     * @param range [in] {@code ITextRangeProvider}
     * @param pRetVal [out] {@code Integer}
     */
    @ComMethod(name = "Compare", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT Compare(ITextRangeProvider range,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010002)</p>
     * <p>vtableId(5)</p>
     * @param endpoint [in] {@code TextPatternRangeEndpoint}
     * @param targetRange [in] {@code ITextRangeProvider}
     * @param targetEndpoint [in] {@code TextPatternRangeEndpoint}
     * @param pRetVal [out] {@code Integer}
     */
    @ComMethod(name = "CompareEndpoints", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT CompareEndpoints(TextPatternRangeEndpoint endpoint,
            ITextRangeProvider targetRange,
            TextPatternRangeEndpoint targetEndpoint,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010003)</p>
     * <p>vtableId(6)</p>
     * @param unit [in] {@code TextUnit}
     */
    @ComMethod(name = "ExpandToEnclosingUnit", dispId = 0x60010003)
    com.sun.jna.platform.win32.WinNT.HRESULT ExpandToEnclosingUnit(TextUnit unit);
            
    /**
     * <p>id(0x60010004)</p>
     * <p>vtableId(7)</p>
     * @param attributeId [in] {@code Integer}
     * @param val [in] {@code Object}
     * @param backward [in] {@code Integer}
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComMethod(name = "FindAttribute", dispId = 0x60010004)
    com.sun.jna.platform.win32.WinNT.HRESULT FindAttribute(Integer attributeId,
            Object val,
            Integer backward,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010005)</p>
     * <p>vtableId(8)</p>
     * @param text [in] {@code String}
     * @param backward [in] {@code Integer}
     * @param ignoreCase [in] {@code Integer}
     * @param pRetVal [out] {@code ITextRangeProvider}
     */
    @ComMethod(name = "FindText", dispId = 0x60010005)
    com.sun.jna.platform.win32.WinNT.HRESULT FindText(String text,
            Integer backward,
            Integer ignoreCase,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010006)</p>
     * <p>vtableId(9)</p>
     * @param attributeId [in] {@code Integer}
     * @param pRetVal [out] {@code Object}
     */
    @ComMethod(name = "GetAttributeValue", dispId = 0x60010006)
    com.sun.jna.platform.win32.WinNT.HRESULT GetAttributeValue(Integer attributeId,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x60010007)</p>
     * <p>vtableId(10)</p>
     * @param pRetVal [out] {@code Double}
     */
    @ComMethod(name = "GetBoundingRectangles", dispId = 0x60010007)
    com.sun.jna.platform.win32.WinNT.HRESULT GetBoundingRectangles(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010008)</p>
     * <p>vtableId(11)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetEnclosingElement", dispId = 0x60010008)
    com.sun.jna.platform.win32.WinNT.HRESULT GetEnclosingElement(VARIANT pRetVal);
            
    /**
     * <p>id(0x60010009)</p>
     * <p>vtableId(12)</p>
     * @param maxLength [in] {@code Integer}
     * @param pRetVal [out] {@code String}
     */
    @ComMethod(name = "GetText", dispId = 0x60010009)
    com.sun.jna.platform.win32.WinNT.HRESULT GetText(Integer maxLength,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x6001000a)</p>
     * <p>vtableId(13)</p>
     * @param unit [in] {@code TextUnit}
     * @param count [in] {@code Integer}
     * @param pRetVal [out] {@code Integer}
     */
    @ComMethod(name = "Move", dispId = 0x6001000a)
    com.sun.jna.platform.win32.WinNT.HRESULT Move(TextUnit unit,
            Integer count,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x6001000b)</p>
     * <p>vtableId(14)</p>
     * @param endpoint [in] {@code TextPatternRangeEndpoint}
     * @param unit [in] {@code TextUnit}
     * @param count [in] {@code Integer}
     * @param pRetVal [out] {@code Integer}
     */
    @ComMethod(name = "MoveEndpointByUnit", dispId = 0x6001000b)
    com.sun.jna.platform.win32.WinNT.HRESULT MoveEndpointByUnit(TextPatternRangeEndpoint endpoint,
            TextUnit unit,
            Integer count,
            VARIANT pRetVal);
            
    /**
     * <p>id(0x6001000c)</p>
     * <p>vtableId(15)</p>
     * @param endpoint [in] {@code TextPatternRangeEndpoint}
     * @param targetRange [in] {@code ITextRangeProvider}
     * @param targetEndpoint [in] {@code TextPatternRangeEndpoint}
     */
    @ComMethod(name = "MoveEndpointByRange", dispId = 0x6001000c)
    com.sun.jna.platform.win32.WinNT.HRESULT MoveEndpointByRange(TextPatternRangeEndpoint endpoint,
            ITextRangeProvider targetRange,
            TextPatternRangeEndpoint targetEndpoint);
            
    /**
     * <p>id(0x6001000d)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Select", dispId = 0x6001000d)
    com.sun.jna.platform.win32.WinNT.HRESULT Select();
            
    /**
     * <p>id(0x6001000e)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "AddToSelection", dispId = 0x6001000e)
    com.sun.jna.platform.win32.WinNT.HRESULT AddToSelection();
            
    /**
     * <p>id(0x6001000f)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "RemoveFromSelection", dispId = 0x6001000f)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveFromSelection();
            
    /**
     * <p>id(0x60010010)</p>
     * <p>vtableId(19)</p>
     * @param alignToTop [in] {@code Integer}
     */
    @ComMethod(name = "ScrollIntoView", dispId = 0x60010010)
    com.sun.jna.platform.win32.WinNT.HRESULT ScrollIntoView(Integer alignToTop);
            
    /**
     * <p>id(0x60010011)</p>
     * <p>vtableId(20)</p>
     * @param pRetVal [out] {@code IRawElementProviderSimple}
     */
    @ComMethod(name = "GetChildren", dispId = 0x60010011)
    com.sun.jna.platform.win32.WinNT.HRESULT GetChildren(VARIANT pRetVal);
            
    
}