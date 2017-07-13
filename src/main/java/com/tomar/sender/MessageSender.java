package com.tomar.sender;

/**
 * Created by tomar on 12/07/17.
 */
public interface MessageSender<M> {

    void send(M m);
}
