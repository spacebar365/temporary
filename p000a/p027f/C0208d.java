package p000a.p027f;

import java.security.DigestException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import javax.crypto.ShortBufferException;
import p000a.C0044d;
import p000a.InterfaceC0016c;
import p000a.p006d.p025f.C0173a;
import p000a.p027f.p028a.C0199a;
import p000a.p027f.p028a.C0200b;
import p000a.p027f.p028a.C0201c;
import p000a.p027f.p028a.C0202d;
import p000a.p027f.p028a.C0203e;
import p000a.p027f.p028a.C0204f;
import p000a.p027f.p028a.C0205g;
import p000a.p029g.C0260t;
import p000a.p031i.C0281b;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.f.d */
/* JADX INFO: compiled from: Type3Message.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0208d extends AbstractC0198a {

    /* JADX INFO: renamed from: c */
    private byte[] f933c;

    /* JADX INFO: renamed from: d */
    private byte[] f934d;

    /* JADX INFO: renamed from: e */
    private String f935e;

    /* JADX INFO: renamed from: f */
    private String f936f;

    /* JADX INFO: renamed from: g */
    private String f937g;

    /* JADX INFO: renamed from: h */
    private byte[] f938h;

    /* JADX INFO: renamed from: i */
    private byte[] f939i;

    /* JADX INFO: renamed from: j */
    private byte[] f940j;

    /* JADX INFO: renamed from: k */
    private boolean f941k;

    public C0208d(InterfaceC0016c interfaceC0016c, C0207c c0207c, String str, String str2, String str3, String str4, String str5, int i, boolean z) throws C0044d, DigestException, ShortBufferException {
        LinkedList linkedList;
        boolean z2;
        byte[] bArrM588a;
        int iM511b;
        byte[] bArrM909a;
        byte[] bArrM906a;
        boolean z3;
        Object c0199a;
        byte[] bArrM903a;
        this.f938h = null;
        this.f939i = null;
        this.f940j = null;
        m581a((c0207c.m583b(1) ? 1 : 2) | 33554944 | i);
        this.f937g = str5;
        this.f935e = str3;
        this.f936f = str4;
        if (str2 != null && (z || str2.length() != 0)) {
            switch (interfaceC0016c.mo114a().mo7B()) {
                case 0:
                case 1:
                    if (m583b(524288)) {
                        byte[] bArr = new byte[24];
                        interfaceC0016c.mo114a().mo33a().nextBytes(bArr);
                        Arrays.fill(bArr, 8, 24, (byte) 0);
                        byte[] bArrM904a = C0260t.m904a(str2);
                        byte[] bArrM908a = C0260t.m908a(bArrM904a, c0207c.m591c(), bArr);
                        this.f933c = bArr;
                        this.f934d = bArrM908a;
                        byte[] bArr2 = new byte[16];
                        System.arraycopy(c0207c.m591c(), 0, bArr2, 0, 8);
                        System.arraycopy(bArr, 0, bArr2, 8, 8);
                        MessageDigest messageDigestM934a = C0281b.m934a();
                        messageDigestM934a.update(bArrM904a);
                        MessageDigest messageDigestM935a = C0281b.m935a(messageDigestM934a.digest());
                        messageDigestM935a.update(bArr2);
                        byte[] bArrDigest = messageDigestM935a.digest();
                        if (m583b(1073741824)) {
                            this.f938h = new byte[16];
                            interfaceC0016c.mo114a().mo33a().nextBytes(this.f938h);
                            byte[] bArr3 = new byte[16];
                            C0281b.m937b(bArrDigest).update(this.f938h, 0, 16, bArr3, 0);
                            this.f939i = bArr3;
                            return;
                        }
                        this.f938h = bArrDigest;
                        return;
                    }
                    break;
                case 2:
                    byte[] bArrM593a = m593a(c0207c, str2);
                    this.f933c = bArrM593a;
                    this.f934d = bArrM593a;
                    return;
                case 3:
                case 4:
                case 5:
                    byte[] bArrM592d = c0207c.m592d();
                    if (bArrM592d == null) {
                        linkedList = null;
                    } else {
                        linkedList = new LinkedList();
                        int i2 = 0;
                        while (true) {
                            if (i2 + 4 > bArrM592d.length) {
                                z3 = false;
                            } else {
                                int iM509a = C0173a.m509a(bArrM592d, i2);
                                int iM509a2 = C0173a.m509a(bArrM592d, i2 + 2);
                                int i3 = i2 + 4;
                                if (iM509a == 0) {
                                    if (iM509a2 != 0) {
                                        throw new C0044d("Invalid avLen for AvEOL");
                                    }
                                    z3 = true;
                                } else {
                                    byte[] bArr4 = new byte[iM509a2];
                                    System.arraycopy(bArrM592d, i3, bArr4, 0, iM509a2);
                                    switch (iM509a) {
                                        case 6:
                                            c0199a = new C0200b(bArr4);
                                            break;
                                        case 7:
                                            c0199a = new C0205g(bArr4);
                                            break;
                                        case 8:
                                            c0199a = new C0203e(bArr4);
                                            break;
                                        case 9:
                                            c0199a = new C0204f(bArr4);
                                            break;
                                        case 10:
                                            c0199a = new C0199a(bArr4);
                                            break;
                                        default:
                                            c0199a = new C0201c(iM509a, bArr4);
                                            break;
                                    }
                                    linkedList.add(c0199a);
                                    i2 = i3 + iM509a2;
                                }
                            }
                        }
                        if (!z3) {
                            throw new C0044d("Missing AvEOL");
                        }
                    }
                    if (linkedList != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            if (((C0201c) it.next()).m584a() == 7) {
                                z2 = true;
                            }
                        }
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        byte[] bArr5 = new byte[8];
                        interfaceC0016c.mo114a().mo33a().nextBytes(bArr5);
                        if (str3 == null || str4 == null || str2 == null) {
                            bArrM906a = null;
                        } else {
                            bArrM906a = C0260t.m906a(str3, str4, str2, c0207c.m591c(), bArr5);
                        }
                        this.f933c = bArrM906a;
                    } else {
                        this.f933c = new byte[24];
                    }
                    if (linkedList != null) {
                        m582b();
                    }
                    byte[] bArrM905a = C0260t.m905a(str3, str4, str2);
                    byte[] bArr6 = new byte[8];
                    interfaceC0016c.mo114a().mo33a().nextBytes(bArr6);
                    long jM513c = z2 ? C0173a.m513c(((C0205g) C0202d.m586a(linkedList, 7)).m585b(), 0) : (System.currentTimeMillis() + 11644473600000L) * 10000;
                    if (!interfaceC0016c.mo114a().mo51ap() && linkedList == null) {
                        bArrM588a = null;
                    } else {
                        linkedList = linkedList == null ? new LinkedList() : linkedList;
                        if (m583b(16) && (interfaceC0016c.mo114a().mo51ap() || (z2 && !interfaceC0016c.mo114a().mo50ao()))) {
                            this.f941k = true;
                            this.f940j = new byte[16];
                            C0200b c0200b = (C0200b) C0202d.m586a(linkedList, 6);
                            if (c0200b == null) {
                                iM511b = 0;
                            } else {
                                iM511b = C0173a.m511b(c0200b.m585b(), 0);
                            }
                            C0202d.m587a(linkedList, new C0200b(iM511b | 2));
                        }
                        C0202d.m587a(linkedList, new C0205g(jM513c));
                        if (str != null) {
                            C0202d.m587a(linkedList, new C0204f(str));
                        }
                        C0202d.m587a(linkedList, new C0201c(10, new byte[16]));
                        C0202d.m587a(linkedList, new C0203e(interfaceC0016c.mo114a()));
                        bArrM588a = C0202d.m588a(linkedList);
                    }
                    if (bArrM905a == null) {
                        bArrM909a = null;
                    } else {
                        bArrM909a = C0260t.m909a(bArrM905a, c0207c.m591c(), bArr6, jM513c, bArrM588a);
                    }
                    this.f934d = bArrM909a;
                    MessageDigest messageDigestM935a2 = C0281b.m935a(bArrM905a);
                    messageDigestM935a2.update(this.f934d, 0, 16);
                    byte[] bArrDigest2 = messageDigestM935a2.digest();
                    if (m583b(1073741824)) {
                        this.f938h = new byte[16];
                        interfaceC0016c.mo114a().mo33a().nextBytes(this.f938h);
                        byte[] bArr7 = new byte[16];
                        C0281b.m937b(bArrDigest2).update(this.f938h, 0, 16, bArr7, 0);
                        this.f939i = bArr7;
                        return;
                    }
                    this.f938h = bArrDigest2;
                    return;
            }
            if (str2 == null) {
                bArrM903a = null;
            } else {
                bArrM903a = C0260t.m903a(interfaceC0016c, str2, c0207c.m591c());
            }
            this.f933c = bArrM903a;
            this.f934d = m593a(c0207c, str2);
            return;
        }
        this.f933c = null;
        this.f934d = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m594a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f938h;
        if (bArr3 != null) {
            MessageDigest messageDigestM935a = C0281b.m935a(bArr3);
            messageDigestM935a.update(bArr);
            messageDigestM935a.update(bArr2);
            messageDigestM935a.update(m596d());
            this.f940j = messageDigestM935a.digest();
        }
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m595c() {
        return this.f938h;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m596d() {
        byte[] bytes;
        int length = 64;
        boolean zB = m583b(1);
        String str = zB ? null : "Cp850";
        String str2 = this.f935e;
        byte[] bytes2 = null;
        if (str2 != null && str2.length() != 0) {
            bytes2 = zB ? str2.getBytes("UTF-16LE") : str2.getBytes(str);
            length = bytes2.length + 64;
        }
        String str3 = this.f936f;
        byte[] bytes3 = null;
        if (str3 != null && str3.length() != 0) {
            bytes3 = zB ? str3.getBytes("UTF-16LE") : str3.toUpperCase().getBytes(str);
            length += bytes3.length;
        }
        String str4 = this.f937g;
        if (str4 == null || str4.length() == 0) {
            bytes = null;
        } else {
            bytes = zB ? str4.getBytes("UTF-16LE") : str4.toUpperCase().getBytes(str);
            length += bytes.length;
        }
        byte[] bArr = this.f940j;
        if (bArr != null) {
            length += 24;
        } else if (m583b(33554432)) {
            length += 8;
        }
        byte[] bArr2 = this.f933c;
        int length2 = (bArr2 != null ? bArr2.length : 0) + length;
        byte[] bArr3 = this.f934d;
        int length3 = length2 + (bArr3 != null ? bArr3.length : 0);
        byte[] bArr4 = this.f939i;
        byte[] bArr5 = new byte[(bArr4 != null ? bArr4.length : 0) + length3];
        System.arraycopy(f919a, 0, bArr5, 0, 8);
        m577a(bArr5, 8, 3);
        int iA = m576a(bArr5, 12, bArr2);
        int iA2 = m576a(bArr5, 20, bArr3);
        int iA3 = m576a(bArr5, 28, bytes2);
        int iA4 = m576a(bArr5, 36, bytes3);
        int iA5 = m576a(bArr5, 44, bytes);
        int iA6 = m576a(bArr5, 52, bArr4);
        m577a(bArr5, 60, m580a());
        int length4 = 64;
        if (m583b(33554432)) {
            System.arraycopy(f920b, 0, bArr5, 64, f920b.length);
            length4 = f920b.length + 64;
        } else if (bArr != null) {
            length4 = f920b.length + 64;
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr5, length4, 16);
            length4 += 16;
        }
        int iA7 = length4 + m575a(bArr5, length4, iA, bArr2);
        int iA8 = iA7 + m575a(bArr5, iA7, iA2, bArr3);
        int iA9 = m575a(bArr5, iA8, iA3, bytes2) + iA8;
        int iA10 = iA9 + m575a(bArr5, iA9, iA4, bytes3);
        m575a(bArr5, m575a(bArr5, iA10, iA5, bytes) + iA10, iA6, bArr4);
        return bArr5;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m593a(C0207c c0207c, String str) {
        if (c0207c == null || str == null) {
            return null;
        }
        return C0260t.m907a(str, c0207c.m591c());
    }

    public final String toString() {
        String str = this.f936f;
        String str2 = this.f935e;
        String str3 = this.f937g;
        byte[] bArr = this.f933c;
        byte[] bArr2 = this.f934d;
        byte[] bArr3 = this.f939i;
        return "Type3Message[domain=" + str2 + ",user=" + str + ",workstation=" + str3 + ",lmResponse=" + (bArr == null ? "null" : "<" + bArr.length + " bytes>") + ",ntResponse=" + (bArr2 == null ? "null" : "<" + bArr2.length + " bytes>") + ",sessionKey=" + (bArr3 == null ? "null" : "<" + bArr3.length + " bytes>") + ",flags=0x" + C0284e.m947a(m580a(), 8) + "]";
    }
}
