package java.util.logging;

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


public class MemoryHandler
  extends Handler{
  // Constructors

  public MemoryHandler(){
    super();
  }
  public MemoryHandler(Handler arg1, int arg2, Level arg3){
    super();
  }
  // Methods

  public void push(){
  }
  public void close(){
  }
  public void flush(){
  }
  public synchronized void publish(LogRecord arg1){
  }
  public boolean isLoggable(LogRecord arg1){
    return false;
  }
  public Level getPushLevel(){
    return (Level) null;
  }
  public void setPushLevel(Level arg1){
  }
}
