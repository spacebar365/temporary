package org.bouncycastle.p054a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: renamed from: org.bouncycastle.a.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C0545ah extends AbstractC0655q {

    /* JADX INFO: renamed from: b */
    private final int f2005b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0655q[] f2006c;

    public C0545ah(byte[] bArr) {
        this(bArr, (byte) 0);
    }

    private C0545ah(byte[] bArr, byte b) {
        this(bArr, (AbstractC0655q[]) null);
    }

    private C0545ah(byte[] bArr, AbstractC0655q[] abstractC0655qArr) {
        super(bArr);
        this.f2006c = abstractC0655qArr;
        this.f2005b = 1000;
    }

    public C0545ah(AbstractC0655q[] abstractC0655qArr) {
        this(abstractC0655qArr, (byte) 0);
    }

    private C0545ah(AbstractC0655q[] abstractC0655qArr, byte b) {
        this(m1408a(abstractC0655qArr), abstractC0655qArr);
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m1408a(AbstractC0655q[] abstractC0655qArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == abstractC0655qArr.length) {
                return byteArrayOutputStream.toByteArray();
            }
            try {
                byteArrayOutputStream.write(((C0581be) abstractC0655qArr[i2]).mo1410c());
                i = i2 + 1;
            } catch (IOException e) {
                throw new IllegalArgumentException("exception converting octets " + e.toString());
            } catch (ClassCastException e2) {
                throw new IllegalArgumentException(abstractC0655qArr[i2].getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0655q, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    public final void mo1335a(C0660s c0660s) throws IOException {
        c0660s.mo1608b(36);
        c0660s.mo1608b(128);
        Enumeration enumerationM1411f = m1411f();
        while (enumerationM1411f.hasMoreElements()) {
            c0660s.mo1459a((InterfaceC0618f) enumerationM1411f.nextElement());
        }
        c0660s.mo1608b(0);
        c0660s.mo1608b(0);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return true;
    }

    @Override // org.bouncycastle.p054a.AbstractC0655q
    /* JADX INFO: renamed from: c */
    public final byte[] mo1410c() {
        return this.f2558a;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        int iMo1341e = 0;
        Enumeration enumerationM1411f = m1411f();
        while (true) {
            int i = iMo1341e;
            if (!enumerationM1411f.hasMoreElements()) {
                return i + 2 + 2;
            }
            iMo1341e = ((InterfaceC0618f) enumerationM1411f.nextElement()).mo1358i().mo1341e() + i;
        }
    }

    /* JADX INFO: renamed from: f */
    public final Enumeration m1411f() {
        if (this.f2006c != null) {
            return new C0546ai(this);
        }
        Vector vector = new Vector();
        int i = 0;
        while (i < this.f2558a.length) {
            byte[] bArr = new byte[(this.f2005b + i > this.f2558a.length ? this.f2558a.length : this.f2005b + i) - i];
            System.arraycopy(this.f2558a, i, bArr, 0, bArr.length);
            vector.addElement(new C0581be(bArr));
            i += this.f2005b;
        }
        return vector.elements();
    }
}
