package io.kvh.idea.demo;

import android.app.Application;
import com.bugtags.library.Bugtags;

/**
 * Created by bugtags.com on 15/9/17.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Bugtags.start("d3ad445a39bf60628f7acd4bd08eff4f", this, Bugtags.BTGInvocationEventBubble);
    }
}
