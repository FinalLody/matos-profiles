package gov.nist.javax.sip.header.ims;

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


public class PPreferredService
  extends gov.nist.javax.sip.header.SIPHeader  implements javax.sip.header.ExtensionHeader, SIPHeaderNamesIms, PPreferredServiceHeader
{
  // Constructors

  protected PPreferredService(java.lang.String arg1){
    super((java.lang.String) null);
  }
  public PPreferredService(){
    super((java.lang.String) null);
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public void setValue(java.lang.String arg1) throws java.text.ParseException{
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("applicationIdentifiers")
  public java.lang.String getApplicationIdentifiers(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("subserviceIdentifiers")
  public java.lang.String getSubserviceIdentifiers(){
    return (java.lang.String) null;
  }
  public void setApplicationIdentifiers(@com.francetelecom.rd.stubs.annotation.FieldSet("applicationIdentifiers") java.lang.String arg1){
  }
  public void setSubserviceIdentifiers(@com.francetelecom.rd.stubs.annotation.FieldSet("subserviceIdentifiers") java.lang.String arg1){
  }
}
