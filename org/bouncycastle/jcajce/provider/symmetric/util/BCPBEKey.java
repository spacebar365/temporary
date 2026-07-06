package org.bouncycastle.jcajce.provider.symmetric.util;

import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.a.p;
import org.bouncycastle.b.ad;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public class BCPBEKey implements PBEKey {
    String a;
    p b;
    int c;
    int d;
    int e;
    int f;
    i g;
    PBEKeySpec h;
    boolean i = false;

    public BCPBEKey(String str, p pVar, int i, int i2, int i3, int i4, PBEKeySpec pBEKeySpec, i iVar) {
        this.a = str;
        this.b = pVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.h = pBEKeySpec;
        this.g = iVar;
    }

    public BCPBEKey(String str, i iVar) {
        this.a = str;
        this.g = iVar;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.g != null) {
            return (this.g instanceof be ? (ba) ((be) this.g).b() : (ba) this.g).a();
        }
        return this.c == 2 ? ad.c(this.h.getPassword()) : this.c == 5 ? ad.b(this.h.getPassword()) : ad.a(this.h.getPassword());
    }

    @Override // java.security.Key
    public String getFormat() {
        return "RAW";
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.h.getIterationCount();
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        return this.h.getPassword();
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.h.getSalt();
    }
}
