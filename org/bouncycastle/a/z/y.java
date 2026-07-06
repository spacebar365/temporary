package org.bouncycastle.a.z;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bk;
import org.bouncycastle.a.bp;

/* JADX INFO: loaded from: classes.dex */
public class y extends org.bouncycastle.a.o {
    private z S = null;
    private Vector T = new Vector();
    private Vector U = new Vector();
    private Vector V = new Vector();
    private org.bouncycastle.a.v W;
    private boolean X;
    private int Y;
    public static final org.bouncycastle.a.p a = new org.bouncycastle.a.p("2.5.4.6");
    public static final org.bouncycastle.a.p b = new org.bouncycastle.a.p("2.5.4.10");
    public static final org.bouncycastle.a.p c = new org.bouncycastle.a.p("2.5.4.11");
    public static final org.bouncycastle.a.p d = new org.bouncycastle.a.p("2.5.4.12");
    public static final org.bouncycastle.a.p e = new org.bouncycastle.a.p("2.5.4.3");
    public static final org.bouncycastle.a.p f = new org.bouncycastle.a.p("2.5.4.5");
    public static final org.bouncycastle.a.p g = new org.bouncycastle.a.p("2.5.4.9");
    public static final org.bouncycastle.a.p h = f;
    public static final org.bouncycastle.a.p i = new org.bouncycastle.a.p("2.5.4.7");
    public static final org.bouncycastle.a.p j = new org.bouncycastle.a.p("2.5.4.8");
    public static final org.bouncycastle.a.p k = new org.bouncycastle.a.p("2.5.4.4");
    public static final org.bouncycastle.a.p l = new org.bouncycastle.a.p("2.5.4.42");
    public static final org.bouncycastle.a.p m = new org.bouncycastle.a.p("2.5.4.43");
    public static final org.bouncycastle.a.p n = new org.bouncycastle.a.p("2.5.4.44");
    public static final org.bouncycastle.a.p o = new org.bouncycastle.a.p("2.5.4.45");
    public static final org.bouncycastle.a.p p = new org.bouncycastle.a.p("2.5.4.15");
    public static final org.bouncycastle.a.p q = new org.bouncycastle.a.p("2.5.4.17");
    public static final org.bouncycastle.a.p r = new org.bouncycastle.a.p("2.5.4.46");
    public static final org.bouncycastle.a.p s = new org.bouncycastle.a.p("2.5.4.65");
    public static final org.bouncycastle.a.p t = new org.bouncycastle.a.p("1.3.6.1.5.5.7.9.1");
    public static final org.bouncycastle.a.p u = new org.bouncycastle.a.p("1.3.6.1.5.5.7.9.2");
    public static final org.bouncycastle.a.p v = new org.bouncycastle.a.p("1.3.6.1.5.5.7.9.3");
    public static final org.bouncycastle.a.p w = new org.bouncycastle.a.p("1.3.6.1.5.5.7.9.4");
    public static final org.bouncycastle.a.p x = new org.bouncycastle.a.p("1.3.6.1.5.5.7.9.5");
    public static final org.bouncycastle.a.p y = new org.bouncycastle.a.p("1.3.36.8.3.14");
    public static final org.bouncycastle.a.p z = new org.bouncycastle.a.p("2.5.4.16");
    public static final org.bouncycastle.a.p A = new org.bouncycastle.a.p("2.5.4.54");
    public static final org.bouncycastle.a.p B = aa.g;
    public static final org.bouncycastle.a.p C = aa.w_;
    public static final org.bouncycastle.a.p D = org.bouncycastle.a.s.n.X;
    public static final org.bouncycastle.a.p E = org.bouncycastle.a.s.n.Y;
    public static final org.bouncycastle.a.p F = org.bouncycastle.a.s.n.ae;
    public static final org.bouncycastle.a.p G = D;
    public static final org.bouncycastle.a.p H = new org.bouncycastle.a.p("0.9.2342.19200300.100.1.25");
    public static final org.bouncycastle.a.p I = new org.bouncycastle.a.p("0.9.2342.19200300.100.1.1");
    public static boolean J = false;
    public static final Hashtable K = new Hashtable();
    public static final Hashtable L = new Hashtable();
    public static final Hashtable M = new Hashtable();
    public static final Hashtable N = new Hashtable();
    public static final Hashtable O = K;
    public static final Hashtable P = N;
    private static final Boolean Q = Boolean.TRUE;
    private static final Boolean R = Boolean.FALSE;

