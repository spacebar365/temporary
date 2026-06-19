package org.bouncycastle.p054a.p082z;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0587bk;
import org.bouncycastle.p054a.C0592bp;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0502aa;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p142f.C1560k;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.z.y */
/* JADX INFO: loaded from: classes.dex */
public class C0784y extends AbstractC0650o {

    /* JADX INFO: renamed from: S */
    private AbstractC0785z f3287S = null;

    /* JADX INFO: renamed from: T */
    private Vector f3288T = new Vector();

    /* JADX INFO: renamed from: U */
    private Vector f3289U = new Vector();

    /* JADX INFO: renamed from: V */
    private Vector f3290V = new Vector();

    /* JADX INFO: renamed from: W */
    private AbstractC0723v f3291W;

    /* JADX INFO: renamed from: X */
    private boolean f3292X;

    /* JADX INFO: renamed from: Y */
    private int f3293Y;

    /* JADX INFO: renamed from: a */
    public static final C0653p f3261a = new C0653p("2.5.4.6");

    /* JADX INFO: renamed from: b */
    public static final C0653p f3262b = new C0653p("2.5.4.10");

    /* JADX INFO: renamed from: c */
    public static final C0653p f3263c = new C0653p("2.5.4.11");

    /* JADX INFO: renamed from: d */
    public static final C0653p f3264d = new C0653p("2.5.4.12");

    /* JADX INFO: renamed from: e */
    public static final C0653p f3265e = new C0653p("2.5.4.3");

    /* JADX INFO: renamed from: f */
    public static final C0653p f3266f = new C0653p("2.5.4.5");

    /* JADX INFO: renamed from: g */
    public static final C0653p f3267g = new C0653p("2.5.4.9");

    /* JADX INFO: renamed from: h */
    public static final C0653p f3268h = f3266f;

    /* JADX INFO: renamed from: i */
    public static final C0653p f3269i = new C0653p("2.5.4.7");

    /* JADX INFO: renamed from: j */
    public static final C0653p f3270j = new C0653p("2.5.4.8");

    /* JADX INFO: renamed from: k */
    public static final C0653p f3271k = new C0653p("2.5.4.4");

    /* JADX INFO: renamed from: l */
    public static final C0653p f3272l = new C0653p("2.5.4.42");

    /* JADX INFO: renamed from: m */
    public static final C0653p f3273m = new C0653p("2.5.4.43");

    /* JADX INFO: renamed from: n */
    public static final C0653p f3274n = new C0653p("2.5.4.44");

    /* JADX INFO: renamed from: o */
    public static final C0653p f3275o = new C0653p("2.5.4.45");

    /* JADX INFO: renamed from: p */
    public static final C0653p f3276p = new C0653p("2.5.4.15");

    /* JADX INFO: renamed from: q */
    public static final C0653p f3277q = new C0653p("2.5.4.17");

    /* JADX INFO: renamed from: r */
    public static final C0653p f3278r = new C0653p("2.5.4.46");

    /* JADX INFO: renamed from: s */
    public static final C0653p f3279s = new C0653p("2.5.4.65");

    /* JADX INFO: renamed from: t */
    public static final C0653p f3280t = new C0653p("1.3.6.1.5.5.7.9.1");

    /* JADX INFO: renamed from: u */
    public static final C0653p f3281u = new C0653p("1.3.6.1.5.5.7.9.2");

    /* JADX INFO: renamed from: v */
    public static final C0653p f3282v = new C0653p("1.3.6.1.5.5.7.9.3");

    /* JADX INFO: renamed from: w */
    public static final C0653p f3283w = new C0653p("1.3.6.1.5.5.7.9.4");

    /* JADX INFO: renamed from: x */
    public static final C0653p f3284x = new C0653p("1.3.6.1.5.5.7.9.5");

    /* JADX INFO: renamed from: y */
    public static final C0653p f3285y = new C0653p("1.3.36.8.3.14");

    /* JADX INFO: renamed from: z */
    public static final C0653p f3286z = new C0653p("2.5.4.16");

