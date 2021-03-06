package javax.net;

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


public abstract class SocketFactory
{
  // Constructors

  protected SocketFactory(){
  }
  // Methods

  public static synchronized SocketFactory getDefault(){
    return (SocketFactory) null;
  }
  public java.net.Socket createSocket() throws java.io.IOException{
    return (java.net.Socket) null;
  }
  public abstract java.net.Socket createSocket(java.lang.String arg1, int arg2) throws java.io.IOException, java.net.UnknownHostException;
  public abstract java.net.Socket createSocket(java.lang.String arg1, int arg2, java.net.InetAddress arg3, int arg4) throws java.io.IOException, java.net.UnknownHostException;
  public abstract java.net.Socket createSocket(java.net.InetAddress arg1, int arg2) throws java.io.IOException;
  public abstract java.net.Socket createSocket(java.net.InetAddress arg1, int arg2, java.net.InetAddress arg3, int arg4) throws java.io.IOException;
}
