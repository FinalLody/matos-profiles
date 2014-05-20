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


public interface PAssociatedURIHeader
  extends javax.sip.header.Header, javax.sip.header.Parameters, javax.sip.header.HeaderAddress
{
  // Fields

  public static final java.lang.String NAME = "P-Associated-URI";

  // Methods

  public void setAssociatedURI(@com.francetelecom.rd.stubs.annotation.FieldSet("associatedURI") javax.sip.address.URI arg1) throws java.lang.NullPointerException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("associatedURI")
  public javax.sip.address.URI getAssociatedURI();
}