    static {
        K.put(a, "C");
        K.put(b, "O");
        K.put(d, "T");
        K.put(c, "OU");
        K.put(e, "CN");
        K.put(i, "L");
        K.put(j, "ST");
        K.put(f, "SERIALNUMBER");
        K.put(D, "E");
        K.put(H, "DC");
        K.put(I, "UID");
        K.put(g, "STREET");
        K.put(k, "SURNAME");
        K.put(l, "GIVENNAME");
        K.put(m, "INITIALS");
        K.put(n, "GENERATION");
        K.put(F, "unstructuredAddress");
        K.put(E, "unstructuredName");
        K.put(o, "UniqueIdentifier");
        K.put(r, "DN");
        K.put(s, "Pseudonym");
        K.put(z, "PostalAddress");
        K.put(y, "NameAtBirth");
        K.put(w, "CountryOfCitizenship");
        K.put(x, "CountryOfResidence");
        K.put(v, "Gender");
        K.put(u, "PlaceOfBirth");
        K.put(t, "DateOfBirth");
        K.put(q, "PostalCode");
        K.put(p, "BusinessCategory");
        K.put(B, "TelephoneNumber");
        K.put(C, "Name");
        L.put(a, "C");
        L.put(b, "O");
        L.put(c, "OU");
        L.put(e, "CN");
        L.put(i, "L");
        L.put(j, "ST");
        L.put(g, "STREET");
        L.put(H, "DC");
        L.put(I, "UID");
        M.put(a, "C");
        M.put(b, "O");
        M.put(c, "OU");
        M.put(e, "CN");
        M.put(i, "L");
        M.put(j, "ST");
        M.put(g, "STREET");
        N.put("c", a);
        N.put("o", b);
        N.put("t", d);
        N.put("ou", c);
        N.put("cn", e);
        N.put("l", i);
        N.put("st", j);
        N.put("sn", f);
        N.put("serialnumber", f);
        N.put("street", g);
        N.put("emailaddress", G);
        N.put("dc", H);
        N.put("e", G);
        N.put("uid", I);
        N.put("surname", k);
        N.put("givenname", l);
        N.put("initials", m);
        N.put("generation", n);
        N.put("unstructuredaddress", F);
        N.put("unstructuredname", E);
        N.put("uniqueidentifier", o);
        N.put("dn", r);
        N.put("pseudonym", s);
        N.put("postaladdress", z);
        N.put("nameofbirth", y);
        N.put("countryofcitizenship", w);
        N.put("countryofresidence", x);
        N.put("gender", v);
        N.put("placeofbirth", u);
        N.put("dateofbirth", t);
        N.put("postalcode", q);
        N.put("businesscategory", p);
        N.put("telephonenumber", B);
        N.put("name", C);
    }

    protected y() {
    }

    public y(org.bouncycastle.a.v vVar) {
        this.W = vVar;
        Enumeration enumerationC = vVar.c();
        while (enumerationC.hasMoreElements()) {
            org.bouncycastle.a.x xVarA = org.bouncycastle.a.x.a((Object) ((org.bouncycastle.a.f) enumerationC.nextElement()).i());
            int i2 = 0;
            while (i2 < xVarA.c()) {
                org.bouncycastle.a.v vVarA = org.bouncycastle.a.v.a((Object) xVarA.a(i2).i());
                if (vVarA.d() != 2) {
                    throw new IllegalArgumentException("badly sized pair");
                }
                this.T.addElement(org.bouncycastle.a.p.a(vVarA.a(0)));
                org.bouncycastle.a.f fVarA = vVarA.a(1);
                if (!(fVarA instanceof org.bouncycastle.a.aa) || (fVarA instanceof bp)) {
                    try {
                        this.U.addElement("#" + a(org.bouncycastle.f.a.f.b(fVarA.i().a("DER"))));
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("cannot encode value");
                    }
                } else {
                    String strB = ((org.bouncycastle.a.aa) fVarA).b();
                    if (strB.length() <= 0 || strB.charAt(0) != '#') {
                        this.U.addElement(strB);
                    } else {
                        this.U.addElement("\\".concat(String.valueOf(strB)));
                    }
                }
                this.V.addElement(i2 != 0 ? Q : R);
                i2++;
            }
        }
    }

