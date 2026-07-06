package com.al.dlnaserver.b;

import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: FileUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final String[] a = {"264", "3g2", "3gp", "3gp2", "3gpp", "3gpp2", "3mm", "3p2", "60d", "aep", "ajp", "amv", "amx", "arf", "asf", "asx", "avb", "avd", "avi", "avs", "avs", "axm", "bdm", "bdmv", "bik", "bix", "bmk", "box", "bs4", "bsf", "byu", "camre", "clpi", "cpi", "cvc", "d2v", "d3v", "dav", "dce", "dck", "ddat", "dif", "dir", "divx", "dlx", "dmb", "dmsm", "dmss", "dnc", "dpg", "dream", "dsy", "dv", "dv-avi", "dv4", "dvdmedia", "dvr-ms", "dvx", "dxr", "dzm", "dzp", "dzt", "evo", "eye", "f4p", "f4v", "fbr", "fbr", "fbz", "fcp", "flc", "flh", "fli", "flv", "flx", "gl", "grasp", "gts", "gvi", "gvp", "hdmov", "hkm", "ifo", "imovi", "imovi", "iva", "ivf", "ivr", "ivs", "izz", "izzy", "jts", "lsf", "lsx", "m15", "m1pg", "m1v", "m21", "m21", "m2a", "m2p", "m2t", "m2ts", "m2v", "m4e", "m4u", "m4v", "m75", "meta", "mgv", "mj2", "mjp", "mjpg", "mkv", "mmv", "mnv", "mod", "modd", "moff", "moi", "moov", "mov", "movie", "mp21", "mp21", "mp2v", "mp4", "mp4v", "mpe", "mpeg", "mpeg4", "mpf", "mpg", "mpg2", "mpgin", "mpl", "mpls", "mpv", "mpv2", "mqv", "msdvd", "msh", "mswmm", "mts", "mtv", "mvb", "mvc", "mvd", "mve", "mvp", "mxf", "mys", "ncor", "nsv", "nvc", "ogm", "ogv", "ogx", "osp", "par", "pds", "pgi", "piv", "playlist", "pmf", "prel", "pro", "prproj", "psh", "pva", "pvr", "pxv", "qt", "qtch", "qtl", "qtm", "qtz", "rcproject", "rdb", "rec", "rm", "rmd", "rmp", "rmvb", "roq", "rp", "rts", "rts", "rum", "rv", "sbk", "sbt", "scm", "scm", "scn", "sec", "seq", "sfvidcap", "smil", "smk", "sml", "smv", "spl", "ssm", "str", "stx", "svi", "swf", "swi", "swt", "tda3mt", "tivo", "tix", "tod", "tp", "tp0", "tpd", "tpr", "trp", "ts", "tvs", "vc1", "vcr", "vcv", "vdo", "vdr", "veg", "vem", "vf", "vfw", "vfz", "vgz", "vid", "viewlet", "viv", "vivo", "vlab", "vob", "vp3", "vp6", "vp7", "vpj", "vro", "vsp", "w32", "wcp", "webm", "wm", "wmd", "wmmp", "wmv", "wmx", "wp3", "wpl", "wtv", "wvx", "xfl", "xvid", "yuv", "zm1", "zm2", "zm3", "zmv"};
    private static final String[] b = {"4mp", "669", "6cm", "8cm", "8med", "8svx", "a2m", "aa", "aa3", "aac", "aax", "abc", "abm", "ac3", "acd", "acd-bak", "acd-zip", "acm", "act", "adg", "afc", "agm", "ahx", "aif", "aifc", "aiff", "ais", "akp", "al", "alaw", "all", "amf", "amr", "ams", "ams", "aob", "ape", "apf", "apl", "ase", "at3", "atrac", "au", "aud", "aup", "avr", "awb", "band", "bap", "bdd", "box", "bun", "bwf", "c01", "caf", "cda", "cdda", "cdr", "cel", "cfa", "cidb", "cmf", "copy", "cpr", "cpt", "csh", "cwp", "d00", "d01", "dcf", "dcm", "dct", "ddt", "dewf", "df2", "dfc", "dff", "dig", "dig", "dls", "dm", "dmf", "dmsa", "dmse", "drg", "dsd", "dsf", "dsm", "dsp", "dss", "dtm", "dts", "dtshd", "dvf", "dwd", "ear", "efa", "efe", "efk", "efq", "efs", "efv", "emd", "emp", "emx", "esps", "f2r", "f32", "f3r", "f4a", "f64", "far", "fff", "flac", "flp", "fls", "frg", "fsm", "fzb", "fzf", "fzv", "g721", "g723", "g726", "gig", "gp5", "gpk", "gsm", "gsm", "h0", "hdp", "hma", "hsb", "ics", "iff", "imf", "imp", "ins", "ins", "it", "iti", "its", "jam", "k25", "k26", "kar", "kin", "kit", "kmp", "koz", "koz", "kpl", "krz", "ksc", "ksf", "kt2", "kt3", "ktp", "l", "la", "lqt", "lso", "lvp", "lwv", "m1a", "m4a", "m4b", "m4p", "m4r", "ma1", "mdl", "med", "mgv", "midi", "miniusf", "mka", "mlp", "mmf", "mmm", "mmp", "mo3", "mod", "mp1", "mp2", "mp3", "mpa", "mpc", "mpga", "mpu", "mp_", "mscx", "mscz", "msv", "mt2", "mt9", "mte", "mti", "mtm", "mtp", "mts", "mus", "mws", "mxl", "mzp", "nap", "nki", "nra", "nrt", "nsa", "nsf", "nst", "ntn", "nvf", "nwc", "odm", "oga", "ogg", "okt", "oma", "omf", "omg", "omx", "ots", "ove", "ovw", "pac", "pat", "pbf", "pca", "pcast", "pcg", "pcm", "peak", "phy", "pk", "pla", "pna", "ppc", "ppcx", "prg", "prg", "psf", "psm", "ptf", "ptm", "pts", "pvc", "qcp", "r", "r1m", "ra", "ram", "raw", "rax", "rbs", "rcy", "rex", "rfl", "rmf", "rmi", "rmj", "rmm", "rmx", "rng", "rns", "rol", "rsn", "rso", "rti", "rtm", "rts", "rvx", "rx2", "s3i", "s3m", "s3z", "saf", "sam", "sb", "sbg", "sbi", "sbk", "sc2", "sd", "sd", "sd2", "sd2f", "sdat", "sdii", "sds", "sdt", "sdx", "seg", "seq", "ses", "sf2", "sfk", "sfl", "shn", "sib", "sid", "sid", "smf", "smp", "snd", "snd", "snd", "sng", "sng", "sou", "sppack", "sprg", "sseq", "sseq", "ssnd", "stm", "stx", "sty", "svx", "sw", "swa", "syh", "syw", "syx", "td0", "tfmx", "thx", "toc", "tsp", "txw", "u", "ub", "ulaw", "ult", "ulw", "uni", "usf", "usflib", "uw", "uwf", "vag", "val", "vc3", "vmd", "vmf", "vmf", "voc", "voi", "vox", "vpm", "vqf", "vrf", "vyf", "w01", "wav", "wav", "wave", "wax", "wfb", "wfd", "wfp", "wma", "wow", "wpk", "wproj", "wrk", "wus", "wut", "wv", "wvc", "wve", "wwu", "xa", "xa", "xfs", "xi", "xm", "xmf", "xmi", "xmz", "xp", "xrns", "xsb", "xspf", "xt", "xwb", "ym", "zvd", "zvr"};
    private static final String[] c = {"jpg", "bmp", "png", "gif", "jpeg"};
    private static final String[] d = {"m3u", "m3u8", "pls"};
    private static final String[] e = {"txt", "smi", "log", "srt", "ssa", "ass", "sub", "sup", "idx", "mpl", "vtt", "psb", "sami", "pjs"};
    private static final HashSet<String> f = new HashSet<>(Arrays.asList(a));
    private static final HashSet<String> g = new HashSet<>(Arrays.asList(b));
    private static final HashSet<String> h = new HashSet<>(Arrays.asList(c));
    private static final HashSet<String> i = new HashSet<>(Arrays.asList(d));
    private static final HashSet<String> j = new HashSet<>(Arrays.asList(e));

    public static String a(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) <= 0 || iLastIndexOf >= str.length() + (-1)) ? "" : str.substring(iLastIndexOf + 1).toLowerCase(Locale.US);
    }

    public static String a(File file) {
        if (file != null) {
            return b(file.getName());
        }
        return null;
    }

    public static String b(String str) {
        int iLastIndexOf;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) <= 0 || iLastIndexOf >= str.length() - 1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1).toLowerCase(Locale.US);
    }

    public static String c(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        int iLastIndexOf2 = str.lastIndexOf(46);
        if (iLastIndexOf2 == -1) {
            return str.substring(iLastIndexOf + 1);
        }
        return str.substring(iLastIndexOf + 1, iLastIndexOf2);
    }

    public static boolean b(File file) {
        String strA = a(file);
        return f.contains(strA) || g.contains(strA) || h.contains(strA);
    }

    public static boolean d(String str) {
        String strB = b(str);
        return f.contains(strB) || g.contains(strB) || h.contains(strB);
    }

    public static boolean e(String str) {
        return f.contains(a(str));
    }

    public static boolean f(String str) {
        return g.contains(a(str));
    }

    public static boolean g(String str) {
        return h.contains(a(str));
    }

    public static boolean c(File file) {
        return i.contains(a(file));
    }

    public static boolean h(String str) {
        return j.contains(a(str));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String a(String str, String str2) {
        String strA = a(str);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.isEmpty() || str2.toLowerCase(Locale.US).contains("sec_hhp_") || str2.toLowerCase(Locale.US).contains("sams")) {
            String lowerCase = strA.toLowerCase(Locale.US);
            switch (lowerCase.hashCode()) {
                case 3587:
                    if (lowerCase.equals("ps")) {
                        return "video/mpeg";
                    }
                    break;
                case 3711:
                    if (lowerCase.equals("ts")) {
                        return "video/mpeg";
                    }
                    break;
                case 96980:
                    if (lowerCase.equals("avi")) {
                        return "video/x-msvideo";
                    }
                    break;
                case 106415:
                    if (lowerCase.equals("m2t")) {
                        return "video/mpeg";
                    }
                    break;
                case 108460:
                    if (lowerCase.equals("mts")) {
                        return "video/mpeg";
                    }
                    break;
                case 3145576:
                    if (lowerCase.equals("flac")) {
                        return "audio/flac";
                    }
                    break;
                case 3298856:
                    if (lowerCase.equals("m2ps")) {
                        return "video/mpeg";
                    }
                    break;
                case 3298980:
                    if (lowerCase.equals("m2ts")) {
                        return "video/mpeg";
                    }
                    break;
            }
            k.a();
            return k.a(strA);
        }
        if (str2.toLowerCase(Locale.US).contains("kdl") || str2.toLowerCase(Locale.US).contains("sony")) {
            String lowerCase2 = strA.toLowerCase(Locale.US);
            switch (lowerCase2.hashCode()) {
                case 3711:
                    if (lowerCase2.equals("ts")) {
                        return "video/vnd.dlna.mpeg-tts";
                    }
                    break;
                case 96980:
                    if (lowerCase2.equals("avi")) {
                        return "video/divx";
                    }
                    break;
                case 106415:
                    if (lowerCase2.equals("m2t")) {
                        return "video/vnd.dlna.mpeg-tts";
                    }
                    break;
                case 108460:
                    if (lowerCase2.equals("mts")) {
                        return "video/vnd.dlna.mpeg-tts";
                    }
                    break;
                case 3298980:
                    if (lowerCase2.equals("m2ts")) {
                        return "video/vnd.dlna.mpeg-tts";
                    }
                    break;
            }
            k.a();
            return k.a(strA);
        }
        if (str2.toLowerCase(Locale.US).contains("fetchtv")) {
            String lowerCase3 = strA.toLowerCase(Locale.US);
            switch (lowerCase3.hashCode()) {
                case 3711:
                    if (lowerCase3.equals("ts")) {
                        return "video/vnd.dlna.mpeg-tts";
                    }
                    break;
                case 106415:
                    if (lowerCase3.equals("m2t")) {
                        return "video/vnd.dlna.mpeg-tts";
                    }
                    break;
                case 106458:
                    if (lowerCase3.equals("m4a")) {
                        return "audio/mp4";
                    }
                    break;
                case 108460:
                    if (lowerCase3.equals("mts")) {
                        return "video/vnd.dlna.mpeg-tts";
                    }
                    break;
                case 116937:
                    if (lowerCase3.equals("vob")) {
                        return "video/x-ms-vob";
                    }
                    break;
                case 3298980:
                    if (lowerCase3.equals("m2ts")) {
                        return "video/vnd.dlna.mpeg-tts";
                    }
                    break;
            }
            k.a();
            return k.a(strA);
        }
        if (str2.toLowerCase(Locale.US).contains("playstation 3")) {
            String lowerCase4 = strA.toLowerCase(Locale.US);
            switch (lowerCase4.hashCode()) {
                case 96980:
                    if (lowerCase4.equals("avi")) {
                        return "video/x-divx";
                    }
                    break;
                case 108308:
                    if (lowerCase4.equals("mov")) {
                        return "video/mp4";
                    }
                    break;
                case 117484:
                    if (lowerCase4.equals("wav")) {
                        return "audio/wav";
                    }
                    break;
            }
            k.a();
            return k.a(strA);
        }
        if (str2.toLowerCase(Locale.US).contains("ir320")) {
            String lowerCase5 = strA.toLowerCase(Locale.US);
            switch (lowerCase5.hashCode()) {
                case 106458:
                    if (lowerCase5.equals("m4a")) {
                        return "audio/x-m4a";
                    }
                    break;
                case 117484:
                    if (lowerCase5.equals("wav")) {
                        return "audio/wav";
                    }
                    break;
            }
            k.a();
            return k.a(strA);
        }
        if (str2.toLowerCase(Locale.US).contains("LTDN")) {
            String lowerCase6 = strA.toLowerCase(Locale.US);
            switch (lowerCase6.hashCode()) {
                case 3643:
                    if (lowerCase6.equals("rm")) {
                        return "application/vnd.rn-realmedia-vbr";
                    }
                    break;
                case 3711:
                    if (lowerCase6.equals("ts")) {
                        return "video/vnd.dlna.mpeg-tts";
                    }
                    break;
                case 106415:
                    if (lowerCase6.equals("m2t")) {
                        return "video/vnd.dlna.mpeg-tts";
                    }
                    break;
                case 108460:
                    if (lowerCase6.equals("mts")) {
                        return "video/vnd.dlna.mpeg-tts";
                    }
                    break;
                case 117484:
                    if (lowerCase6.equals("wav")) {
                        return "audio/wav";
                    }
                    break;
                case 3298980:
                    if (lowerCase6.equals("m2ts")) {
                        return "video/vnd.dlna.mpeg-tts";
                    }
                    break;
            }
            k.a();
            return k.a(strA);
        }
        if (str2.toLowerCase(Locale.US).contains("roku")) {
            String lowerCase7 = strA.toLowerCase(Locale.US);
            switch (lowerCase7.hashCode()) {
                case 117484:
                    if (lowerCase7.equals("wav")) {
                        return "audio/wav";
                    }
                    break;
            }
            k.a();
            return k.a(strA);
        }
        if (!str2.contains("LG") && !str2.toLowerCase(Locale.US).contains("xboxone") && !str2.toLowerCase(Locale.US).contains("xbox-systemos") && !str2.toLowerCase(Locale.US).contains("nsplayer/12") && !str2.toLowerCase(Locale.US).contains("panas") && !str2.toLowerCase(Locale.US).contains("philips") && !str2.toLowerCase(Locale.US).contains("allegro")) {
            k.a();
            return k.a(strA);
        }
        String lowerCase8 = strA.toLowerCase(Locale.US);
        switch (lowerCase8.hashCode()) {
            case 3587:
                if (lowerCase8.equals("ps")) {
                    return "video/mpeg";
                }
                break;
            case 3711:
                if (lowerCase8.equals("ts")) {
                    return "video/mpeg";
                }
                break;
            case 106415:
                if (lowerCase8.equals("m2t")) {
                    return "video/mpeg";
                }
                break;
            case 108460:
                if (lowerCase8.equals("mts")) {
                    return "video/mpeg";
                }
                break;
            case 117484:
                if (lowerCase8.equals("wav")) {
                    return "audio/wav";
                }
                break;
            case 3298856:
                if (lowerCase8.equals("m2ps")) {
                    return "video/mpeg";
                }
                break;
            case 3298980:
                if (lowerCase8.equals("m2ts")) {
                    return "video/mpeg";
                }
                break;
        }
        k.a();
        return k.a(strA);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String i(String str) {
        if ("".isEmpty() || "".toLowerCase(Locale.US).contains("sec_hhp_") || "".toLowerCase(Locale.US).contains("sams")) {
            String lowerCase = str.toLowerCase(Locale.US);
            switch (lowerCase.hashCode()) {
                case 5703326:
                    if (lowerCase.equals("video/mp2ps")) {
                    }
                    break;
                case 5703450:
                    if (lowerCase.equals("video/mp2ts")) {
                    }
                    break;
                case 1154411836:
                    if (lowerCase.equals("application/x-flac")) {
                    }
                    break;
                case 1331836736:
                    if (lowerCase.equals("video/avi")) {
                    }
                    break;
            }
            return str;
        }
        if ("".toLowerCase(Locale.US).contains("kdl") || "".toLowerCase(Locale.US).contains("sony")) {
            String lowerCase2 = str.toLowerCase(Locale.US);
            switch (lowerCase2.hashCode()) {
                case 5703450:
                    if (lowerCase2.equals("video/mp2ts")) {
                    }
                    break;
                case 1331836736:
                    if (lowerCase2.equals("video/avi")) {
                    }
                    break;
            }
            return str;
        }
        if ("".toLowerCase(Locale.US).contains("fetchtv")) {
            String lowerCase3 = str.toLowerCase(Locale.US);
            switch (lowerCase3.hashCode()) {
                case 5703450:
                    if (lowerCase3.equals("video/mp2ts")) {
                    }
                    break;
            }
            return str;
        }
        if ("".toLowerCase(Locale.US).contains("fetchtv")) {
            String lowerCase4 = str.toLowerCase(Locale.US);
            switch (lowerCase4.hashCode()) {
                case -794081673:
                    if (lowerCase4.equals("audio/x-pn-realaudio")) {
                    }
                    break;
                case -586683234:
                    if (lowerCase4.equals("audio/x-wav")) {
                    }
                    break;
                case 5703450:
                    if (lowerCase4.equals("video/mp2ts")) {
                    }
                    break;
            }
            return str;
        }
        if ("".toLowerCase(Locale.US).contains("ir320")) {
            String lowerCase5 = str.toLowerCase(Locale.US);
            switch (lowerCase5.hashCode()) {
                case -586683234:
                    if (!lowerCase5.equals("audio/x-wav")) {
                        return str;
                    }
                    break;
                default:
                    return str;
            }
        } else {
            if ("".toLowerCase(Locale.US).contains("playstation 3")) {
                String lowerCase6 = str.toLowerCase(Locale.US);
                switch (lowerCase6.hashCode()) {
                    case -586683234:
                        if (lowerCase6.equals("audio/x-wav")) {
                        }
                        break;
                    case -107252314:
                        if (lowerCase6.equals("video/quicktime")) {
                        }
                        break;
                    case 1331836736:
                        if (lowerCase6.equals("video/avi")) {
                        }
                        break;
                }
                return str;
            }
            if ("".toLowerCase(Locale.US).contains("roku")) {
                String lowerCase7 = str.toLowerCase(Locale.US);
                switch (lowerCase7.hashCode()) {
                    case -586683234:
                        if (!lowerCase7.equals("audio/x-wav")) {
                            return str;
                        }
                        break;
                    default:
                        return str;
                }
            } else {
                if (!"".contains("LG") && !"".toLowerCase(Locale.US).contains("xboxone") && !"".toLowerCase(Locale.US).contains("xbox-systemos") && !"".toLowerCase(Locale.US).contains("nsplayer/12") && !"".toLowerCase(Locale.US).contains("panas") && !"".toLowerCase(Locale.US).contains("philips") && !"".toLowerCase(Locale.US).contains("allegro")) {
                    return str;
                }
                String lowerCase8 = str.toLowerCase(Locale.US);
                switch (lowerCase8.hashCode()) {
                    case -586683234:
                        if (!lowerCase8.equals("audio/x-wav")) {
                            return str;
                        }
                        break;
                    case 5703326:
                        return lowerCase8.equals("video/mp2ps") ? "video/mpeg" : str;
                    case 5703450:
                        return lowerCase8.equals("video/mp2ts") ? "video/mpeg" : str;
                    default:
                        return str;
                }
            }
        }
        return "audio/wav";
    }
}
