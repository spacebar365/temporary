package org.bouncycastle.c.b;

import java.io.OutputStream;
import java.security.KeyStore$LoadStoreParameter;
import java.security.KeyStore$ProtectionParameter;

/* JADX INFO: loaded from: classes.dex */
public final class d implements KeyStore$LoadStoreParameter {
    private OutputStream a;
    private KeyStore$ProtectionParameter b;
    private boolean c;

    public final OutputStream a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    @Override // java.security.KeyStore$LoadStoreParameter
    public final KeyStore$ProtectionParameter getProtectionParameter() {
        return this.b;
    }
}
