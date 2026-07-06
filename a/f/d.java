package a.f;

import a.f.a.e;
import a.f.a.f;
import a.f.a.g;
import a.g.t;
import java.security.DigestException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import javax.crypto.ShortBufferException;

/* JADX INFO: compiled from: Type3Message.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    private byte[] c;
    private byte[] d;
    private String e;
    private String f;
    private String g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private boolean k;

    public d(a.c cVar, c cVar2, String str, String str2, String str3, String str4, String str5, int i, boolean z) throws a.d, DigestException, ShortBufferException {
        LinkedList linkedList;
        boolean z2;
        byte[] bArrA;
        int iB;
        byte[] bArrA2;
        byte[] bArrA3;
        boolean z3;
        Object aVar;
        byte[] bArrA4;
        this.h = null;
        this.i = null;
        this.j = null;
        a((cVar2.b(1) ? 1 : 2) | 33554944 | i);
        this.g = str5;
        this.e = str3;
        this.f = str4;
        if (str2 != null && (z || str2.length() != 0)) {
            switch (cVar.a().B()) {
                case 0:
                case 1:
                    if (b(524288)) {
                        byte[] bArr = new byte[24];
                        cVar.a().a().nextBytes(bArr);
                        Arrays.fill(bArr, 8, 24, (byte) 0);
                        byte[] bArrA5 = t.a(str2);
                        byte[] bArrA6 = t.a(bArrA5, cVar2.c(), bArr);
                        this.c = bArr;
                        this.d = bArrA6;
                        byte[] bArr2 = new byte[16];
                        System.arraycopy(cVar2.c(), 0, bArr2, 0, 8);
                        System.arraycopy(bArr, 0, bArr2, 8, 8);
                        MessageDigest messageDigestA = a.i.b.a();
                        messageDigestA.update(bArrA5);
                        MessageDigest messageDigestA2 = a.i.b.a(messageDigestA.digest());
                        messageDigestA2.update(bArr2);
                        byte[] bArrDigest = messageDigestA2.digest();
                        if (b(1073741824)) {
                            this.h = new byte[16];
                            cVar.a().a().nextBytes(this.h);
                            byte[] bArr3 = new byte[16];
                            a.i.b.b(bArrDigest).update(this.h, 0, 16, bArr3, 0);
                            this.i = bArr3;
                            return;
                        }
                        this.h = bArrDigest;
                        return;
                    }
                    break;
                case 2:
                    byte[] bArrA7 = a(cVar2, str2);
                    this.c = bArrA7;
                    this.d = bArrA7;
                    return;
                case 3:
                case 4:
                case 5:
                    byte[] bArrD = cVar2.d();
                    if (bArrD == null) {
                        linkedList = null;
                    } else {
                        linkedList = new LinkedList();
                        int i2 = 0;
                        while (true) {
                            if (i2 + 4 > bArrD.length) {
                                z3 = false;
                            } else {
                                int iA = a.d.f.a.a(bArrD, i2);
                                int iA2 = a.d.f.a.a(bArrD, i2 + 2);
                                int i3 = i2 + 4;
                                if (iA == 0) {
                                    if (iA2 != 0) {
                                        throw new a.d("Invalid avLen for AvEOL");
                                    }
                                    z3 = true;
                                } else {
                                    byte[] bArr4 = new byte[iA2];
                                    System.arraycopy(bArrD, i3, bArr4, 0, iA2);
                                    switch (iA) {
                                        case 6:
                                            aVar = new a.f.a.b(bArr4);
                                            break;
                                        case 7:
                                            aVar = new g(bArr4);
                                            break;
                                        case 8:
                                            aVar = new e(bArr4);
                                            break;
                                        case 9:
                                            aVar = new f(bArr4);
                                            break;
                                        case 10:
                                            aVar = new a.f.a.a(bArr4);
                                            break;
                                        default:
                                            aVar = new a.f.a.c(iA, bArr4);
                                            break;
                                    }
                                    linkedList.add(aVar);
                                    i2 = i3 + iA2;
                                }
                            }
                        }
                        if (!z3) {
                            throw new a.d("Missing AvEOL");
                        }
                    }
                    if (linkedList != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            if (((a.f.a.c) it.next()).a() == 7) {
                                z2 = true;
                            }
                        }
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        byte[] bArr5 = new byte[8];
                        cVar.a().a().nextBytes(bArr5);
                        if (str3 == null || str4 == null || str2 == null) {
                            bArrA3 = null;
                        } else {
                            bArrA3 = t.a(str3, str4, str2, cVar2.c(), bArr5);
                        }
                        this.c = bArrA3;
                    } else {
                        this.c = new byte[24];
                    }
                    if (linkedList != null) {
                        b();
                    }
                    byte[] bArrA8 = t.a(str3, str4, str2);
                    byte[] bArr6 = new byte[8];
                    cVar.a().a().nextBytes(bArr6);
                    long jC = z2 ? a.d.f.a.c(((g) a.f.a.d.a(linkedList, 7)).b(), 0) : (System.currentTimeMillis() + 11644473600000L) * 10000;
                    if (!cVar.a().ap() && linkedList == null) {
                        bArrA = null;
                    } else {
                        linkedList = linkedList == null ? new LinkedList() : linkedList;
                        if (b(16) && (cVar.a().ap() || (z2 && !cVar.a().ao()))) {
                            this.k = true;
                            this.j = new byte[16];
                            a.f.a.b bVar = (a.f.a.b) a.f.a.d.a(linkedList, 6);
                            if (bVar == null) {
                                iB = 0;
                            } else {
                                iB = a.d.f.a.b(bVar.b(), 0);
                            }
                            a.f.a.d.a(linkedList, new a.f.a.b(iB | 2));
                        }
                        a.f.a.d.a(linkedList, new g(jC));
                        if (str != null) {
                            a.f.a.d.a(linkedList, new f(str));
                        }
                        a.f.a.d.a(linkedList, new a.f.a.c(10, new byte[16]));
                        a.f.a.d.a(linkedList, new e(cVar.a()));
                        bArrA = a.f.a.d.a(linkedList);
                    }
                    if (bArrA8 == null) {
                        bArrA2 = null;
                    } else {
                        bArrA2 = t.a(bArrA8, cVar2.c(), bArr6, jC, bArrA);
                    }
                    this.d = bArrA2;
                    MessageDigest messageDigestA3 = a.i.b.a(bArrA8);
                    messageDigestA3.update(this.d, 0, 16);
                    byte[] bArrDigest2 = messageDigestA3.digest();
                    if (b(1073741824)) {
                        this.h = new byte[16];
                        cVar.a().a().nextBytes(this.h);
                        byte[] bArr7 = new byte[16];
                        a.i.b.b(bArrDigest2).update(this.h, 0, 16, bArr7, 0);
                        this.i = bArr7;
                        return;
                    }
                    this.h = bArrDigest2;
                    return;
            }
            if (str2 == null) {
                bArrA4 = null;
            } else {
                bArrA4 = t.a(cVar, str2, cVar2.c());
            }
            this.c = bArrA4;
            this.d = a(cVar2, str2);
            return;
        }
        this.c = null;
        this.d = null;
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.h;
        if (bArr3 != null) {
            MessageDigest messageDigestA = a.i.b.a(bArr3);
            messageDigestA.update(bArr);
            messageDigestA.update(bArr2);
            messageDigestA.update(d());
            this.j = messageDigestA.digest();
        }
    }

    public final byte[] c() {
        return this.h;
    }

    public final byte[] d() {
        byte[] bytes;
        int length = 64;
        boolean zB = b(1);
        String str = zB ? null : "Cp850";
        String str2 = this.e;
        byte[] bytes2 = null;
        if (str2 != null && str2.length() != 0) {
            bytes2 = zB ? str2.getBytes("UTF-16LE") : str2.getBytes(str);
            length = bytes2.length + 64;
        }
        String str3 = this.f;
        byte[] bytes3 = null;
        if (str3 != null && str3.length() != 0) {
            bytes3 = zB ? str3.getBytes("UTF-16LE") : str3.toUpperCase().getBytes(str);
            length += bytes3.length;
        }
        String str4 = this.g;
        if (str4 == null || str4.length() == 0) {
            bytes = null;
        } else {
            bytes = zB ? str4.getBytes("UTF-16LE") : str4.toUpperCase().getBytes(str);
            length += bytes.length;
        }
        byte[] bArr = this.j;
        if (bArr != null) {
            length += 24;
        } else if (b(33554432)) {
            length += 8;
        }
        byte[] bArr2 = this.c;
        int length2 = (bArr2 != null ? bArr2.length : 0) + length;
        byte[] bArr3 = this.d;
        int length3 = length2 + (bArr3 != null ? bArr3.length : 0);
        byte[] bArr4 = this.i;
        byte[] bArr5 = new byte[(bArr4 != null ? bArr4.length : 0) + length3];
        System.arraycopy(a, 0, bArr5, 0, 8);
        a(bArr5, 8, 3);
        int iA = a(bArr5, 12, bArr2);
        int iA2 = a(bArr5, 20, bArr3);
        int iA3 = a(bArr5, 28, bytes2);
        int iA4 = a(bArr5, 36, bytes3);
        int iA5 = a(bArr5, 44, bytes);
        int iA6 = a(bArr5, 52, bArr4);
        a(bArr5, 60, a());
        int length4 = 64;
        if (b(33554432)) {
            System.arraycopy(b, 0, bArr5, 64, b.length);
            length4 = b.length + 64;
        } else if (bArr != null) {
            length4 = b.length + 64;
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr5, length4, 16);
            length4 += 16;
        }
        int iA7 = length4 + a(bArr5, length4, iA, bArr2);
        int iA8 = iA7 + a(bArr5, iA7, iA2, bArr3);
        int iA9 = a(bArr5, iA8, iA3, bytes2) + iA8;
        int iA10 = iA9 + a(bArr5, iA9, iA4, bytes3);
        a(bArr5, a(bArr5, iA10, iA5, bytes) + iA10, iA6, bArr4);
        return bArr5;
    }

    private static byte[] a(c cVar, String str) {
        if (cVar == null || str == null) {
            return null;
        }
        return t.a(str, cVar.c());
    }

    public final String toString() {
        String str = this.f;
        String str2 = this.e;
        String str3 = this.g;
        byte[] bArr = this.c;
        byte[] bArr2 = this.d;
        byte[] bArr3 = this.i;
        return "Type3Message[domain=" + str2 + ",user=" + str + ",workstation=" + str3 + ",lmResponse=" + (bArr == null ? "null" : "<" + bArr.length + " bytes>") + ",ntResponse=" + (bArr2 == null ? "null" : "<" + bArr2.length + " bytes>") + ",sessionKey=" + (bArr3 == null ? "null" : "<" + bArr3.length + " bytes>") + ",flags=0x" + a.i.e.a(a(), 8) + "]";
    }
}
