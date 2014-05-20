package java.util;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class LinkedList<E>
  extends AbstractSequentialList<E>  implements List<E>, Deque<E>, java.io.Serializable, java.lang.Cloneable, Queue<E>
{
  // Constructors

  public LinkedList(){
    super();
  }
  public LinkedList(Collection<? extends E> arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  public void add(int arg1, E arg2){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean add(E arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public E get(int arg1){
    return null;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public int indexOf(java.lang.Object arg1){
    return 0;
  }
  public void clear(){
  }
  public boolean contains(java.lang.Object arg1){
    return false;
  }
  public int lastIndexOf(java.lang.Object arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean addAll(int arg1, Collection<? extends E> arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean addAll(Collection<? extends E> arg1){
    return false;
  }
  public int size(){
    return 0;
  }
  public java.lang.Object [] toArray(){
    return (java.lang.Object []) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public <T>T [] toArray(T [] arg1){
    return (T []) null;
  }
  public E pop(){
    return null;
  }
  public void push(E arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public E remove(int arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean remove(java.lang.Object arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E remove(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public E set(int arg1, E arg2){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E poll(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new AbstractList.ListIteratorImplem(this);")
  public ListIterator<E> listIterator(int arg1){
    return (ListIterator) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E peek(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E getFirst(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E getLast(){
    return null;
  }
  public void addFirst(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E removeFirst(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E removeLast(){
    return null;
  }
  public void addLast(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
  }
  public boolean offer(E arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E element(){
    return null;
  }
  public boolean offerFirst(E arg1){
    return false;
  }
  public boolean offerLast(E arg1){
    return false;
  }
  public E pollFirst(){
    return null;
  }
  public E pollLast(){
    return null;
  }
  public boolean removeFirstOccurrence(java.lang.Object arg1){
    return false;
  }
  public boolean removeLastOccurrence(java.lang.Object arg1){
    return false;
  }
  public E peekFirst(){
    return null;
  }
  public E peekLast(){
    return null;
  }
  public Iterator<E> descendingIterator(){
    return (Iterator) null;
  }
}
