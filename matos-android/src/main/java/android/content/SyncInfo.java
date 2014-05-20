package android.content;

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


public class SyncInfo
  implements android.os.Parcelable
{
  // Fields

  public final int authorityId = 0;

  public final android.accounts.Account account = (android.accounts.Account) null;

  public final java.lang.String authority = (java.lang.String) null;

  public final long startTime = 0l;

  public static final android.os.Parcelable.Creator<SyncInfo> CREATOR = null;

  // Constructors

  SyncInfo(int arg1, android.accounts.Account arg2, java.lang.String arg3, long arg4){
  }
  SyncInfo(android.os.Parcel arg1){
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
}
