package com.nowcoder.async;

import java.util.List;

/**
 * Created by chendong on 2016/7/19.
 */
public interface EventHandler {
    void doHandle(EventModel model);
    List<EventType> getSupportEventTypes();
}
