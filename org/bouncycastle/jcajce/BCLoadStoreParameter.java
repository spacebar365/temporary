package org.bouncycastle.jcajce;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore$LoadStoreParameter;
import java.security.KeyStore$ProtectionParameter;

/* JADX INFO: loaded from: classes.dex */
public class BCLoadStoreParameter implements KeyStore$LoadStoreParameter {
    private final InputStream a;
    private final OutputStream b;
    private final KeyStore$ProtectionParameter c;

    @Override // java.security.KeyStore$LoadStoreParameter
    public KeyStore$ProtectionParameter getProtectionParameter() {
        return this.c;
    }

    public final OutputStream h() {
        if (this.b == null) {
            throw new UnsupportedOperationException("parameter not configured for storage - no OutputStream");
        }
        return this.b;
    }

    public final InputStream i() {
        if (this.b != null) {
            throw new UnsupportedOperationException("parameter configured for storage OutputStream present");
        }
        return this.a;
    }
}
