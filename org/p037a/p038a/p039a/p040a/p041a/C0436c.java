package org.p037a.p038a.p039a.p040a.p041a;

import java.util.Locale;
import java.util.regex.Pattern;
import org.p037a.p038a.p039a.p040a.C0453d;
import org.p037a.p038a.p039a.p040a.InterfaceC0433a;
import org.p037a.p038a.p039a.p040a.InterfaceC0457h;

/* JADX INFO: renamed from: org.a.a.a.a.a.c */
/* JADX INFO: compiled from: DefaultFTPFileEntryParserFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0436c implements InterfaceC0437d {

    /* JADX INFO: renamed from: a */
    private static final Pattern f1557a = Pattern.compile("(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*");

    @Override // org.p037a.p038a.p039a.p040a.p041a.InterfaceC0437d
    /* JADX INFO: renamed from: a */
    public final InterfaceC0457h mo1183a(String str) {
        if (str == null) {
            throw new C0446m("Parser key cannot be null");
        }
        return m1182a(str, null);
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC0457h m1182a(String str, C0453d c0453d) {
        InterfaceC0457h interfaceC0457h;
        InterfaceC0457h c0448o;
        InterfaceC0457h c0434a;
        InterfaceC0457h c0434a2;
        boolean z = false;
        if (f1557a.matcher(str).matches()) {
            try {
                Class<?> cls = Class.forName(str);
                try {
                    interfaceC0457h = (InterfaceC0457h) cls.newInstance();
                } catch (ClassCastException e) {
                    throw new C0446m(cls.getName() + " does not implement the interface org.apache.commons.net.ftp.FTPFileEntryParser.", e);
                } catch (Exception e2) {
                    throw new C0446m("Error initializing parser", e2);
                } catch (ExceptionInInitializerError e3) {
                    throw new C0446m("Error initializing parser", e3);
                }
            } catch (ClassNotFoundException e4) {
                interfaceC0457h = null;
            }
        } else {
            interfaceC0457h = null;
        }
        if (interfaceC0457h == null) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            if (upperCase.indexOf("UNIX_LTRIM") >= 0) {
                c0448o = new C0448o(c0453d, true);
            } else if (upperCase.indexOf("UNIX") >= 0) {
                c0448o = new C0448o(c0453d, false);
            } else if (upperCase.indexOf("VMS") >= 0) {
                c0448o = new C0450q(c0453d);
            } else if (upperCase.indexOf("WINDOWS") < 0) {
                if (upperCase.indexOf("OS/2") >= 0) {
                    c0448o = new C0444k(c0453d);
                } else if (upperCase.indexOf("OS/400") < 0 && upperCase.indexOf("AS/400") < 0) {
                    if (upperCase.indexOf("MVS") >= 0) {
                        c0448o = new C0440g();
                    } else if (upperCase.indexOf("NETWARE") >= 0) {
                        c0448o = new C0443j(c0453d);
                    } else if (upperCase.indexOf("MACOS PETER") >= 0) {
                        c0448o = new C0441h(c0453d);
                    } else if (upperCase.indexOf("TYPE: L8") >= 0) {
                        c0448o = new C0448o(c0453d);
                    } else {
                        throw new C0446m("Unknown parser type: ".concat(String.valueOf(str)));
                    }
                } else {
                    if (c0453d != null && "OS/400".equals(c0453d.m1233a())) {
                        c0434a = new C0445l(c0453d);
                    } else {
                        C0453d c0453d2 = c0453d != null ? new C0453d(c0453d) : null;
                        InterfaceC0457h[] interfaceC0457hArr = new InterfaceC0457h[2];
                        interfaceC0457hArr[0] = new C0445l(c0453d);
                        if (c0453d2 != null && "UNIX_LTRIM".equals(c0453d2.m1233a())) {
                            z = true;
                        }
                        interfaceC0457hArr[1] = new C0448o(c0453d2, z);
                        c0434a = new C0434a(interfaceC0457hArr);
                    }
                    c0448o = c0434a;
                }
            } else {
                if (c0453d != null && "WINDOWS".equals(c0453d.m1233a())) {
                    c0434a2 = new C0442i(c0453d);
                } else {
                    C0453d c0453d3 = c0453d != null ? new C0453d(c0453d) : null;
                    InterfaceC0457h[] interfaceC0457hArr2 = new InterfaceC0457h[2];
                    interfaceC0457hArr2[0] = new C0442i(c0453d);
                    interfaceC0457hArr2[1] = new C0448o(c0453d3, c0453d3 != null && "UNIX_LTRIM".equals(c0453d3.m1233a()));
                    c0434a2 = new C0434a(interfaceC0457hArr2);
                }
                c0448o = c0434a2;
            }
        } else {
            c0448o = interfaceC0457h;
        }
        if (c0448o instanceof InterfaceC0433a) {
            ((InterfaceC0433a) c0448o).mo1178a(c0453d);
        }
        return c0448o;
    }

    @Override // org.p037a.p038a.p039a.p040a.p041a.InterfaceC0437d
    /* JADX INFO: renamed from: a */
    public final InterfaceC0457h mo1184a(C0453d c0453d) {
        return m1182a(c0453d.m1233a(), c0453d);
    }
}
