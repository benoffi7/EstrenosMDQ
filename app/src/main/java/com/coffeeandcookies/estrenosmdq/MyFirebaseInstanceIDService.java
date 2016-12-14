package com.coffeeandcookies.estrenosmdq;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Gonzalo on 14/12/2016.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService
{
    @Override
    public void onTokenRefresh()
    {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(MyFirebaseInstanceIDService.class.getName(), "Refreshed token: " + refreshedToken);

    }
}
