package com.imojiapp.imoji.sdksample;

import android.app.Application;

import com.imojiapp.imoji.sdk.ImojiApi;
import com.imojiapp.imoji.sdk.ImojiApi.Builder;

/**
 * Created by sajjadtabib on 4/17/15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ImojiApi.init(this, "748cddd4-460d-420a-bd42-fcba7f6c031b", "U2FsdGVkX1/yhkvIVfvMcPCALxJ1VHzTt8FPZdp1vj7GIb+fsdzOjyafu9MZRveo7ebjx1+SKdLUvz8aM6woAw==");
    }
}
