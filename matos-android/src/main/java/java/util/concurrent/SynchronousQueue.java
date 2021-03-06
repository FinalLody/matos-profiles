package java.util.concurrent;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


public class SynchronousQueue<E>
  extends java.util.AbstractQueue<E>  implements BlockingQueue<E>, java.io.Serializable
{
  // Constructors

  public SynchronousQueue(){
    super();
  }
  public SynchronousQueue(boolean arg1){
    super();
  }
  // Methods

  public void put(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1) throws java.lang.InterruptedException{
  }
  public void clear(){
  }
  public boolean contains(java.lang.Object arg1){
    return false;
  }
  public boolean isEmpty(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new IteratorImplem(this);")
  public java.util.Iterator<E> iterator(){
    return (java.util.Iterator) null;
  }
  public int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public java.lang.Object [] toArray(){
    return (java.lang.Object []) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public <T>T [] toArray(T [] arg1){
    return (T []) null;
  }
  public boolean remove(java.lang.Object arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E poll(long arg1, TimeUnit arg2) throws java.lang.InterruptedException{
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E poll(){
    return null;
  }
  public boolean containsAll(java.util.Collection<?> arg1){
    return false;
  }
  public boolean removeAll(java.util.Collection<?> arg1){
    return false;
  }
  public boolean retainAll(java.util.Collection<?> arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E peek(){
    return null;
  }
  public boolean offer(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1, long arg2, TimeUnit arg3) throws java.lang.InterruptedException{
    return false;
  }
  public boolean offer(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E take() throws java.lang.InterruptedException{
    return null;
  }
  public int drainTo(java.util.Collection<? super E> arg1){
    return 0;
  }
  public int drainTo(java.util.Collection<? super E> arg1, int arg2){
    return 0;
  }
  public int remainingCapacity(){
    return 0;
  }
}
