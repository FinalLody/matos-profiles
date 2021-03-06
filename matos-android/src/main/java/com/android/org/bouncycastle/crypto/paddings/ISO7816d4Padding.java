package com.android.org.bouncycastle.crypto.paddings;

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
public class ISO7816d4Padding
  implements BlockCipherPadding
{
  // Constructors

  public ISO7816d4Padding(){
  }
  // Methods

  public void init(java.security.SecureRandom arg1) throws java.lang.IllegalArgumentException{
  }
  public java.lang.String getPaddingName(){
    return (java.lang.String) null;
  }
  public int addPadding(byte [] arg1, int arg2){
    return 0;
  }
  public int padCount(byte [] arg1) throws com.android.org.bouncycastle.crypto.InvalidCipherTextException{
    return 0;
  }
}
