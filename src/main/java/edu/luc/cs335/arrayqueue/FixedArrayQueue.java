package edu.luc.cs335.arrayqueue;

import java.util.ArrayList;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    // TODO check argument validity

    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    // TODO

    return false;
  }

  @Override
  public E peek() {
    // TODO

    return null;
  }

  @Override
  public E poll() {
    // TODO

    return null;
  }

  @Override
  public boolean isEmpty() {
    // TODO
    return true;
  }

  @Override
  public boolean isFull() {
    // TODO
    return false;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public int capacity() {
    return capacity;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    final ArrayList<E> result = null;
    
    return result;
  }
}
