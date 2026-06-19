package org.bouncycastle.jcajce;

import java.io.OutputStream;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes.dex */
public class PKCS12StoreParameter implements KeyStore.LoadStoreParameter {

    /* JADX INFO: renamed from: a */
    private final OutputStream f5562a;

    /* JADX INFO: renamed from: b */
    private final KeyStore.ProtectionParameter f5563b;

    /* JADX INFO: renamed from: c */
    private final boolean f5564c;

    public PKCS12StoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z) {
        this.f5562a = outputStream;
        this.f5563b = protectionParameter;
        this.f5564c = z;
    }

    /* JADX INFO: renamed from: a */
    public final OutputStream m4181a() {
        return this.f5562a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4182b() {
        return this.f5564c;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f5563b;
    }
}
