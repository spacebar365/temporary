package org.bouncycastle.jcajce;

import java.io.OutputStream;
import java.security.KeyStore$LoadStoreParameter;
import java.security.KeyStore$ProtectionParameter;
import org.bouncycastle.b.o.e;

/* JADX INFO: loaded from: classes.dex */
public class BCFKSStoreParameter implements KeyStore$LoadStoreParameter {
    private final KeyStore$ProtectionParameter a;
    private final e b;
    private OutputStream c;

    public final OutputStream a() {
        return this.c;
    }

    public final e b() {
        return this.b;
    }

    @Override // java.security.KeyStore$LoadStoreParameter
    public KeyStore$ProtectionParameter getProtectionParameter() {
        return this.a;
    }
}
