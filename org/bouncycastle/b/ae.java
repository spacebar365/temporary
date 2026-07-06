package org.bouncycastle.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class ae implements g {
    public static final ae a = new af("ASCII");
    public static final ae b = new ag("UTF8");
    public static final ae c = new ah("PKCS12");
    private static final /* synthetic */ ae[] d = {a, b, c};

    private ae(String str, int i) {
    }

    /* synthetic */ ae(String str, int i, byte b2) {
        this(str, i);
    }

    public static ae valueOf(String str) {
        return (ae) Enum.valueOf(ae.class, str);
    }

    public static ae[] values() {
        return (ae[]) d.clone();
    }
}
