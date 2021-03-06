package com.diabin.latte.app;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by houwentao on 2018/4/12.
 */

public class Latte {
    /**
     * 配置Context
     * @param context
     * @return
     */
    public static Configurator init(Context context) {
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static HashMap<Object, Object> getConfigurations() {
        return Configurator.getInstance().getLatteConfigs();
    }

    public static Context getApplicationContext() {
        return (Context) getConfigurations().get(ConfigType.APPLICATION_CONTEXT.name());
    }
}
