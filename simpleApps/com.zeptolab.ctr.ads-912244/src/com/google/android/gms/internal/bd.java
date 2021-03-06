package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bd {
    public static List a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        List arrayList = new ArrayList(optJSONArray.length());
        int i = 0;
        while (i < optJSONArray.length()) {
            arrayList.add(optJSONArray.getString(i));
            i++;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void a(Context context, String str, cn cnVar, String str2, boolean z, List list) {
        String str3 = z ? "1" : "0";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String replaceAll = ((String) it.next()).replaceAll("@gw_adlocid@", str2).replaceAll("@gw_adnetrefresh@", str3).replaceAll("@gw_qdata@", cnVar.pf.mw).replaceAll("@gw_sdkver@", str).replaceAll("@gw_sessid@", cp.pu).replaceAll("@gw_seqnum@", cnVar.of);
            if (cnVar.mM != null) {
                replaceAll = replaceAll.replaceAll("@gw_adnetid@", cnVar.mM.mm).replaceAll("@gw_allocid@", cnVar.mM.mo);
            }
            new cy(context, str, replaceAll).start();
        }
    }
}