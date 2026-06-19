package org.bouncycastle.p054a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.bp */
/* JADX INFO: loaded from: classes.dex */
public final class C0592bp extends AbstractC0686u implements InterfaceC0502aa {

    /* JADX INFO: renamed from: a */
    private static final char[] f2124a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b */
    private final byte[] f2125b;

    public C0592bp(byte[] bArr) {
        this.f2125b = C1535a.m4086b(bArr);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (abstractC0686u instanceof C0592bp) {
            return C1535a.m4076a(this.f2125b, ((C0592bp) abstractC0686u).f2125b);
        }
        return false;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0502aa
    /* JADX INFO: renamed from: b */
    public final String mo1350b() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C0660s(byteArrayOutputStream).mo1459a((InterfaceC0618f) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(f2124a[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(f2124a[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new C0684t("internal error encoding UniversalString");
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return C0612ch.m1488a(this.f2125b.length) + 1 + this.f2125b.length;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        return C1535a.m4066a(this.f2125b);
    }

    public final String toString() {
        return mo1350b();
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        c0660s.m1605a(28, C1535a.m4086b(this.f2125b));
    }
}
