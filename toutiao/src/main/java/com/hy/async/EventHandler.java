package com.hy.async;

import java.util.List;

/**
 * Created by xiaohuang on 2016/7/16.
 */
public interface EventHandler {
    void doHandle(com.hy.async.EventModel model);
    List<com.hy.async.EventType> getSupportEventTypes();
}
