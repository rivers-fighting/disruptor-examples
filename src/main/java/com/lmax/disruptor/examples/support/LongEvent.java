package com.lmax.disruptor.examples.support;

import com.lmax.disruptor.EventFactory;

/** @author Bonree */
public class LongEvent {
  public static final EventFactory<LongEvent> FACTORY = LongEvent::new;

  private long value;

  public void set(final long value) {
    this.value = value;
  }

  public long get() {
    return value;
  }
}
