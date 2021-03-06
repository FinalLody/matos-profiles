package java.text;

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


public final class Normalizer
{
  // Classes

  public static enum Form
  {
    // Enum Constants

    NFD()
, NFC()
, NFKD()
, NFKC()
;
    // Fields

    // Constructors

    private Form(){
    }
    // Methods

  }
  // Constructors

  private Normalizer(){
  }
  // Methods

  public static java.lang.String normalize(java.lang.CharSequence arg1, Normalizer.Form arg2){
    return (java.lang.String) null;
  }
  public static boolean isNormalized(java.lang.CharSequence arg1, Normalizer.Form arg2){
    return false;
  }
}