    /* JADX INFO: renamed from: A */
    public static final C0653p f3243A = new C0653p("2.5.4.54");

    /* JADX INFO: renamed from: B */
    public static final C0653p f3244B = InterfaceC0760aa.f3121g;

    /* JADX INFO: renamed from: C */
    public static final C0653p f3245C = InterfaceC0760aa.f3135w_;

    /* JADX INFO: renamed from: D */
    public static final C0653p f3246D = InterfaceC0674n.f2635X;

    /* JADX INFO: renamed from: E */
    public static final C0653p f3247E = InterfaceC0674n.f2636Y;

    /* JADX INFO: renamed from: F */
    public static final C0653p f3248F = InterfaceC0674n.f2668ae;

    /* JADX INFO: renamed from: G */
    public static final C0653p f3249G = f3246D;

    /* JADX INFO: renamed from: H */
    public static final C0653p f3250H = new C0653p("0.9.2342.19200300.100.1.25");

    /* JADX INFO: renamed from: I */
    public static final C0653p f3251I = new C0653p("0.9.2342.19200300.100.1.1");

    /* JADX INFO: renamed from: J */
    public static boolean f3252J = false;

    /* JADX INFO: renamed from: K */
    public static final Hashtable f3253K = new Hashtable();

    /* JADX INFO: renamed from: L */
    public static final Hashtable f3254L = new Hashtable();

    /* JADX INFO: renamed from: M */
    public static final Hashtable f3255M = new Hashtable();

    /* JADX INFO: renamed from: N */
    public static final Hashtable f3256N = new Hashtable();

    /* JADX INFO: renamed from: O */
    public static final Hashtable f3257O = f3253K;

    /* JADX INFO: renamed from: P */
    public static final Hashtable f3258P = f3256N;

    /* JADX INFO: renamed from: Q */
    private static final Boolean f3259Q = Boolean.TRUE;

    /* JADX INFO: renamed from: R */
    private static final Boolean f3260R = Boolean.FALSE;

    static {
        f3253K.put(f3261a, "C");
        f3253K.put(f3262b, "O");
        f3253K.put(f3264d, "T");
        f3253K.put(f3263c, "OU");
        f3253K.put(f3265e, "CN");
        f3253K.put(f3269i, "L");
        f3253K.put(f3270j, "ST");
        f3253K.put(f3266f, "SERIALNUMBER");
        f3253K.put(f3246D, "E");
        f3253K.put(f3250H, "DC");
        f3253K.put(f3251I, "UID");
        f3253K.put(f3267g, "STREET");
        f3253K.put(f3271k, "SURNAME");
        f3253K.put(f3272l, "GIVENNAME");
        f3253K.put(f3273m, "INITIALS");
        f3253K.put(f3274n, "GENERATION");
        f3253K.put(f3248F, "unstructuredAddress");
        f3253K.put(f3247E, "unstructuredName");
        f3253K.put(f3275o, "UniqueIdentifier");
        f3253K.put(f3278r, "DN");
        f3253K.put(f3279s, "Pseudonym");
        f3253K.put(f3286z, "PostalAddress");
        f3253K.put(f3285y, "NameAtBirth");
        f3253K.put(f3283w, "CountryOfCitizenship");
        f3253K.put(f3284x, "CountryOfResidence");
        f3253K.put(f3282v, "Gender");
        f3253K.put(f3281u, "PlaceOfBirth");
        f3253K.put(f3280t, "DateOfBirth");
        f3253K.put(f3277q, "PostalCode");
        f3253K.put(f3276p, "BusinessCategory");
        f3253K.put(f3244B, "TelephoneNumber");
        f3253K.put(f3245C, "Name");
        f3254L.put(f3261a, "C");
        f3254L.put(f3262b, "O");
        f3254L.put(f3263c, "OU");
        f3254L.put(f3265e, "CN");
        f3254L.put(f3269i, "L");
        f3254L.put(f3270j, "ST");
        f3254L.put(f3267g, "STREET");
        f3254L.put(f3250H, "DC");
        f3254L.put(f3251I, "UID");
        f3255M.put(f3261a, "C");
        f3255M.put(f3262b, "O");
        f3255M.put(f3263c, "OU");
        f3255M.put(f3265e, "CN");
        f3255M.put(f3269i, "L");
        f3255M.put(f3270j, "ST");
        f3255M.put(f3267g, "STREET");
        f3256N.put("c", f3261a);
        f3256N.put("o", f3262b);
        f3256N.put("t", f3264d);
        f3256N.put("ou", f3263c);
        f3256N.put("cn", f3265e);
        f3256N.put("l", f3269i);
        f3256N.put("st", f3270j);
        f3256N.put("sn", f3266f);
        f3256N.put("serialnumber", f3266f);
        f3256N.put("street", f3267g);
        f3256N.put("emailaddress", f3249G);
        f3256N.put("dc", f3250H);
        f3256N.put("e", f3249G);
        f3256N.put("uid", f3251I);
        f3256N.put("surname", f3271k);
        f3256N.put("givenname", f3272l);
        f3256N.put("initials", f3273m);
        f3256N.put("generation", f3274n);
        f3256N.put("unstructuredaddress", f3248F);
        f3256N.put("unstructuredname", f3247E);
        f3256N.put("uniqueidentifier", f3275o);
        f3256N.put("dn", f3278r);
        f3256N.put("pseudonym", f3279s);
        f3256N.put("postaladdress", f3286z);
        f3256N.put("nameofbirth", f3285y);
        f3256N.put("countryofcitizenship", f3283w);
        f3256N.put("countryofresidence", f3284x);
        f3256N.put("gender", f3282v);
        f3256N.put("placeofbirth", f3281u);
        f3256N.put("dateofbirth", f3280t);
        f3256N.put("postalcode", f3277q);
        f3256N.put("businesscategory", f3276p);
        f3256N.put("telephonenumber", f3244B);
        f3256N.put("name", f3245C);
    }

