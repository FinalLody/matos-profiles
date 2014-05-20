package com.android.internal.view;

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


public interface IInputContextCallback
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IInputContextCallbackStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IInputContextCallback
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IInputContextCallback asInterface(android.os.IBinder arg1){
      return (IInputContextCallback) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContextCallback")
  public void setExtractedText(android.view.inputmethod.ExtractedText arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContextCallback")
  public void setTextAfterCursor(java.lang.CharSequence arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContextCallback")
  public void setTextBeforeCursor(java.lang.CharSequence arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContextCallback")
  public void setSelectedText(java.lang.CharSequence arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IInputContextCallback")
  public void setCursorCapsMode(int arg1, int arg2) throws android.os.RemoteException;
}
