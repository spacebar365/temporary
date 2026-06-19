package org.bouncycastle.p054a.p078w;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;

/* JADX INFO: renamed from: org.bouncycastle.a.w.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0745e {
    /* JADX INFO: renamed from: a */
    private static AbstractC1386g m1736a(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g) {
        AbstractC1386g abstractC1386gMo2929a;
        if (abstractC1386g.mo2940j()) {
            return abstractC1386g;
        }
        AbstractC1386g abstractC1386gMo2906a = abstractC1381d.mo2906a(InterfaceC1376c.f4994c);
        Random random = new Random();
        int iMo2930b = abstractC1386g.mo2930b();
        do {
            AbstractC1386g abstractC1386gMo2906a2 = abstractC1381d.mo2906a(new BigInteger(iMo2930b, random));
            AbstractC1386g abstractC1386gMo2929a2 = abstractC1386g;
            abstractC1386gMo2929a = abstractC1386gMo2906a;
            for (int i = 1; i <= iMo2930b - 1; i++) {
                AbstractC1386g abstractC1386gMo2936e = abstractC1386gMo2929a2.mo2936e();
                abstractC1386gMo2929a = abstractC1386gMo2929a.mo2936e().mo2929a(abstractC1386gMo2936e.mo2933c(abstractC1386gMo2906a2));
                abstractC1386gMo2929a2 = abstractC1386gMo2936e.mo2929a(abstractC1386g);
            }
            if (!abstractC1386gMo2929a2.mo2940j()) {
                return null;
            }
        } while (abstractC1386gMo2929a.mo2936e().mo2929a(abstractC1386gMo2929a).mo2940j());
        return abstractC1386gMo2929a;
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC1386g m1737a(AbstractC1386g abstractC1386g) {
        AbstractC1386g abstractC1386gMo2929a = abstractC1386g;
        for (int i = 1; i < abstractC1386g.mo2930b(); i++) {
            abstractC1386gMo2929a = abstractC1386gMo2929a.mo2936e().mo2929a(abstractC1386g);
        }
        return abstractC1386gMo2929a;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1389j m1738a(AbstractC1381d abstractC1381d, byte[] bArr) {
        AbstractC1386g abstractC1386gMo2933c;
        AbstractC1386g abstractC1386gMo2906a = abstractC1381d.mo2906a(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        AbstractC1386g abstractC1386gMo2906a2 = abstractC1381d.mo2906a(new BigInteger(1, bArr));
        if (!m1737a(abstractC1386gMo2906a2).equals(abstractC1381d.m3366g())) {
            abstractC1386gMo2906a2 = abstractC1386gMo2906a2.mo2932c();
        }
        if (abstractC1386gMo2906a2.mo2940j()) {
            abstractC1386gMo2933c = abstractC1381d.m3367h().mo2938g();
        } else {
            AbstractC1386g abstractC1386gM1736a = m1736a(abstractC1381d, abstractC1386gMo2906a2.mo2936e().mo2937f().mo2933c(abstractC1381d.m3367h()).mo2929a(abstractC1381d.m3366g()).mo2929a(abstractC1386gMo2906a2));
            if (abstractC1386gM1736a != null) {
                if (!m1737a(abstractC1386gM1736a).equals(abstractC1386gMo2906a)) {
                    abstractC1386gM1736a = abstractC1386gM1736a.mo2932c();
                }
                abstractC1386gMo2933c = abstractC1386gMo2906a2.mo2933c(abstractC1386gM1736a);
            } else {
                abstractC1386gMo2933c = null;
            }
        }
        if (abstractC1386gMo2933c == null) {
            throw new IllegalArgumentException("Invalid point compression");
        }
        return abstractC1381d.m3354a(abstractC1386gMo2906a2.mo2928a(), abstractC1386gMo2933c.mo2928a());
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1739a(AbstractC1389j abstractC1389j) {
        AbstractC1389j abstractC1389jM3468o = abstractC1389j.m3468o();
        AbstractC1386g abstractC1386gM3461g = abstractC1389jM3468o.m3461g();
        byte[] bArrM3436l = abstractC1386gM3461g.m3436l();
        if (!abstractC1386gM3461g.mo2940j()) {
            if (m1737a(abstractC1389jM3468o.m3462h().mo2935d(abstractC1386gM3461g)).mo2939i()) {
                int length = bArrM3436l.length - 1;
                bArrM3436l[length] = (byte) (bArrM3436l[length] | 1);
            } else {
                int length2 = bArrM3436l.length - 1;
                bArrM3436l[length2] = (byte) (bArrM3436l[length2] & 254);
            }
        }
        return bArrM3436l;
    }
}
