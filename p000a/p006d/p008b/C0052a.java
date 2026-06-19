package p000a.p006d.p008b;

import p000a.InterfaceC0286j;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.C0262v;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.b.a */
/* JADX INFO: compiled from: ACE.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0052a implements InterfaceC0286j {

    /* JADX INFO: renamed from: a */
    boolean f254a;

    /* JADX INFO: renamed from: b */
    int f255b;

    /* JADX INFO: renamed from: c */
    int f256c;

    /* JADX INFO: renamed from: d */
    C0262v f257d;

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        this.f254a = bArr[i] == 0;
        int i4 = i3 + 1;
        this.f255b = bArr[i3] & 255;
        int iM509a = C0173a.m509a(bArr, i4);
        int i5 = i4 + 2;
        this.f256c = C0173a.m511b(bArr, i5);
        this.f257d = new C0262v(bArr, i5 + 4);
        return iM509a;
    }

    /* JADX INFO: renamed from: a */
    private static void m219a(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(str);
        int length = i - str.length();
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append(' ');
        }
    }

    public final String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f254a ? "Allow " : "Deny  ");
        m219a(stringBuffer, this.f257d.m912a(), 25);
        stringBuffer.append(" 0x").append(C0284e.m947a(this.f256c, 8)).append(' ');
        stringBuffer.append((this.f255b & 16) != 0 ? "Inherited " : "Direct    ");
        switch (this.f255b & 11) {
            case 0:
                str = "This folder only";
                break;
            case 1:
                str = "This folder and files";
                break;
            case 2:
                str = "This folder and subfolders";
                break;
            case 3:
                str = "This folder, subfolders and files";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                str = "Invalid";
                break;
            case 9:
                str = "Files only";
                break;
            case 10:
                str = "Subfolders only";
                break;
            case 11:
                str = "Subfolders and files only";
                break;
        }
        m219a(stringBuffer, str, 34);
        return stringBuffer.toString();
    }
}
