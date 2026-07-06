package org.bouncycastle.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bp extends u implements aa {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final byte[] b;

    public bp(byte[] bArr) {
        this.b = org.bouncycastle.f.a.b(bArr);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (uVar instanceof bp) {
            return org.bouncycastle.f.a.a(this.b, ((bp) uVar).b);
        }
        return false;
    }

    @Override // org.bouncycastle.a.aa
    public final String b() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new s(byteArrayOutputStream).a((f) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(a[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(a[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new t("internal error encoding UniversalString");
        }
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return ch.a(this.b.length) + 1 + this.b.length;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public final int hashCode() {
        return org.bouncycastle.f.a.a(this.b);
    }

    public final String toString() {
        return b();
    }

    @Override // org.bouncycastle.a.u
    final void a(s sVar) {
        sVar.a(28, org.bouncycastle.f.a.b(this.b));
    }
}