    protected C0784y() {
    }

    public C0784y(AbstractC0723v abstractC0723v) {
        this.f3291W = abstractC0723v;
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        while (enumerationMo1483c.hasMoreElements()) {
            AbstractC0747x abstractC0747xM1741a = AbstractC0747x.m1741a((Object) ((InterfaceC0618f) enumerationMo1483c.nextElement()).mo1358i());
            int i = 0;
            while (i < abstractC0747xM1741a.m1748c()) {
                AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a((Object) abstractC0747xM1741a.m1746a(i).mo1358i());
                if (abstractC0723vM1708a.mo1484d() != 2) {
                    throw new IllegalArgumentException("badly sized pair");
                }
                this.f3288T.addElement(C0653p.m1584a(abstractC0723vM1708a.mo1482a(0)));
                InterfaceC0618f interfaceC0618fMo1482a = abstractC0723vM1708a.mo1482a(1);
                if (!(interfaceC0618fMo1482a instanceof InterfaceC0502aa) || (interfaceC0618fMo1482a instanceof C0592bp)) {
                    try {
                        this.f3289U.addElement("#" + m1862a(C1541f.m4108b(interfaceC0618fMo1482a.mo1358i().m1577a("DER"))));
                    } catch (IOException e) {
                        throw new IllegalArgumentException("cannot encode value");
                    }
                } else {
                    String strMo1350b = ((InterfaceC0502aa) interfaceC0618fMo1482a).mo1350b();
                    if (strMo1350b.length() <= 0 || strMo1350b.charAt(0) != '#') {
                        this.f3289U.addElement(strMo1350b);
                    } else {
                        this.f3289U.addElement("\\".concat(String.valueOf(strMo1350b)));
                    }
                }
                this.f3290V.addElement(i != 0 ? f3259Q : f3260R);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m1862a(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i != cArr.length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: a */
    private static void m1863a(StringBuffer stringBuffer, Hashtable hashtable, C0653p c0653p, String str) {
        String str2 = (String) hashtable.get(c0653p);
        if (str2 != null) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append(c0653p.m1593b());
        }
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            } else {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (length <= length2) {
            switch (stringBuffer.charAt(length)) {
                case '\"':
                case '+':
                case ',':
                case ';':
                case '<':
                case '=':
                case '>':
                case '\\':
                    stringBuffer.insert(length, "\\");
                    length += 2;
                    length2++;
                    break;
                default:
                    length++;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m1864b(String str) {
        String strM4166c = C1560k.m4166c(str.trim());
        if (strM4166c.length() > 0 && strM4166c.charAt(0) == '#') {
            Object objM1865c = m1865c(strM4166c);
            if (objM1865c instanceof InterfaceC0502aa) {
                return C1560k.m4166c(((InterfaceC0502aa) objM1865c).mo1350b().trim());
            }
        }
        return strM4166c;
    }

    /* JADX INFO: renamed from: c */
    private static AbstractC0686u m1865c(String str) {
        try {
            return AbstractC0686u.m1692b(C1541f.m4106a(str.substring(1)));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: ".concat(String.valueOf(e)));
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m1866d(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i = 1;
            while (i < str.length()) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o
    public int hashCode() {
        if (this.f3292X) {
            return this.f3293Y;
        }
        this.f3292X = true;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == this.f3288T.size()) {
                return this.f3293Y;
            }
            String strM1866d = m1866d(m1864b((String) this.f3289U.elementAt(i2)));
            this.f3293Y ^= this.f3288T.elementAt(i2).hashCode();
            this.f3293Y = strM1866d.hashCode() ^ this.f3293Y;
            i = i2 + 1;
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        if (this.f3291W == null) {
            C0625g c0625g = new C0625g();
            C0625g c0625g2 = new C0625g();
            int i = 0;
            C0653p c0653p = null;
            while (i != this.f3288T.size()) {
                C0625g c0625g3 = new C0625g();
                C0653p c0653p2 = (C0653p) this.f3288T.elementAt(i);
                c0625g3.m1521a(c0653p2);
                this.f3289U.elementAt(i);
                c0625g3.m1521a(this.f3287S.m1867a());
                if (c0653p == null || ((Boolean) this.f3290V.elementAt(i)).booleanValue()) {
                    c0625g2.m1521a(new C0585bi(c0625g3));
                } else {
                    c0625g.m1521a(new C0587bk(c0625g2));
                    c0625g2 = new C0625g();
                    c0625g2.m1521a(new C0585bi(c0625g3));
                }
                i++;
                c0653p = c0653p2;
            }
            c0625g.m1521a(new C0587bk(c0625g2));
            this.f3291W = new C0585bi(c0625g);
        }
        return this.f3291W;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[Catch: IllegalArgumentException -> 0x0060, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0060, blocks: (B:15:0x0026, B:21:0x003c, B:23:0x0040, B:25:0x0053, B:17:0x002a), top: B:55:0x0026 }] */
    @Override // org.bouncycastle.p054a.AbstractC0650o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.p054a.p082z.C0784y.equals(java.lang.Object):boolean");
    }

    public String toString() {
        boolean z = f3252J;
        Hashtable hashtable = f3253K;
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        int i = 0;
        while (i < this.f3288T.size()) {
            if (((Boolean) this.f3290V.elementAt(i)).booleanValue()) {
                stringBuffer2.append('+');
                m1863a(stringBuffer2, hashtable, (C0653p) this.f3288T.elementAt(i), (String) this.f3289U.elementAt(i));
            } else {
                stringBuffer2 = new StringBuffer();
                m1863a(stringBuffer2, hashtable, (C0653p) this.f3288T.elementAt(i), (String) this.f3289U.elementAt(i));
                vector.addElement(stringBuffer2);
            }
            i++;
            stringBuffer2 = stringBuffer2;
        }
        if (z) {
            boolean z2 = true;
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(size).toString());
            }
        } else {
            boolean z3 = true;
            for (int i2 = 0; i2 < vector.size(); i2++) {
                if (z3) {
                    z3 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(i2).toString());
            }
        }
        return stringBuffer.toString();
    }
}
