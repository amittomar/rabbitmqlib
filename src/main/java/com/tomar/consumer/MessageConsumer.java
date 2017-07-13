package com.tomar.consumer;

import com.tomar.packets.Employee;

/**
 * Created by tomar on 13/07/17.
 */
public interface MessageConsumer<M> {

    void recieve(M message);
}
