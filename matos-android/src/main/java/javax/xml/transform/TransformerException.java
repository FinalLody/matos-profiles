package javax.xml.transform;

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


public class TransformerException
  extends java.lang.Exception{
  // Constructors

  public TransformerException(java.lang.String arg1){
    super();
  }
  public TransformerException(java.lang.Throwable arg1){
    super();
  }
  public TransformerException(java.lang.String arg1, java.lang.Throwable arg2){
    super();
  }
  public TransformerException(java.lang.String arg1, SourceLocator arg2){
    super();
  }
  public TransformerException(java.lang.String arg1, SourceLocator arg2, java.lang.Throwable arg3){
    super();
  }
  // Methods

  public void printStackTrace(){
  }
  public void printStackTrace(java.io.PrintStream arg1){
  }
  public void printStackTrace(java.io.PrintWriter arg1){
  }
  public java.lang.Throwable getCause(){
    return (java.lang.Throwable) null;
  }
  public synchronized java.lang.Throwable initCause(java.lang.Throwable arg1){
    return (java.lang.Throwable) null;
  }
  public java.lang.Throwable getException(){
    return (java.lang.Throwable) null;
  }
  public SourceLocator getLocator(){
    return (SourceLocator) null;
  }
  public void setLocator(SourceLocator arg1){
  }
  public java.lang.String getMessageAndLocation(){
    return (java.lang.String) null;
  }
  public java.lang.String getLocationAsString(){
    return (java.lang.String) null;
  }
}
