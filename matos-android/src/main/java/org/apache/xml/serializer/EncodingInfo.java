package org.apache.xml.serializer;

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


public final class EncodingInfo
{
  // Constructors

  public EncodingInfo(java.lang.String arg1, java.lang.String arg2, char arg3){
  }
  // Methods

  public boolean isInEncoding(char arg1){
    return false;
  }
  public boolean isInEncoding(char arg1, char arg2){
    return false;
  }
  public final char getHighChar(){
    return '\u0000';
  }
}
