package org.bouncycastle.jcajce;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes.dex */
public class BCLoadStoreParameter implements KeyStore.LoadStoreParameter {

    /* JADX INFO: renamed from: a */
    private final InputStream f5547a;

    /* JADX INFO: renamed from: b */
    private final OutputStream f5548b;

    /* JADX INFO: renamed from: c */
    private final KeyStore.ProtectionParameter f5549c;

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f5549c;
    }

    /* JADX INFO: renamed from: h */
    public final OutputStream m4179h() {
        if (this.f5548b == null) {
            throw new UnsupportedOperationException("parameter not configured for storage - no OutputStream");
        }
        return this.f5548b;
    }

    /* JADX INFO: renamed from: i */
    public final InputStream m4180i() {
        if (this.f5548b != null) {
            throw new UnsupportedOperationException("parameter configured for storage OutputStream present");
        }
        return this.f5547a;
    }
}
