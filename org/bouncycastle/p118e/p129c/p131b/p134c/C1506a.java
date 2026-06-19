package org.bouncycastle.p118e.p129c.p131b.p134c;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p118e.p120b.p123c.C1450a;
import org.bouncycastle.p118e.p120b.p123c.C1452c;
import org.bouncycastle.p118e.p120b.p127f.C1458a;
import org.bouncycastle.p118e.p120b.p127f.C1459b;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1506a implements PrivateKey {

    /* JADX INFO: renamed from: a */
    private transient C1450a f5422a;

    /* JADX INFO: renamed from: b */
    private transient AbstractC0747x f5423b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1506a)) {
            return false;
        }
        C1506a c1506a = (C1506a) obj;
        return this.f5422a.m3794b() == c1506a.f5422a.m3794b() && C1535a.m4076a(this.f5422a.m3795c(), c1506a.f5422a.m3795c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return C1452c.m3798a(this.f5422a.m3794b());
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C1459b.m3817a(this.f5422a, this.f5423b).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.f5422a.m3794b() + (C1535a.m4066a(this.f5422a.m3795c()) * 37);
    }

    public C1506a(C0676p c0676p) {
        this.f5423b = c0676p.m1657a();
        this.f5422a = (C1450a) C1458a.m3815a(c0676p);
    }
}
