
package eu.doppel_helix.jna.tlbcodegenerator.uia_core;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum ProviderOptions implements IComEnum {
    
    /**
     * (1)
     */
    ProviderOptions_ClientSideProvider(1),
    
    /**
     * (2)
     */
    ProviderOptions_ServerSideProvider(2),
    
    /**
     * (4)
     */
    ProviderOptions_NonClientAreaProvider(4),
    
    /**
     * (8)
     */
    ProviderOptions_OverrideProvider(8),
    
    /**
     * (16)
     */
    ProviderOptions_ProviderOwnsSetFocus(16),
    
    /**
     * (32)
     */
    ProviderOptions_UseComThreading(32),
    
    /**
     * (64)
     */
    ProviderOptions_RefuseNonClientSupport(64),
    
    /**
     * (128)
     */
    ProviderOptions_HasNativeIAccessible(128),
    
    /**
     * (256)
     */
    ProviderOptions_UseClientCoordinates(256),
    ;

    private ProviderOptions(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}