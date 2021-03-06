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
public class HashMap<K, V>
  extends AbstractMap<K, V>  implements java.io.Serializable, java.lang.Cloneable
{
  // Constructors

  public HashMap(){
    super();
  }
  public HashMap(int arg1){
    super();
  }
  public HashMap(int arg1, float arg2){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code({"super();", "putAll(arg1);"})
  public HashMap(Map<? extends K, ? extends V> arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  public V get(java.lang.Object arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public V put(K arg1, V arg2){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public Collection<V> values(){
    return (Collection) null;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public void clear(){
  }
  public boolean isEmpty(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.Set <java.util.Map.Entry<K,V>> result = new java.util.HashSet<java.util.Map.Entry<K,V>>();", "result.add(new EntryImplem(this));", "return result;"})
  public Set<Map.Entry<K, V>> entrySet(){
    return (Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public void putAll(Map<? extends K, ? extends V> arg1){
  }
  public int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public V remove(java.lang.Object arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public Set<K> keySet(){
    return (Set) null;
  }
  public boolean containsKey(java.lang.Object arg1){
    return false;
  }
  public boolean containsValue(java.lang.Object arg1){
    return false;
  }
}
