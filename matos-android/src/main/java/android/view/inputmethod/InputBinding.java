package android.view.inputmethod;

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
public final class InputBinding
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<InputBinding> CREATOR = null;

  // Constructors

  public InputBinding(InputConnection arg1, android.os.IBinder arg2, int arg3, int arg4){
  }
  public InputBinding(InputConnection arg1, InputBinding arg2){
  }
  InputBinding(android.os.Parcel arg1){
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
  public int getUid(){
    return 0;
  }
  public InputConnection getConnection(){
    return (InputConnection) null;
  }
  public int getPid(){
    return 0;
  }
  public android.os.IBinder getConnectionToken(){
    return (android.os.IBinder) null;
  }
}
