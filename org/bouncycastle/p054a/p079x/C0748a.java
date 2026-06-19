package org.bouncycastle.p054a.p079x;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0498a;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0634j;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0541ad;
import org.bouncycastle.p054a.C0542ae;
import org.bouncycastle.p054a.C0545ah;
import org.bouncycastle.p054a.C0549al;
import org.bouncycastle.p054a.C0551an;
import org.bouncycastle.p054a.C0553ap;
import org.bouncycastle.p054a.C0556as;
import org.bouncycastle.p054a.C0557at;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0577ba;
import org.bouncycastle.p054a.C0578bb;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0584bh;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0587bk;
import org.bouncycastle.p054a.C0589bm;
import org.bouncycastle.p054a.C0591bo;
import org.bouncycastle.p054a.C0593bq;
import org.bouncycastle.p054a.C0594br;
import org.bouncycastle.p054a.C0595bs;
import org.bouncycastle.p054a.C0613d;
import org.bouncycastle.p054a.C0627h;
import org.bouncycastle.p054a.C0636k;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p142f.C1560k;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.x.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0748a {
    /* JADX INFO: renamed from: a */
    private static String m1751a(String str, byte[] bArr) {
        String strM4158a = C1560k.m4158a();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + "    ";
        stringBuffer.append(strM4158a);
        for (int i = 0; i < bArr.length; i += 32) {
            if (bArr.length - i > 32) {
                stringBuffer.append(str2);
                stringBuffer.append(C1560k.m4164b(C1541f.m4107a(bArr, i, 32)));
                stringBuffer.append("    ");
                stringBuffer.append(m1752a(bArr, i, 32));
                stringBuffer.append(strM4158a);
            } else {
                stringBuffer.append(str2);
                stringBuffer.append(C1560k.m4164b(C1541f.m4107a(bArr, i, bArr.length - i)));
                for (int length = bArr.length - i; length != 32; length++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append("    ");
                stringBuffer.append(m1752a(bArr, i, bArr.length - i));
                stringBuffer.append(strM4158a);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m1752a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            if (bArr[i3] >= 32 && bArr[i3] <= 126) {
                stringBuffer.append((char) bArr[i3]);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private static void m1753a(String str, boolean z, AbstractC0686u abstractC0686u, StringBuffer stringBuffer) {
        AbstractC0686u abstractC0686uM1402j = abstractC0686u;
        while (true) {
            String strM4158a = C1560k.m4158a();
            if (abstractC0686uM1402j instanceof AbstractC0723v) {
                Enumeration enumerationMo1483c = ((AbstractC0723v) abstractC0686uM1402j).mo1483c();
                String str2 = str + "    ";
                stringBuffer.append(str);
                if (abstractC0686uM1402j instanceof C0549al) {
                    stringBuffer.append("BER Sequence");
                } else if (abstractC0686uM1402j instanceof C0585bi) {
                    stringBuffer.append("DER Sequence");
                } else {
                    stringBuffer.append("Sequence");
                }
                stringBuffer.append(strM4158a);
                while (enumerationMo1483c.hasMoreElements()) {
                    Object objNextElement = enumerationMo1483c.nextElement();
                    if (objNextElement == null || objNextElement.equals(C0579bc.f2112a)) {
                        stringBuffer.append(str2);
                        stringBuffer.append("NULL");
                        stringBuffer.append(strM4158a);
                    } else if (objNextElement instanceof AbstractC0686u) {
                        m1753a(str2, z, (AbstractC0686u) objNextElement, stringBuffer);
                    } else {
                        m1753a(str2, z, ((InterfaceC0618f) objNextElement).mo1358i(), stringBuffer);
                    }
                }
                return;
            }
            if (abstractC0686uM1402j instanceof AbstractC0539ab) {
                String str3 = str + "    ";
                stringBuffer.append(str);
                if (abstractC0686uM1402j instanceof C0553ap) {
                    stringBuffer.append("BER Tagged [");
                } else {
                    stringBuffer.append("Tagged [");
                }
                AbstractC0539ab abstractC0539ab = (AbstractC0539ab) abstractC0686uM1402j;
                stringBuffer.append(Integer.toString(abstractC0539ab.m1396b()));
                stringBuffer.append(']');
                if (!abstractC0539ab.m1397c()) {
                    stringBuffer.append(" IMPLICIT ");
                }
                stringBuffer.append(strM4158a);
                if (abstractC0539ab.m1399f()) {
                    stringBuffer.append(str3);
                    stringBuffer.append("EMPTY");
                    stringBuffer.append(strM4158a);
                    return;
                }
                abstractC0686uM1402j = abstractC0539ab.m1402j();
                str = str3;
            } else {
                if (abstractC0686uM1402j instanceof AbstractC0747x) {
                    Enumeration enumerationM1747b = ((AbstractC0747x) abstractC0686uM1402j).m1747b();
                    String str4 = str + "    ";
                    stringBuffer.append(str);
                    if (abstractC0686uM1402j instanceof C0551an) {
                        stringBuffer.append("BER Set");
                    } else if (abstractC0686uM1402j instanceof C0587bk) {
                        stringBuffer.append("DER Set");
                    } else {
                        stringBuffer.append("Set");
                    }
                    stringBuffer.append(strM4158a);
                    while (enumerationM1747b.hasMoreElements()) {
                        Object objNextElement2 = enumerationM1747b.nextElement();
                        if (objNextElement2 == null) {
                            stringBuffer.append(str4);
                            stringBuffer.append("NULL");
                            stringBuffer.append(strM4158a);
                        } else if (objNextElement2 instanceof AbstractC0686u) {
                            m1753a(str4, z, (AbstractC0686u) objNextElement2, stringBuffer);
                        } else {
                            m1753a(str4, z, ((InterfaceC0618f) objNextElement2).mo1358i(), stringBuffer);
                        }
                    }
                    return;
                }
                if (abstractC0686uM1402j instanceof AbstractC0655q) {
                    AbstractC0655q abstractC0655q = (AbstractC0655q) abstractC0686uM1402j;
                    if (abstractC0686uM1402j instanceof C0545ah) {
                        stringBuffer.append(str + "BER Constructed Octet String[" + abstractC0655q.mo1410c().length + "] ");
                    } else {
                        stringBuffer.append(str + "DER Octet String[" + abstractC0655q.mo1410c().length + "] ");
                    }
                    if (z) {
                        stringBuffer.append(m1751a(str, abstractC0655q.mo1410c()));
                        return;
                    } else {
                        stringBuffer.append(strM4158a);
                        return;
                    }
                }
                if (abstractC0686uM1402j instanceof C0653p) {
                    stringBuffer.append(str + "ObjectIdentifier(" + ((C0653p) abstractC0686uM1402j).m1593b() + ")" + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0613d) {
                    stringBuffer.append(str + "Boolean(" + ((C0613d) abstractC0686uM1402j).m1495b() + ")" + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0640m) {
                    stringBuffer.append(str + "Integer(" + ((C0640m) abstractC0686uM1402j).m1564b() + ")" + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0558au) {
                    C0558au c0558au = (C0558au) abstractC0686uM1402j;
                    stringBuffer.append(str + "DER Bit String[" + c0558au.m1474d().length + ", " + c0558au.m1475f() + "] ");
                    if (z) {
                        stringBuffer.append(m1751a(str, c0558au.m1474d()));
                        return;
                    } else {
                        stringBuffer.append(strM4158a);
                        return;
                    }
                }
                if (abstractC0686uM1402j instanceof C0578bb) {
                    stringBuffer.append(str + "IA5String(" + ((C0578bb) abstractC0686uM1402j).mo1350b() + ") " + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0591bo) {
                    stringBuffer.append(str + "UTF8String(" + ((C0591bo) abstractC0686uM1402j).mo1350b() + ") " + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0584bh) {
                    stringBuffer.append(str + "PrintableString(" + ((C0584bh) abstractC0686uM1402j).mo1350b() + ") " + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0594br) {
                    stringBuffer.append(str + "VisibleString(" + ((C0594br) abstractC0686uM1402j).mo1350b() + ") " + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0557at) {
                    stringBuffer.append(str + "BMPString(" + ((C0557at) abstractC0686uM1402j).mo1350b() + ") " + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0589bm) {
                    stringBuffer.append(str + "T61String(" + ((C0589bm) abstractC0686uM1402j).mo1350b() + ") " + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0577ba) {
                    stringBuffer.append(str + "GraphicString(" + ((C0577ba) abstractC0686uM1402j).mo1350b() + ") " + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0593bq) {
                    stringBuffer.append(str + "VideotexString(" + ((C0593bq) abstractC0686uM1402j).mo1350b() + ") " + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0541ad) {
                    stringBuffer.append(str + "UTCTime(" + ((C0541ad) abstractC0686uM1402j).m1404c() + ") " + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0636k) {
                    stringBuffer.append(str + "GeneralizedTime(" + ((C0636k) abstractC0686uM1402j).m1545b() + ") " + strM4158a);
                    return;
                }
                if (abstractC0686uM1402j instanceof C0542ae) {
                    stringBuffer.append(m1750a("BER", str, z, abstractC0686uM1402j, strM4158a));
                    return;
                }
                if (abstractC0686uM1402j instanceof C0556as) {
                    stringBuffer.append(m1750a("DER", str, z, abstractC0686uM1402j, strM4158a));
                    return;
                }
                if (abstractC0686uM1402j instanceof C0595bs) {
                    stringBuffer.append(m1750a("", str, z, abstractC0686uM1402j, strM4158a));
                    return;
                }
                if (abstractC0686uM1402j instanceof C0627h) {
                    stringBuffer.append(str + "DER Enumerated(" + ((C0627h) abstractC0686uM1402j).m1525b() + ")" + strM4158a);
                    return;
                }
                if (!(abstractC0686uM1402j instanceof AbstractC0634j)) {
                    stringBuffer.append(str + abstractC0686uM1402j.toString() + strM4158a);
                    return;
                }
                AbstractC0634j abstractC0634j = (AbstractC0634j) abstractC0686uM1402j;
                stringBuffer.append(str + "External " + strM4158a);
                str = str + "    ";
                if (abstractC0634j.m1537c() != null) {
                    stringBuffer.append(str + "Direct Reference: " + abstractC0634j.m1537c().m1593b() + strM4158a);
                }
                if (abstractC0634j.m1540j() != null) {
                    stringBuffer.append(str + "Indirect Reference: " + abstractC0634j.m1540j().toString() + strM4158a);
                }
                if (abstractC0634j.m1536b() != null) {
                    m1753a(str, z, abstractC0634j.m1536b(), stringBuffer);
                }
                stringBuffer.append(str + "Encoding: " + abstractC0634j.m1538d() + strM4158a);
                abstractC0686uM1402j = abstractC0634j.m1539f();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m1750a(String str, String str2, boolean z, AbstractC0686u abstractC0686u, String str3) {
        if (abstractC0686u != null && !(abstractC0686u instanceof AbstractC0498a)) {
            throw new IllegalArgumentException("unknown object in getInstance: " + abstractC0686u.getClass().getName());
        }
        AbstractC0498a abstractC0498a = (AbstractC0498a) abstractC0686u;
        StringBuffer stringBuffer = new StringBuffer();
        if (!abstractC0498a.mo1336a()) {
            return str2 + str + " ApplicationSpecific[" + abstractC0498a.m1339c() + "] (" + C1560k.m4164b(C1541f.m4108b(abstractC0498a.m1338b())) + ")" + str3;
        }
        try {
            AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a((Object) abstractC0498a.m1340d());
            stringBuffer.append(str2 + str + " ApplicationSpecific[" + abstractC0498a.m1339c() + "]" + str3);
            Enumeration enumerationMo1483c = abstractC0723vM1708a.mo1483c();
            while (enumerationMo1483c.hasMoreElements()) {
                m1753a(str2 + "    ", z, (AbstractC0686u) enumerationMo1483c.nextElement(), stringBuffer);
            }
        } catch (IOException e) {
            stringBuffer.append(e);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m1749a(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof AbstractC0686u) {
            m1753a("", false, (AbstractC0686u) obj, stringBuffer);
        } else {
            if (!(obj instanceof InterfaceC0618f)) {
                return "unknown object type " + obj.toString();
            }
            m1753a("", false, ((InterfaceC0618f) obj).mo1358i(), stringBuffer);
        }
        return stringBuffer.toString();
    }
}
