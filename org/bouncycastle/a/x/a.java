package org.bouncycastle.a.x;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.ad;
import org.bouncycastle.a.ae;
import org.bouncycastle.a.ah;
import org.bouncycastle.a.al;
import org.bouncycastle.a.an;
import org.bouncycastle.a.ap;
import org.bouncycastle.a.as;
import org.bouncycastle.a.at;
import org.bouncycastle.a.au;
import org.bouncycastle.a.ba;
import org.bouncycastle.a.bb;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.bh;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bk;
import org.bouncycastle.a.bm;
import org.bouncycastle.a.bo;
import org.bouncycastle.a.bq;
import org.bouncycastle.a.br;
import org.bouncycastle.a.bs;
import org.bouncycastle.a.d;
import org.bouncycastle.a.h;
import org.bouncycastle.a.j;
import org.bouncycastle.a.m;
import org.bouncycastle.a.p;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;
import org.bouncycastle.a.x;
import org.bouncycastle.f.a.f;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static String a(String str, byte[] bArr) {
        String strA = k.a();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + "    ";
        stringBuffer.append(strA);
        for (int i = 0; i < bArr.length; i += 32) {
            if (bArr.length - i > 32) {
                stringBuffer.append(str2);
                stringBuffer.append(k.b(f.a(bArr, i, 32)));
                stringBuffer.append("    ");
                stringBuffer.append(a(bArr, i, 32));
                stringBuffer.append(strA);
            } else {
                stringBuffer.append(str2);
                stringBuffer.append(k.b(f.a(bArr, i, bArr.length - i)));
                for (int length = bArr.length - i; length != 32; length++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append("    ");
                stringBuffer.append(a(bArr, i, bArr.length - i));
                stringBuffer.append(strA);
            }
        }
        return stringBuffer.toString();
    }

    private static String a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            if (bArr[i3] >= 32 && bArr[i3] <= 126) {
                stringBuffer.append((char) bArr[i3]);
            }
        }
        return stringBuffer.toString();
    }

    private static void a(String str, boolean z, u uVar, StringBuffer stringBuffer) {
        u uVarJ = uVar;
        while (true) {
            String strA = k.a();
            if (uVarJ instanceof v) {
                Enumeration enumerationC = ((v) uVarJ).c();
                String str2 = str + "    ";
                stringBuffer.append(str);
                if (uVarJ instanceof al) {
                    stringBuffer.append("BER Sequence");
                } else if (uVarJ instanceof bi) {
                    stringBuffer.append("DER Sequence");
                } else {
                    stringBuffer.append("Sequence");
                }
                stringBuffer.append(strA);
                while (enumerationC.hasMoreElements()) {
                    Object objNextElement = enumerationC.nextElement();
                    if (objNextElement == null || objNextElement.equals(bc.a)) {
                        stringBuffer.append(str2);
                        stringBuffer.append("NULL");
                        stringBuffer.append(strA);
                    } else if (objNextElement instanceof u) {
                        a(str2, z, (u) objNextElement, stringBuffer);
                    } else {
                        a(str2, z, ((org.bouncycastle.a.f) objNextElement).i(), stringBuffer);
                    }
                }
                return;
            }
            if (uVarJ instanceof ab) {
                String str3 = str + "    ";
                stringBuffer.append(str);
                if (uVarJ instanceof ap) {
                    stringBuffer.append("BER Tagged [");
                } else {
                    stringBuffer.append("Tagged [");
                }
                ab abVar = (ab) uVarJ;
                stringBuffer.append(Integer.toString(abVar.b()));
                stringBuffer.append(']');
                if (!abVar.c()) {
                    stringBuffer.append(" IMPLICIT ");
                }
                stringBuffer.append(strA);
                if (abVar.f()) {
                    stringBuffer.append(str3);
                    stringBuffer.append("EMPTY");
                    stringBuffer.append(strA);
                    return;
                }
                uVarJ = abVar.j();
                str = str3;
            } else {
                if (uVarJ instanceof x) {
                    Enumeration enumerationB = ((x) uVarJ).b();
                    String str4 = str + "    ";
                    stringBuffer.append(str);
                    if (uVarJ instanceof an) {
                        stringBuffer.append("BER Set");
                    } else if (uVarJ instanceof bk) {
                        stringBuffer.append("DER Set");
                    } else {
                        stringBuffer.append("Set");
                    }
                    stringBuffer.append(strA);
                    while (enumerationB.hasMoreElements()) {
                        Object objNextElement2 = enumerationB.nextElement();
                        if (objNextElement2 == null) {
                            stringBuffer.append(str4);
                            stringBuffer.append("NULL");
                            stringBuffer.append(strA);
                        } else if (objNextElement2 instanceof u) {
                            a(str4, z, (u) objNextElement2, stringBuffer);
                        } else {
                            a(str4, z, ((org.bouncycastle.a.f) objNextElement2).i(), stringBuffer);
                        }
                    }
                    return;
                }
                if (uVarJ instanceof q) {
                    q qVar = (q) uVarJ;
                    if (uVarJ instanceof ah) {
                        stringBuffer.append(str + "BER Constructed Octet String[" + qVar.c().length + "] ");
                    } else {
                        stringBuffer.append(str + "DER Octet String[" + qVar.c().length + "] ");
                    }
                    if (z) {
                        stringBuffer.append(a(str, qVar.c()));
                        return;
                    } else {
                        stringBuffer.append(strA);
                        return;
                    }
                }
                if (uVarJ instanceof p) {
                    stringBuffer.append(str + "ObjectIdentifier(" + ((p) uVarJ).b() + ")" + strA);
                    return;
                }
                if (uVarJ instanceof d) {
                    stringBuffer.append(str + "Boolean(" + ((d) uVarJ).b() + ")" + strA);
                    return;
                }
                if (uVarJ instanceof m) {
                    stringBuffer.append(str + "Integer(" + ((m) uVarJ).b() + ")" + strA);
                    return;
                }
                if (uVarJ instanceof au) {
                    au auVar = (au) uVarJ;
                    stringBuffer.append(str + "DER Bit String[" + auVar.d().length + ", " + auVar.f() + "] ");
                    if (z) {
                        stringBuffer.append(a(str, auVar.d()));
                        return;
                    } else {
                        stringBuffer.append(strA);
                        return;
                    }
                }
                if (uVarJ instanceof bb) {
                    stringBuffer.append(str + "IA5String(" + ((bb) uVarJ).b() + ") " + strA);
                    return;
                }
                if (uVarJ instanceof bo) {
                    stringBuffer.append(str + "UTF8String(" + ((bo) uVarJ).b() + ") " + strA);
                    return;
                }
                if (uVarJ instanceof bh) {
                    stringBuffer.append(str + "PrintableString(" + ((bh) uVarJ).b() + ") " + strA);
                    return;
                }
                if (uVarJ instanceof br) {
                    stringBuffer.append(str + "VisibleString(" + ((br) uVarJ).b() + ") " + strA);
                    return;
                }
                if (uVarJ instanceof at) {
                    stringBuffer.append(str + "BMPString(" + ((at) uVarJ).b() + ") " + strA);
                    return;
                }
                if (uVarJ instanceof bm) {
                    stringBuffer.append(str + "T61String(" + ((bm) uVarJ).b() + ") " + strA);
                    return;
                }
                if (uVarJ instanceof ba) {
                    stringBuffer.append(str + "GraphicString(" + ((ba) uVarJ).b() + ") " + strA);
                    return;
                }
                if (uVarJ instanceof bq) {
                    stringBuffer.append(str + "VideotexString(" + ((bq) uVarJ).b() + ") " + strA);
                    return;
                }
                if (uVarJ instanceof ad) {
                    stringBuffer.append(str + "UTCTime(" + ((ad) uVarJ).c() + ") " + strA);
                    return;
                }
                if (uVarJ instanceof org.bouncycastle.a.k) {
                    stringBuffer.append(str + "GeneralizedTime(" + ((org.bouncycastle.a.k) uVarJ).b() + ") " + strA);
                    return;
                }
                if (uVarJ instanceof ae) {
                    stringBuffer.append(a("BER", str, z, uVarJ, strA));
                    return;
                }
                if (uVarJ instanceof as) {
                    stringBuffer.append(a("DER", str, z, uVarJ, strA));
                    return;
                }
                if (uVarJ instanceof bs) {
                    stringBuffer.append(a("", str, z, uVarJ, strA));
                    return;
                }
                if (uVarJ instanceof h) {
                    stringBuffer.append(str + "DER Enumerated(" + ((h) uVarJ).b() + ")" + strA);
                    return;
                }
                if (!(uVarJ instanceof j)) {
                    stringBuffer.append(str + uVarJ.toString() + strA);
                    return;
                }
                j jVar = (j) uVarJ;
                stringBuffer.append(str + "External " + strA);
                str = str + "    ";
                if (jVar.c() != null) {
                    stringBuffer.append(str + "Direct Reference: " + jVar.c().b() + strA);
                }
                if (jVar.j() != null) {
                    stringBuffer.append(str + "Indirect Reference: " + jVar.j().toString() + strA);
                }
                if (jVar.b() != null) {
                    a(str, z, jVar.b(), stringBuffer);
                }
                stringBuffer.append(str + "Encoding: " + jVar.d() + strA);
                uVarJ = jVar.f();
            }
        }
    }

    private static String a(String str, String str2, boolean z, u uVar, String str3) {
        if (uVar != null && !(uVar instanceof org.bouncycastle.a.a)) {
            throw new IllegalArgumentException("unknown object in getInstance: " + uVar.getClass().getName());
        }
        org.bouncycastle.a.a aVar = (org.bouncycastle.a.a) uVar;
        StringBuffer stringBuffer = new StringBuffer();
        if (!aVar.a()) {
            return str2 + str + " ApplicationSpecific[" + aVar.c() + "] (" + k.b(f.b(aVar.b())) + ")" + str3;
        }
        try {
            v vVarA = v.a((Object) aVar.d());
            stringBuffer.append(str2 + str + " ApplicationSpecific[" + aVar.c() + "]" + str3);
            Enumeration enumerationC = vVarA.c();
            while (enumerationC.hasMoreElements()) {
                a(str2 + "    ", z, (u) enumerationC.nextElement(), stringBuffer);
            }
        } catch (IOException e) {
            stringBuffer.append(e);
        }
        return stringBuffer.toString();
    }

    public static String a(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof u) {
            a("", false, (u) obj, stringBuffer);
        } else {
            if (!(obj instanceof org.bouncycastle.a.f)) {
                return "unknown object type " + obj.toString();
            }
            a("", false, ((org.bouncycastle.a.f) obj).i(), stringBuffer);
        }
        return stringBuffer.toString();
    }
}
