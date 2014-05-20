package org.apache.http.conn.routing;

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
public final class RouteTracker
  implements RouteInfo, java.lang.Cloneable
{
  // Constructors

  public RouteTracker(org.apache.http.HttpHost arg1, java.net.InetAddress arg2){
  }
  public RouteTracker(HttpRoute arg1){
  }
  // Methods

  public final boolean equals(java.lang.Object arg1){
    return false;
  }
  public final java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final int hashCode(){
    return 0;
  }
  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public final java.net.InetAddress getLocalAddress(){
    return (java.net.InetAddress) null;
  }
  public final boolean isConnected(){
    return false;
  }
  public final boolean isSecure(){
    return false;
  }
  public final RouteInfo.LayerType getLayerType(){
    return (RouteInfo.LayerType) null;
  }
  public final org.apache.http.HttpHost getTargetHost(){
    return (org.apache.http.HttpHost) null;
  }
  public final int getHopCount(){
    return 0;
  }
  public final org.apache.http.HttpHost getHopTarget(int arg1){
    return (org.apache.http.HttpHost) null;
  }
  public final org.apache.http.HttpHost getProxyHost(){
    return (org.apache.http.HttpHost) null;
  }
  public final RouteInfo.TunnelType getTunnelType(){
    return (RouteInfo.TunnelType) null;
  }
  public final boolean isTunnelled(){
    return false;
  }
  public final boolean isLayered(){
    return false;
  }
  public final void tunnelTarget(boolean arg1){
  }
  public final void tunnelProxy(org.apache.http.HttpHost arg1, boolean arg2){
  }
  public final void layerProtocol(boolean arg1){
  }
  public final HttpRoute toRoute(){
    return (HttpRoute) null;
  }
  public final void connectTarget(boolean arg1){
  }
  public final void connectProxy(org.apache.http.HttpHost arg1, boolean arg2){
  }
}