    private static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i2 = 0; i2 != cArr.length; i2++) {
            cArr[i2] = (char) (bArr[i2] & 255);
        }
        return new String(cArr);
    }

    private static void a(StringBuffer stringBuffer, Hashtable hashtable, org.bouncycastle.a.p pVar, String str) {
        String str2 = (String) hashtable.get(pVar);
        if (str2 != null) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append(pVar.b());
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

    private static String b(String str) {
        String strC = org.bouncycastle.f.k.c(str.trim());
        if (strC.length() > 0 && strC.charAt(0) == '#') {
            Object objC = c(strC);
            if (objC instanceof org.bouncycastle.a.aa) {
                return org.bouncycastle.f.k.c(((org.bouncycastle.a.aa) objC).b().trim());
            }
        }
        return strC;
    }

    private static org.bouncycastle.a.u c(String str) {
        try {
            return org.bouncycastle.a.u.b(org.bouncycastle.f.a.f.a(str.substring(1)));
        } catch (IOException e2) {
            throw new IllegalStateException("unknown encoding in name: ".concat(String.valueOf(e2)));
        }
    }

    private static String d(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i2 = 1;
            while (i2 < str.length()) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i2++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.a.o
    public int hashCode() {
        if (this.X) {
            return this.Y;
        }
        this.X = true;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 == this.T.size()) {
                return this.Y;
            }
            String strD = d(b((String) this.U.elementAt(i3)));
            this.Y ^= this.T.elementAt(i3).hashCode();
            this.Y = strD.hashCode() ^ this.Y;
            i2 = i3 + 1;
        }
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        if (this.W == null) {
            org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
            org.bouncycastle.a.g gVar2 = new org.bouncycastle.a.g();
            int i2 = 0;
            org.bouncycastle.a.p pVar = null;
            while (i2 != this.T.size()) {
                org.bouncycastle.a.g gVar3 = new org.bouncycastle.a.g();
                org.bouncycastle.a.p pVar2 = (org.bouncycastle.a.p) this.T.elementAt(i2);
                gVar3.a(pVar2);
                this.U.elementAt(i2);
                gVar3.a(this.S.a());
                if (pVar == null || ((Boolean) this.V.elementAt(i2)).booleanValue()) {
                    gVar2.a(new bi(gVar3));
                } else {
                    gVar.a(new bk(gVar2));
                    gVar2 = new org.bouncycastle.a.g();
                    gVar2.a(new bi(gVar3));
                }
                i2++;
                pVar = pVar2;
            }
            gVar.a(new bk(gVar2));
            this.W = new bi(gVar);
        }
        return this.W;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[Catch: IllegalArgumentException -> 0x0060, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0060, blocks: (B:15:0x0026, B:21:0x003c, B:23:0x0040, B:25:0x0053, B:17:0x002a), top: B:55:0x0026 }] */
    @Override // org.bouncycastle.a.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.a.z.y.equals(java.lang.Object):boolean");
    }

    public String toString() {
        boolean z2 = J;
        Hashtable hashtable = K;
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        int i2 = 0;
        while (i2 < this.T.size()) {
            if (((Boolean) this.V.elementAt(i2)).booleanValue()) {
                stringBuffer2.append('+');
                a(stringBuffer2, hashtable, (org.bouncycastle.a.p) this.T.elementAt(i2), (String) this.U.elementAt(i2));
            } else {
                stringBuffer2 = new StringBuffer();
                a(stringBuffer2, hashtable, (org.bouncycastle.a.p) this.T.elementAt(i2), (String) this.U.elementAt(i2));
                vector.addElement(stringBuffer2);
            }
            i2++;
            stringBuffer2 = stringBuffer2;
        }
        if (z2) {
            boolean z3 = true;
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (z3) {
                    z3 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(size).toString());
            }
        } else {
            boolean z4 = true;
            for (int i3 = 0; i3 < vector.size(); i3++) {
                if (z4) {
                    z4 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(i3).toString());
            }
        }
        return stringBuffer.toString();
    }
}
