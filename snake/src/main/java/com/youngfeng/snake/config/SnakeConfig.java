package com.youngfeng.snake.config;

import android.graphics.Color;
import android.support.annotation.ColorInt;

import java.security.PublicKey;

/**
 * Snake basic parameter configuration
 *
 * @author Scott Smith 2017-12-19 08:07
 */
public class SnakeConfig {
    /**
     * The root activity can be draging to close if you set this variable to true.
     */
    public boolean enableForRootActivity = false;

    /**
     * Only close the current page by fast swiping if you set this variable to true.
     */
    public boolean onlyListenToFastSwipe = false;

    /**
     * The minimum listening speed of rapid sliding.
     */
    public int minVelocity = 2000;

    /**
     * The will not draw the edge of page if you set this variable to true.
     */
    public boolean hideShadowOfEdge = false;

    /**
     * The start color of the edge shadows, direction: left -> right .
     */
    public @ColorInt int shadowStartColor = Color.parseColor("#00000000");

    /**
     * The end color of the edge shadows, direction: left -> right .
     */
    public @ColorInt int shadowEndColor = Color.parseColor("#50000000");

    public static final String TAG_ENABLE_FOR_ROOT_ACTIVITY = "enable_for_root_activity";
    public static final String TAG_ONLY_LISTEN_TO_FAST_SWIPE = "only_listen_to_fast_swipe";
    public static final String TAG_MIN_VELOCITY = "min_velocity";
    public static final String TAG_HIDE_SHADOW_OF_EDGE = "hide_shadow_of_edge";
    public static final String TAG_SHADOW_START_COLOR = "shadow_start_color";
    public static final String TAG_SHADOW_END_COLOR = "shadow_end_color";
}
