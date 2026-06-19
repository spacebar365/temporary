package p000a.p003c;

import p000a.C0044d;
import p000a.p029g.InterfaceC0242be;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.c.e */
/* JADX INFO: compiled from: DcerpcException.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0036e extends C0044d implements InterfaceC0035d, InterfaceC0242be {

    /* JADX INFO: renamed from: c */
    private int f189c;

    /* JADX INFO: renamed from: a */
    private static String m151a(int i) {
        int i2 = 0;
        int length = f187a.length;
        while (length >= i2) {
            int i3 = (i2 + length) / 2;
            if (i > f187a[i3]) {
                i2 = i3 + 1;
            } else if (i < f187a[i3]) {
                length = i3 - 1;
            } else {
                return f188b[i3];
            }
        }
        return "0x" + C0284e.m947a(i, 8);
    }

    C0036e(int i) {
        super(m151a(i));
        this.f189c = i;
    }

    public C0036e(String str) {
        super(str);
    }
}
