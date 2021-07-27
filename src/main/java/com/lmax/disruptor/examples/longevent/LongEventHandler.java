package com.lmax.disruptor.examples.longevent;

import com.lmax.disruptor.EventHandler;

/** @author xiechongkai */
// tag::example[]
public class LongEventHandler implements EventHandler<LongEvent> {
  @Override
  public void onEvent(LongEvent event, long sequence, boolean endOfBatch) {
    System.out.println("Event: " + event);
  }
}
// end::example[]
