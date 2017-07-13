package com.tomar.consumer;

/**
 * Created by tomar on 13/07/17.
 */
public interface MessageProcessor<M> {
    void process(M message);
}
