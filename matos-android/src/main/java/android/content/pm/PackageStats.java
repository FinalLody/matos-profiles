package android.content.pm;

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
public class PackageStats
  implements android.os.Parcelable
{
  // Fields

  public java.lang.String packageName;

  public long codeSize;

  public long dataSize;

  public long cacheSize;

  public long externalCodeSize;

  public long externalDataSize;

  public long externalCacheSize;

  public long externalMediaSize;

  public long externalObbSize;

  public static final android.os.Parcelable.Creator<PackageStats> CREATOR = null;

  // Constructors

  public PackageStats(java.lang.String arg1){
  }
  public PackageStats(android.os.Parcel arg1){
  }
  public PackageStats(PackageStats arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
}
