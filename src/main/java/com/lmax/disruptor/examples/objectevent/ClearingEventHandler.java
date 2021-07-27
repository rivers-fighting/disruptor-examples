package com.lmax.disruptor.examples.objectevent;

// tag::example[]
import com.lmax.disruptor.EventHandler;

/** @author xiechongkai */
public class ClearingEventHandler<T> implements EventHandler<ObjectEvent<T>> {
  @Override
  public void onEvent(ObjectEvent<T> event, long sequence, boolean endOfBatch) {
    event.clear(); // <1>
    System.out.println("onEvent: " + event);
  }
}
// end::example[]
