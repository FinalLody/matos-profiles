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


public abstract class CollationKey
  implements java.lang.Comparable<CollationKey>
{
  // Constructors

  protected CollationKey(java.lang.String arg1){
  }
  // Methods

  public abstract int compareTo(CollationKey arg1);
  public abstract byte [] toByteArray();
  public java.lang.String getSourceString(){
    return (java.lang.String) null;
  }
}
