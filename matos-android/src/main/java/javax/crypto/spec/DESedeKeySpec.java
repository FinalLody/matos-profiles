package javax.crypto.spec;

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


public class DESedeKeySpec
  implements java.security.spec.KeySpec
{
  // Fields

  public static final int DES_EDE_KEY_LEN = 24;

  // Constructors

  public DESedeKeySpec(byte [] arg1) throws java.security.InvalidKeyException{
  }
  public DESedeKeySpec(byte [] arg1, int arg2) throws java.security.InvalidKeyException{
  }
  // Methods

  public byte [] getKey(){
    return (byte []) null;
  }
  public static boolean isParityAdjusted(byte [] arg1, int arg2) throws java.security.InvalidKeyException{
    return false;
  }
}
