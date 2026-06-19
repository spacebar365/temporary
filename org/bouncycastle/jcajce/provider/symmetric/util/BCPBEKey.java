package org.bouncycastle.jcajce.provider.symmetric.util;

import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p083b.AbstractC0804ad;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: loaded from: classes.dex */
public class BCPBEKey implements PBEKey {

    /* JADX INFO: renamed from: a */
    String f6147a;

    /* JADX INFO: renamed from: b */
    C0653p f6148b;

    /* JADX INFO: renamed from: c */
    int f6149c;

    /* JADX INFO: renamed from: d */
    int f6150d;

    /* JADX INFO: renamed from: e */
    int f6151e;

    /* JADX INFO: renamed from: f */
    int f6152f;

    /* JADX INFO: renamed from: g */
    InterfaceC1003i f6153g;

    /* JADX INFO: renamed from: h */
    PBEKeySpec f6154h;

    /* JADX INFO: renamed from: i */
    boolean f6155i = false;

    public BCPBEKey(String str, C0653p c0653p, int i, int i2, int i3, int i4, PBEKeySpec pBEKeySpec, InterfaceC1003i interfaceC1003i) {
        this.f6147a = str;
        this.f6148b = c0653p;
        this.f6149c = i;
        this.f6150d = i2;
        this.f6151e = i3;
        this.f6152f = i4;
        this.f6154h = pBEKeySpec;
        this.f6153g = interfaceC1003i;
    }

    public BCPBEKey(String str, InterfaceC1003i interfaceC1003i) {
        this.f6147a = str;
        this.f6153g = interfaceC1003i;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f6147a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f6153g != null) {
            return (this.f6153g instanceof C1080be ? (C1076ba) ((C1080be) this.f6153g).m2612b() : (C1076ba) this.f6153g).m2603a();
        }
        return this.f6149c == 2 ? AbstractC0804ad.m1896c(this.f6154h.getPassword()) : this.f6149c == 5 ? AbstractC0804ad.m1895b(this.f6154h.getPassword()) : AbstractC0804ad.m1894a(this.f6154h.getPassword());
    }

    @Override // java.security.Key
    public String getFormat() {
        return "RAW";
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.f6154h.getIterationCount();
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        return this.f6154h.getPassword();
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.f6154h.getSalt();
    }
}
