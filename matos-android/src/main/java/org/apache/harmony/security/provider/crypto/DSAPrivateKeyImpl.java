package org.apache.harmony.security.provider.crypto;

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
public class DSAPrivateKeyImpl
  extends org.apache.harmony.security.PrivateKeyImpl  implements java.security.interfaces.DSAPrivateKey
{
  // Constructors

  public DSAPrivateKeyImpl(java.security.spec.DSAPrivateKeySpec arg1){
    super((java.lang.String) null);
  }
  public DSAPrivateKeyImpl(java.security.spec.PKCS8EncodedKeySpec arg1) throws java.security.spec.InvalidKeySpecException{
    super((java.lang.String) null);
  }
  // Methods

  public java.security.interfaces.DSAParams getParams(){
    return (java.security.interfaces.DSAParams) null;
  }
  public java.math.BigInteger getX(){
    return (java.math.BigInteger) null;
  }
}
