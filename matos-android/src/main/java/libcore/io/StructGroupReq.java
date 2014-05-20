package libcore.io;

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

import com.francetelecom.rd.stubs.annotation.FieldNoValue;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public final class StructGroupReq
{
  // Fields

  public final int gr_interface = 0;
  @FieldNoValue
  public final java.net.InetAddress gr_group = (java.net.InetAddress) null;

  // Constructors

  public StructGroupReq(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("gr_group") java.net.InetAddress arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
}
