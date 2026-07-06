package org.cybergarage.d.d;

/* JADX INFO: compiled from: SSDPResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class i extends org.cybergarage.a.g {
    public i() {
        a("1.1");
    }

    @Override // org.cybergarage.a.g
    public final String s() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(r());
        stringBuffer.append(d());
        stringBuffer.append("\r\n");
        return stringBuffer.toString();
    }
}
