package gov.nist.javax.sip.header;

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


public final class Allow
  extends SIPHeader  implements javax.sip.header.AllowHeader
{
  // Fields

  protected java.lang.String method;

  // Constructors

  public Allow(){
    super((java.lang.String) null);
  }
  public Allow(java.lang.String arg1){
    super((java.lang.String) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("method")
  public java.lang.String getMethod(){
    return (java.lang.String) null;
  }
  public void setMethod(@com.francetelecom.rd.stubs.annotation.FieldSet("this.method") java.lang.String arg1) throws java.text.ParseException{
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
}
