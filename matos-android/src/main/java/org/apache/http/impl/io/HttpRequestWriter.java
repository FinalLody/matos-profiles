package org.apache.http.impl.io;

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
public class HttpRequestWriter
  extends AbstractMessageWriter{
  // Constructors

  public HttpRequestWriter(org.apache.http.io.SessionOutputBuffer arg1, org.apache.http.message.LineFormatter arg2, org.apache.http.params.HttpParams arg3){
    super((org.apache.http.io.SessionOutputBuffer) null, (org.apache.http.message.LineFormatter) null, (org.apache.http.params.HttpParams) null);
  }
  // Methods

  protected void writeHeadLine(org.apache.http.HttpMessage arg1) throws java.io.IOException{
  }
}
