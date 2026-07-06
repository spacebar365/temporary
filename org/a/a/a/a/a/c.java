package org.a.a.a.a.a;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: DefaultFTPFileEntryParserFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {
    private static final Pattern a = Pattern.compile("(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*");

    @Override // org.a.a.a.a.a.d
    public final org.a.a.a.a.h a(String str) {
        if (str == null) {
            throw new m("Parser key cannot be null");
        }
        return a(str, null);
    }

    private static org.a.a.a.a.h a(String str, org.a.a.a.a.d dVar) {
        org.a.a.a.a.h hVar;
        org.a.a.a.a.h oVar;
        org.a.a.a.a.h aVar;
        org.a.a.a.a.h aVar2;
        boolean z = false;
        if (a.matcher(str).matches()) {
            try {
                Class<?> cls = Class.forName(str);
                try {
                    hVar = (org.a.a.a.a.h) cls.newInstance();
                } catch (ClassCastException e) {
                    throw new m(cls.getName() + " does not implement the interface org.apache.commons.net.ftp.FTPFileEntryParser.", e);
                } catch (Exception e2) {
                    throw new m("Error initializing parser", e2);
                } catch (ExceptionInInitializerError e3) {
                    throw new m("Error initializing parser", e3);
                }
            } catch (ClassNotFoundException e4) {
                hVar = null;
            }
        } else {
            hVar = null;
        }
        if (hVar == null) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            if (upperCase.indexOf("UNIX_LTRIM") >= 0) {
                oVar = new o(dVar, true);
            } else if (upperCase.indexOf("UNIX") >= 0) {
                oVar = new o(dVar, false);
            } else if (upperCase.indexOf("VMS") >= 0) {
                oVar = new q(dVar);
            } else if (upperCase.indexOf("WINDOWS") < 0) {
                if (upperCase.indexOf("OS/2") >= 0) {
                    oVar = new k(dVar);
                } else if (upperCase.indexOf("OS/400") < 0 && upperCase.indexOf("AS/400") < 0) {
                    if (upperCase.indexOf("MVS") >= 0) {
                        oVar = new g();
                    } else if (upperCase.indexOf("NETWARE") >= 0) {
                        oVar = new j(dVar);
                    } else if (upperCase.indexOf("MACOS PETER") >= 0) {
                        oVar = new h(dVar);
                    } else if (upperCase.indexOf("TYPE: L8") >= 0) {
                        oVar = new o(dVar);
                    } else {
                        throw new m("Unknown parser type: ".concat(String.valueOf(str)));
                    }
                } else {
                    if (dVar != null && "OS/400".equals(dVar.a())) {
                        aVar = new l(dVar);
                    } else {
                        org.a.a.a.a.d dVar2 = dVar != null ? new org.a.a.a.a.d(dVar) : null;
                        org.a.a.a.a.h[] hVarArr = new org.a.a.a.a.h[2];
                        hVarArr[0] = new l(dVar);
                        if (dVar2 != null && "UNIX_LTRIM".equals(dVar2.a())) {
                            z = true;
                        }
                        hVarArr[1] = new o(dVar2, z);
                        aVar = new a(hVarArr);
                    }
                    oVar = aVar;
                }
            } else {
                if (dVar != null && "WINDOWS".equals(dVar.a())) {
                    aVar2 = new i(dVar);
                } else {
                    org.a.a.a.a.d dVar3 = dVar != null ? new org.a.a.a.a.d(dVar) : null;
                    org.a.a.a.a.h[] hVarArr2 = new org.a.a.a.a.h[2];
                    hVarArr2[0] = new i(dVar);
                    hVarArr2[1] = new o(dVar3, dVar3 != null && "UNIX_LTRIM".equals(dVar3.a()));
                    aVar2 = new a(hVarArr2);
                }
                oVar = aVar2;
            }
        } else {
            oVar = hVar;
        }
        if (oVar instanceof org.a.a.a.a.a) {
            ((org.a.a.a.a.a) oVar).a(dVar);
        }
        return oVar;
    }

    @Override // org.a.a.a.a.a.d
    public final org.a.a.a.a.h a(org.a.a.a.a.d dVar) {
        return a(dVar.a(), dVar);
    }
}
