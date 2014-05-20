package android.webkit;

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


public class ConsoleMessage
{
  // Classes

  public static enum MessageLevel
  {
    // Enum Constants

    TIP()
, LOG()
, WARNING()
, ERROR()
, DEBUG()
;
    // Fields

    // Constructors

    private MessageLevel(){
    }
    // Methods

  }
  // Constructors

  public ConsoleMessage(java.lang.String arg1, java.lang.String arg2, int arg3, ConsoleMessage.MessageLevel arg4){
  }
  // Methods

  public int lineNumber(){
    return 0;
  }
  public java.lang.String message(){
    return (java.lang.String) null;
  }
  public java.lang.String sourceId(){
    return (java.lang.String) null;
  }
  public ConsoleMessage.MessageLevel messageLevel(){
    return (ConsoleMessage.MessageLevel) null;
  }
}
