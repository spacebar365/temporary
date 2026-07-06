package org.bouncycastle.jcajce;

import java.io.OutputStream;
import java.security.KeyStore$LoadStoreParameter;
import java.security.KeyStore$ProtectionParameter;

/* JADX INFO: loaded from: classes.dex */
public class PKCS12StoreParameter implements KeyStore$LoadStoreParameter {
    private final OutputStream a;
    private final KeyStore$ProtectionParameter b;
    private final boolean c;

    public PKCS12StoreParameter(OutputStream outputStream, KeyStore$ProtectionParameter keyStore$ProtectionParameter, boolean z) {
        this.a = outputStream;
        this.b = keyStore$ProtectionParameter;
        this.c = z;
    }

    public final OutputStream a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    @Override // java.security.KeyStore$LoadStoreParameter
    public KeyStore$ProtectionParameter getProtectionParameter() {
        return this.b;
    }
}
