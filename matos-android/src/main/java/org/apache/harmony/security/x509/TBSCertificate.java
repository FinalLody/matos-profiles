package org.apache.harmony.security.x509;

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
public final class TBSCertificate
{
  // Fields

  public static final org.apache.harmony.security.asn1.ASN1Sequence ASN1 = null;

  // Constructors

  public TBSCertificate(int arg1, java.math.BigInteger arg2, AlgorithmIdentifier arg3, org.apache.harmony.security.x501.Name arg4, Validity arg5, org.apache.harmony.security.x501.Name arg6, SubjectPublicKeyInfo arg7, boolean [] arg8, boolean [] arg9, Extensions arg10){
  }
  private TBSCertificate(int arg1, java.math.BigInteger arg2, AlgorithmIdentifier arg3, org.apache.harmony.security.x501.Name arg4, Validity arg5, org.apache.harmony.security.x501.Name arg6, SubjectPublicKeyInfo arg7, boolean [] arg8, boolean [] arg9, Extensions arg10, byte [] arg11){
  }
  // Methods

  public AlgorithmIdentifier getSignature(){
    return (AlgorithmIdentifier) null;
  }
  public byte [] getEncoded(){
    return (byte []) null;
  }
  public void dumpValue(java.lang.StringBuilder arg1){
  }
  public int getVersion(){
    return 0;
  }
  public java.math.BigInteger getSerialNumber(){
    return (java.math.BigInteger) null;
  }
  public org.apache.harmony.security.x501.Name getIssuer(){
    return (org.apache.harmony.security.x501.Name) null;
  }
  public org.apache.harmony.security.x501.Name getSubject(){
    return (org.apache.harmony.security.x501.Name) null;
  }
  public boolean [] getIssuerUniqueID(){
    return (boolean []) null;
  }
  public boolean [] getSubjectUniqueID(){
    return (boolean []) null;
  }
  public SubjectPublicKeyInfo getSubjectPublicKeyInfo(){
    return (SubjectPublicKeyInfo) null;
  }
  public Extensions getExtensions(){
    return (Extensions) null;
  }
  public Validity getValidity(){
    return (Validity) null;
  }
}
