package a.f.a;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: AvTargetName.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c {
    private static final Charset a = StandardCharsets.UTF_16LE;

    public f(byte[] bArr) {
        super(9, bArr);
    }

    public f(String str) {
        this(str.getBytes(a));
    }
}
