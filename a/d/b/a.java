package a.d.b;

import a.g.v;
import a.i.e;
import a.j;

/* JADX INFO: compiled from: ACE.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements j {
    boolean a;
    int b;
    int c;
    v d;

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        this.a = bArr[i] == 0;
        int i4 = i3 + 1;
        this.b = bArr[i3] & 255;
        int iA = a.d.f.a.a(bArr, i4);
        int i5 = i4 + 2;
        this.c = a.d.f.a.b(bArr, i5);
        this.d = new v(bArr, i5 + 4);
        return iA;
    }

    private static void a(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(str);
        int length = i - str.length();
        for (int i2 = 0; i2 < length; i2++) {
            stringBuffer.append(' ');
        }
    }

    public final String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a ? "Allow " : "Deny  ");
        a(stringBuffer, this.d.a(), 25);
        stringBuffer.append(" 0x").append(e.a(this.c, 8)).append(' ');
        stringBuffer.append((this.b & 16) != 0 ? "Inherited " : "Direct    ");
        switch (this.b & 11) {
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
        a(stringBuffer, str, 34);
        return stringBuffer.toString();
    }
}
