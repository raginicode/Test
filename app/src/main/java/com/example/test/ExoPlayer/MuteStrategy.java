package com.example.test.ExoPlayer;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


public class MuteStrategy {

    @IntDef({MuteStrategy.ALL, MuteStrategy.INDIVIDUAL})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Values {
    }

    public static final int ALL = 1;
    public static final int INDIVIDUAL = 2;
}