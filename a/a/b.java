package a.a;

import a.g;
import a.h;
import a.m;
import java.net.InetAddress;
import java.util.Properties;

/* JADX INFO: compiled from: PropertyConfiguration.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements h {
    public b(Properties properties) {
        this.d = g.a(properties, "jcifs.smb.client.useBatching", true);
        this.e = g.a(properties, "jcifs.smb.client.useUnicode", true);
        this.q = g.a(properties, "jcifs.smb.client.useLargeReadWrite", true);
        this.f = g.a(properties, "jcifs.smb.client.forceUnicode", false);
        this.g = g.a(properties, "jcifs.smb.client.signingPreferred", false);
        this.h = g.a(properties, "jcifs.smb.client.signingEnforced", false);
        this.i = g.a(properties, "jcifs.smb.client.ipcSigningEnforced", true);
        this.j = g.a(properties, "jcifs.smb.client.encryptionEnabled", false);
        this.az = g.a(properties, "jcifs.smb.client.requireSecureNegotiate", true);
        this.aA = g.a(properties, "jcifs.smb.client.SendNTLMTargetName", true);
        this.r = g.a(properties, "jcifs.smb.lmCompatibility", 3);
        this.s = g.a(properties, "jcifs.smb.allowNTLMFallback", true);
        this.t = g.a(properties, "jcifs.smb.useRawNTLM", false);
        this.u = g.a(properties, "jcifs.smb.client.disableSpnegoIntegrity", false);
        this.v = g.a(properties, "jcifs.smb.client.enforceSpnegoIntegrity", false);
        this.w = g.a(properties, "jcifs.smb.client.disablePlainTextPasswords", true);
        this.x = properties.getProperty("jcifs.encoding", "Cp850");
        this.k = g.a(properties, "jcifs.smb.client.useNtStatus", true);
        this.l = g.a(properties, "jcifs.smb.client.useExtendedSecurity", true);
        this.m = g.a(properties, "jcifs.smb.client.forceExtendedSecurity", false);
        this.n = g.a(properties, "jcifs.smb.client.useSMB2Negotiation", false);
        this.o = g.a(properties, "jcifs.smb.client.port139.enabled", false);
        this.p = g.a(properties, "jcifs.smb.client.useNTSmbs", true);
        this.y = g.a(properties, "jcifs.smb.client.flags2", 0);
        this.z = g.a(properties, "jcifs.smb.client.capabilities", 0);
        this.A = g.a(properties, "jcifs.smb.client.ssnLimit", 250);
        this.at = g.a(properties, "jcifs.smb.client.maxRequestRetries", 2);
        this.B = g.a(properties, "jcifs.smb.client.tcpNoDelay", false);
        this.C = g.a(properties, "jcifs.smb.client.responseTimeout", 30000);
        this.D = g.a(properties, "jcifs.smb.client.soTimeout", 35000);
        this.E = g.a(properties, "jcifs.smb.client.connTimeout", 35000);
        this.F = g.a(properties, "jcifs.smb.client.sessionTimeout", 35000);
        this.G = g.a(properties, "jcifs.smb.client.disableIdleTimeout", false);
        this.H = g.a(properties);
        this.I = g.a(properties, "jcifs.smb.client.lport", 0);
        this.J = g.a(properties, "jcifs.smb.client.maxMpxCount", 10);
        this.K = g.a(properties, "jcifs.smb.client.snd_buf_size", 65535);
        this.L = g.a(properties, "jcifs.smb.client.rcv_buf_size", 65535);
        this.M = g.a(properties, "jcifs.smb.client.notify_buf_size", 1024);
        this.N = properties.getProperty("jcifs.smb.client.nativeOs", System.getProperty("os.name"));
        this.O = properties.getProperty("jcifs.smb.client.nativeLanMan", "jCIFS");
        this.P = 1;
        this.Q = g.a(properties, "jcifs.smb.client.dfs.disabled", false);
        this.R = g.a(properties, "jcifs.smb.client.dfs.ttl", 300L);
        this.S = g.a(properties, "jcifs.smb.client.dfs.strictView", false);
        this.T = g.a(properties, "jcifs.smb.client.dfs.convertToFQDN", false);
        this.U = properties.getProperty("jcifs.smb.client.logonShare", null);
        this.V = properties.getProperty("jcifs.smb.client.domain", null);
        this.W = properties.getProperty("jcifs.smb.client.username", null);
        this.X = properties.getProperty("jcifs.smb.client.password", null);
        this.Y = properties.getProperty("jcifs.netbios.hostname", null);
        this.Z = g.a(properties, "jcifs.netbios.cachePolicy", 600) * 60;
        this.aa = g.a(properties, "jcifs.netbios.soTimeout", 5000);
        this.ab = g.a(properties, "jcifs.netbios.snd_buf_size", 576);
        this.ac = g.a(properties, "jcifs.netbios.rcv_buf_size", 576);
        this.ad = g.a(properties, "jcifs.netbios.retryCount", 2);
        this.ae = g.a(properties, "jcifs.netbios.retryTimeout", 3000);
        this.af = properties.getProperty("jcifs.netbios.scope");
        this.ag = g.a(properties, "jcifs.netbios.lport", 0);
        this.ah = g.a(properties, "jcifs.netbios.laddr", (InetAddress) null);
        this.ai = properties.getProperty("jcifs.netbios.lmhosts");
        this.aj = g.a(properties, "jcifs.netbios.wins", ",", new InetAddress[0]);
        this.an = g.a(properties, "jcifs.smb.client.transaction_buf_size", 65535) - 512;
        this.ao = g.a(properties, "jcifs.smb.maxBuffers", 16);
        this.ap = g.a(properties, "jcifs.smb.client.listSize", 65535);
        this.aq = g.a(properties, "jcifs.smb.client.listCount", 200);
        this.ar = g.a(properties, "jcifs.smb.client.attrExpirationPeriod", 5000L);
        this.as = g.a(properties, "jcifs.smb.client.ignoreCopyToException", false);
        this.ak = g.a(properties, "jcifs.netbios.baddr", (InetAddress) null);
        this.au = g.a(properties, "jcifs.traceResources", false);
        this.av = g.a(properties, "jcifs.smb.client.strictResourceLifecycle", false);
        String property = properties.getProperty("jcifs.smb.client.minVersion");
        String property2 = properties.getProperty("jcifs.smb.client.maxVersion");
        if (property != null || property2 != null) {
            a(property, property2);
        } else {
            a(g.a(properties, "jcifs.smb.client.disableSMB1", false) ? m.b : null, g.a(properties, "jcifs.smb.client.enableSMB2", true) ? null : m.a);
        }
        c(properties.getProperty("jcifs.resolveOrder"));
        d(properties.getProperty("jcifs.smb.client.disallowCompound"));
        ar();
    }
}
