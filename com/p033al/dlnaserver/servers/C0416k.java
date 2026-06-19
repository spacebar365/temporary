package com.p033al.dlnaserver.servers;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.k */
/* JADX INFO: compiled from: HttpFileServer.java */
/* JADX INFO: loaded from: classes.dex */
final class C0416k extends FileInputStream {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0415j f1537a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ long f1538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0416k(C0415j c0415j, File file, long j) {
        super(file);
        this.f1537a = c0415j;
        this.f1538b = j;
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int available() {
        return (int) this.f1538b;
    }
}
