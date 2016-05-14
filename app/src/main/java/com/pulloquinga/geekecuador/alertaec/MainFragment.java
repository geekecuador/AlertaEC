package com.pulloquinga.geekecuador.alertaec;

/**
 * Created by HenryF on 14/05/2016.
 */
import com.facebook.FacebookSdk;
public class MainFragment extends Fragment {
    public MainFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        // Initialize the SDK before executing any other operations,
        // especially, if you're using Facebook UI elements.
    }
}
