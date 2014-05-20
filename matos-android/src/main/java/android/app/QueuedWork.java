package android.app;

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


public class QueuedWork
{
  // Constructors

  public QueuedWork(){
  }
  // Methods

  public static void add(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1){
  }
  public static void remove(java.lang.Runnable arg1){
  }
  public static boolean hasPendingWork(){
    return false;
  }
  public static java.util.concurrent.ExecutorService singleThreadExecutor(){
    return (java.util.concurrent.ExecutorService) null;
  }
  public static void waitToFinish(){
  }
}
