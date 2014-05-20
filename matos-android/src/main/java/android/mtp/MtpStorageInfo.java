package android.mtp;

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


public final class MtpStorageInfo
{
  // Constructors

  private MtpStorageInfo(){
  }
  // Methods

  public final long getFreeSpace(){
    return 0l;
  }
  public final int getStorageId(){
    return 0;
  }
  public final java.lang.String getDescription(){
    return (java.lang.String) null;
  }
  public final long getMaxCapacity(){
    return 0l;
  }
  public final java.lang.String getVolumeIdentifier(){
    return (java.lang.String) null;
  }
}
