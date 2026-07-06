package org.bouncycastle.jcajce;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore$ProtectionParameter;
import java.security.cert.X509Certificate;
import org.bouncycastle.b.o.d;
import org.bouncycastle.b.o.d$a;
import org.bouncycastle.b.o.e;

/* JADX INFO: loaded from: classes.dex */
public class BCFKSLoadStoreParameter$Builder {
    private final OutputStream a;
    private final InputStream b;
    private final KeyStore$ProtectionParameter c;
    private final Key d;
    private e e;
    private BCFKSLoadStoreParameter$EncryptionAlgorithm f;
    private BCFKSLoadStoreParameter$MacAlgorithm g;
    private BCFKSLoadStoreParameter$SignatureAlgorithm h;
    private X509Certificate[] i;

    public BCFKSLoadStoreParameter$Builder() {
        this((byte) 0);
    }

    private BCFKSLoadStoreParameter$Builder(byte b) {
        this.e = new d$a().a().b().a(d.c).c();
        this.f = BCFKSLoadStoreParameter$EncryptionAlgorithm.a;
        this.g = BCFKSLoadStoreParameter$MacAlgorithm.a;
        this.h = BCFKSLoadStoreParameter$SignatureAlgorithm.c;
        this.i = null;
        this.b = null;
        this.a = null;
        this.c = null;
        this.d = null;
    }
}
