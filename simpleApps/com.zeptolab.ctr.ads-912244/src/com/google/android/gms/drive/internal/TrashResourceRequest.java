package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class TrashResourceRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final DriveId Do;
    final int wj;

    static {
        CREATOR = new al();
    }

    TrashResourceRequest(int i, DriveId driveId) {
        this.wj = i;
        this.Do = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        al.a(this, parcel, i);
    }
}