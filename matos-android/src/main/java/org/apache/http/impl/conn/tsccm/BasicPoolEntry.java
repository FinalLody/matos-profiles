package org.apache.http.impl.conn.tsccm;

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
public class BasicPoolEntry
  extends org.apache.http.impl.conn.AbstractPoolEntry{
  // Constructors

  public BasicPoolEntry(org.apache.http.conn.ClientConnectionOperator arg1, org.apache.http.conn.routing.HttpRoute arg2, java.lang.ref.ReferenceQueue<java.lang.Object> arg3){
    super((org.apache.http.conn.ClientConnectionOperator) null, (org.apache.http.conn.routing.HttpRoute) null);
  }
  // Methods

  protected final org.apache.http.conn.OperatedClientConnection getConnection(){
    return (org.apache.http.conn.OperatedClientConnection) null;
  }
  protected final org.apache.http.conn.routing.HttpRoute getPlannedRoute(){
    return (org.apache.http.conn.routing.HttpRoute) null;
  }
  protected final BasicPoolEntryRef getWeakRef(){
    return (BasicPoolEntryRef) null;
  }
}
