package org.bouncycastle.jcajce;

import java.security.Key;
import java.security.cert.X509Certificate;
import org.bouncycastle.b.o.e;

/* JADX INFO: loaded from: classes.dex */
public class BCFKSLoadStoreParameter extends BCLoadStoreParameter {
    private final e a;
    private final BCFKSLoadStoreParameter$EncryptionAlgorithm b;
    private final BCFKSLoadStoreParameter$MacAlgorithm c;
    private final BCFKSLoadStoreParameter$SignatureAlgorithm d;
    private final Key e;
    private final X509Certificate[] f;
    private final BCFKSLoadStoreParameter$CertChainValidator g;

    public final e a() {
        return this.a;
    }

    public final BCFKSLoadStoreParameter$EncryptionAlgorithm b() {
        return this.b;
    }

    public final BCFKSLoadStoreParameter$MacAlgorithm c() {
        return this.c;
    }

    public final BCFKSLoadStoreParameter$SignatureAlgorithm d() {
        return this.d;
    }

    public final Key e() {
        return this.e;
    }

    public final X509Certificate[] f() {
        return this.f;
    }

    public final BCFKSLoadStoreParameter$CertChainValidator g() {
        return this.g;
    }
}
