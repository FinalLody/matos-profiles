package org.apache.http.conn.params;

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
public final class ConnManagerParams
  implements ConnManagerPNames
{
  // Fields

  public static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 20;

  // Constructors

  public ConnManagerParams(){
  }
  // Methods

  public static long getTimeout(org.apache.http.params.HttpParams arg1){
    return 0l;
  }
  public static void setTimeout(org.apache.http.params.HttpParams arg1, long arg2){
  }
  public static int getMaxTotalConnections(org.apache.http.params.HttpParams arg1){
    return 0;
  }
  public static ConnPerRoute getMaxConnectionsPerRoute(org.apache.http.params.HttpParams arg1){
    return (ConnPerRoute) null;
  }
  public static void setMaxConnectionsPerRoute(org.apache.http.params.HttpParams arg1, ConnPerRoute arg2){
  }
  public static void setMaxTotalConnections(org.apache.http.params.HttpParams arg1, int arg2){
  }
}
