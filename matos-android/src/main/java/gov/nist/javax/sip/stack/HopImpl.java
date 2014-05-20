package gov.nist.javax.sip.stack;

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


public final class HopImpl
  implements javax.sip.address.Hop, java.io.Serializable
{
  // Fields

  protected java.lang.String host;

  protected int port;

  protected java.lang.String transport;

  protected boolean defaultRoute;

  protected boolean uriRoute;

  // Constructors

  public HopImpl(java.lang.String arg1, int arg2, java.lang.String arg3){
  }
  HopImpl(java.lang.String arg1) throws java.lang.IllegalArgumentException{
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public java.lang.String getTransport(){
    return (java.lang.String) null;
  }
  public boolean isURIRoute(){
    return false;
  }
  public void setURIRouteFlag(){
  }
}
