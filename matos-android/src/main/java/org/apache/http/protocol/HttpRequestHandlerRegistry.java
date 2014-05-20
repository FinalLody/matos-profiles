package org.apache.http.protocol;

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
public class HttpRequestHandlerRegistry
  implements HttpRequestHandlerResolver
{
  // Constructors

  public HttpRequestHandlerRegistry(){
  }
  // Methods

  public void register(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("handler") @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") HttpRequestHandler arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("handler")
  public HttpRequestHandler lookup(java.lang.String arg1){
    return (HttpRequestHandler) null;
  }
  public void unregister(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code("handler = (HttpRequestHandler) arg1.keySet().iterator().next();")
  public void setHandlers(java.util.Map arg1){
  }
  protected boolean matchUriRequestPattern(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
}
