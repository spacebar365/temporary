package com.p033al.dlnaserver.p035b;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import com.p033al.dlnaserver.C0303R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.al.dlnaserver.b.e */
/* JADX INFO: compiled from: Logs.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0351e {

    /* JADX INFO: renamed from: a */
    private Context f1413a;

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: a */
    public final void m1033a(Context context) {
        this.f1413a = context;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0303R.layout.log_result, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(C0303R.id.log_title_textview);
        TextView textView2 = (TextView) viewInflate.findViewById(C0303R.id.log_result_textview);
        ScrollView scrollView = (ScrollView) viewInflate.findViewById(C0303R.id.log_scrollView);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(C0303R.id.btton_share);
        String strM1031a = m1031a("main");
        textView.setText(C0303R.string.alert_log);
        textView2.setText(strM1031a);
        new Handler().postDelayed(new RunnableC0352f(this, scrollView), 1000L);
        imageButton.setOnClickListener(new ViewOnClickListenerC0354h(this, context, strM1031a));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setView(viewInflate).setCancelable(true).create();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(alertDialogCreate.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        alertDialogCreate.show();
        alertDialogCreate.getWindow().setAttributes(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    private String m1031a(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("logcat");
            arrayList.add("-b".concat(String.valueOf(str)));
            arrayList.add("-vbrief");
            arrayList.add("-d");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder(new String[0]).command(arrayList).redirectErrorStream(true).start().getInputStream()));
            StringBuilder sb = new StringBuilder();
            m1032a(sb);
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(String.valueOf(line) + '\n');
                } else {
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1032a(StringBuilder sb) {
        String str = null;
        long longVersionCode = 0;
        try {
            PackageInfo packageInfo = this.f1413a.getPackageManager().getPackageInfo(this.f1413a.getPackageName(), 0);
            if (packageInfo != null) {
                str = packageInfo.versionName;
                if (Build.VERSION.SDK_INT >= 28) {
                    longVersionCode = packageInfo.getLongVersionCode();
                } else {
                    longVersionCode = packageInfo.versionCode;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        sb.append("\nDevice Manufacturer: " + Build.MANUFACTURER);
        sb.append("\nDevice Model       : " + Build.MODEL);
        sb.append("\nAndroid Version    : " + Build.VERSION.RELEASE);
        sb.append("\nAndroid SDK        : " + Build.VERSION.SDK_INT);
        sb.append("\nApp VersionName    : ".concat(String.valueOf(str)));
        sb.append("\nApp VersionCode    : ".concat(String.valueOf(longVersionCode)));
        sb.append("\n");
        sb.append("\nPaths list         : ");
        Iterator<String> it = C0360n.m1052c(this.f1413a, "pathsList").iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("\n");
            sb.append("                     ");
        }
        sb.append("\n*************************");
        sb.append("\n");
    }
}
