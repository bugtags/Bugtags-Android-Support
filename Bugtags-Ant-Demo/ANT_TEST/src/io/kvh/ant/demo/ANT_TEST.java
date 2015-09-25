package io.kvh.ant.demo;

import android.app.Activity;
import android.os.Bundle;
import android.app.Activity;
    import android.os.Bundle;
    import android.view.MotionEvent;
    import com.bugtags.library.Bugtags;

public class ANT_TEST extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
        protected void onResume() {
            super.onResume();
            //注：回调 1
            Bugtags.onResume(this);
        }

        @Override
        protected void onPause() {
            super.onPause();
            //注：回调 2
            Bugtags.onPause(this);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent event) {
            //注：回调 3
            Bugtags.onDispatchTouchEvent(this, event);
            return super.dispatchTouchEvent(event);
        }
}
