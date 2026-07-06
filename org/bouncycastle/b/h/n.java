package org.bouncycastle.b.h;

import org.bouncycastle.b.b.ac;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.bo;
import org.bouncycastle.b.k.bo$a;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class n implements z {
    private ac a;

    public n(int i, int i2) {
        this.a = new ac(i, i2);
    }

    @Override // org.bouncycastle.b.z
    public final int a(byte[] bArr, int i) {
        return this.a.a(bArr, i);
    }

    @Override // org.bouncycastle.b.z
    public final String a() {
        return "Skein-MAC-" + (this.a.b() * 8) + "-" + (this.a.a() * 8);
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte b) {
        this.a.a(b);
    }

    @Override // org.bouncycastle.b.z
    public final void a(org.bouncycastle.b.i iVar) {
        bo boVarA;
        if (iVar instanceof bo) {
            boVarA = (bo) iVar;
        } else {
            if (!(iVar instanceof ba)) {
                throw new IllegalArgumentException("Invalid parameter passed to Skein MAC init - " + iVar.getClass().getName());
            }
            boVarA = new bo$a().a(((ba) iVar).a()).a();
        }
        if (boVarA.b() == null) {
            throw new IllegalArgumentException("Skein MAC requires a key parameter.");
        }
        this.a.a(boVarA);
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.z
    public final int b() {
        return this.a.a();
    }

    @Override // org.bouncycastle.b.z
    public final void c() {
        this.a.c();
    }
}
