package com.android.org.bouncycastle.asn1;

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


public class BERTaggedObjectParser
  implements ASN1TaggedObjectParser
{
  // Constructors

  protected BERTaggedObjectParser(int arg1, int arg2, java.io.InputStream arg3){
  }
  BERTaggedObjectParser(boolean arg1, int arg2, ASN1StreamParser arg3){
  }
  // Methods

  public DERObject getDERObject(){
    return (DERObject) null;
  }
  public DERObject getLoadedObject() throws java.io.IOException{
    return (DERObject) null;
  }
  public int getTagNo(){
    return 0;
  }
  public DEREncodable getObjectParser(int arg1, boolean arg2) throws java.io.IOException{
    return (DEREncodable) null;
  }
  public boolean isConstructed(){
    return false;
  }
}
