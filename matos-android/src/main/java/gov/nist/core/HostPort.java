package gov.nist.core;

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


public final class HostPort
  extends GenericObject{
  // Fields

  protected Host host;

  protected int port;

  // Constructors

  public HostPort(){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.StringBuffer encode(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public Host getHost(){
    return (Host) null;
  }
  public int getPort(){
    return 0;
  }
  public void merge(java.lang.Object arg1){
  }
  public java.net.InetAddress getInetAddress() throws java.net.UnknownHostException{
    return (java.net.InetAddress) null;
  }
  public void setHost(Host arg1){
  }
  public void setPort(int arg1){
  }
  public boolean hasPort(){
    return false;
  }
  public void removePort(){
  }
}
