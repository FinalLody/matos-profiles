package android.os;

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
public abstract class UEventObserver
{
  // Classes

  public static class UEvent
  {
    // Fields

    public java.util.HashMap<java.lang.String, java.lang.String> mMap;

    // Constructors

    public UEvent(java.lang.String arg1){
    }
    // Methods

    public java.lang.String get(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public java.lang.String get(java.lang.String arg1, java.lang.String arg2){
      return (java.lang.String) null;
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Constructors

  public UEventObserver(){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public final synchronized void startObserving(java.lang.String arg1){
  }
  public abstract void onUEvent(UEventObserver.UEvent arg1);
  public final synchronized void stopObserving(){
  }
}
