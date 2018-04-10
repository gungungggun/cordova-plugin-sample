package plugin.sample;

import android.app.Activity;
import android.os.Bundle;

public class NewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String package_name = getApplication().getPackageName();
        setContentView(getApplication().getResources().getIdentifier("new_activity", "layout", package_name));
    }
}
