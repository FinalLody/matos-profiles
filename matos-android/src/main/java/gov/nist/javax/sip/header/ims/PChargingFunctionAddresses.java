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


public class PChargingFunctionAddresses
  extends gov.nist.javax.sip.header.ParametersHeader  implements PChargingFunctionAddressesHeader, javax.sip.header.ExtensionHeader, SIPHeaderNamesIms
{
  // Constructors

  public PChargingFunctionAddresses(){
    super();
  }
  // Methods

  public boolean delete(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public void setValue(java.lang.String arg1) throws java.text.ParseException{
  }
  public void setChargingCollectionFunctionAddress(java.lang.String arg1) throws java.text.ParseException{
  }
  public void addChargingCollectionFunctionAddress(java.lang.String arg1) throws java.text.ParseException{
  }
  public void removeChargingCollectionFunctionAddress(java.lang.String arg1) throws java.text.ParseException{
  }
  public java.util.ListIterator getChargingCollectionFunctionAddresses(){
    return (java.util.ListIterator) null;
  }
  public void setEventChargingFunctionAddress(java.lang.String arg1) throws java.text.ParseException{
  }
  public void addEventChargingFunctionAddress(java.lang.String arg1) throws java.text.ParseException{
  }
  public void removeEventChargingFunctionAddress(java.lang.String arg1) throws java.text.ParseException{
  }
  public java.util.ListIterator<gov.nist.core.NameValue> getEventChargingFunctionAddresses(){
    return (java.util.ListIterator) null;
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
}
