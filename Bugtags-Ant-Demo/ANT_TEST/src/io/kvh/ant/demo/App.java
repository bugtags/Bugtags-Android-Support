package io.kvh.ant.demo;

import com.bugtags.library.Bugtags;
import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //在这里初始化
        Bugtags.start("d3ad445a39bf60628f7acd4bd08eff4f", this, Bugtags.BTGInvocationEventBubble);
    }
}
