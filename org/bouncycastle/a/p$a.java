package org.bouncycastle.a;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class p$a {
    private final int a;
    private final byte[] b;

    p$a(byte[] bArr) {
        this.a = org.bouncycastle.f.a.a(bArr);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p$a) {
            return org.bouncycastle.f.a.a(this.b, ((p$a) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
