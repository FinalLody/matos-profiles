package org.apache.http.impl.conn;

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
public class LoggingSessionInputBuffer
  implements org.apache.http.io.SessionInputBuffer
{
  // Constructors

  public LoggingSessionInputBuffer(org.apache.http.io.SessionInputBuffer arg1, Wire arg2){
  }
  // Methods

  public java.lang.String readLine() throws java.io.IOException{
    return (java.lang.String) null;
  }
  public int readLine(org.apache.http.util.CharArrayBuffer arg1) throws java.io.IOException{
    return 0;
  }
  public int read(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
    return 0;
  }
  public int read() throws java.io.IOException{
    return 0;
  }
  public int read(byte [] arg1) throws java.io.IOException{
    return 0;
  }
  public org.apache.http.io.HttpTransportMetrics getMetrics(){
    return (org.apache.http.io.HttpTransportMetrics) null;
  }
  public boolean isDataAvailable(int arg1) throws java.io.IOException{
    return false;
  }
}
