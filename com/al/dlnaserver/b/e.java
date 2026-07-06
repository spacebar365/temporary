package com.al.dlnaserver.b;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build;
import android.os.Build$VERSION;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager$LayoutParams;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import com.al.dlnaserver.R$id;
import com.al.dlnaserver.R$layout;
import com.al.dlnaserver.R$string;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Logs.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private Context a;

    @SuppressLint({"InflateParams"})
    public final void a(Context context) {
        this.a = context;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.log_result, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R$id.log_title_textview);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.log_result_textview);
        ScrollView scrollView = (ScrollView) viewInflate.findViewById(R$id.log_scrollView);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(R$id.btton_share);
        String strA = a("main");
        textView.setText(R$string.alert_log);
        textView2.setText(strA);
        new Handler().postDelayed(new f(this, scrollView), 1000L);
        imageButton.setOnClickListener(new h(this, context, strA));
        AlertDialog alertDialogCreate = new AlertDialog$Builder(context).setView(viewInflate).setCancelable(true).create();
        WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams();
        windowManager$LayoutParams.copyFrom(alertDialogCreate.getWindow().getAttributes());
        windowManager$LayoutParams.width = -1;
        windowManager$LayoutParams.height = -1;
        alertDialogCreate.show();
        alertDialogCreate.getWindow().setAttributes(windowManager$LayoutParams);
    }

    private String a(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("logcat");
            arrayList.add("-b".concat(String.valueOf(str)));
            arrayList.add("-vbrief");
            arrayList.add("-d");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder(new String[0]).command(arrayList).redirectErrorStream(true).start().getInputStream()));
            StringBuilder sb = new StringBuilder();
            a(sb);
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

    private void a(StringBuilder sb) {
        String str = null;
        long longVersionCode = 0;
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
            if (packageInfo != null) {
                str = packageInfo.versionName;
                if (Build$VERSION.SDK_INT >= 28) {
                    longVersionCode = packageInfo.getLongVersionCode();
                } else {
                    longVersionCode = packageInfo.versionCode;
                }
            }
        } catch (PackageManager$NameNotFoundException e) {
            e.printStackTrace();
        }
        sb.append("\nDevice Manufacturer: " + Build.MANUFACTURER);
        sb.append("\nDevice Model       : " + Build.MODEL);
        sb.append("\nAndroid Version    : " + Build$VERSION.RELEASE);
        sb.append("\nAndroid SDK        : " + Build$VERSION.SDK_INT);
        sb.append("\nApp VersionName    : ".concat(String.valueOf(str)));
        sb.append("\nApp VersionCode    : ".concat(String.valueOf(longVersionCode)));
        sb.append("\n");
        sb.append("\nPaths list         : ");
        Iterator<String> it = n.c(this.a, "pathsList").iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("\n");
            sb.append("                     ");
        }
        sb.append("\n*************************");
        sb.append("\n");
    }
}
