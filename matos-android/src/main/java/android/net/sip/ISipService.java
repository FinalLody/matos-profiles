package android.net.sip;

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


public interface ISipService
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements ISipService
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static ISipService asInterface(android.os.IBinder arg1){
      return (ISipService) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("ISipService")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("ISipService")
  public void close(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipService")
  public boolean isRegistered(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipService")
  public void open(SipProfile arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipService")
  public ISipSession createSession(SipProfile arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ISipSessionListener") ISipSessionListener arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipService")
  public void open3(SipProfile arg1, android.app.PendingIntent arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ISipSessionListener") ISipSessionListener arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipService")
  public boolean isOpened(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipService")
  public void setRegistrationListener(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ISipSessionListener") ISipSessionListener arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipService")
  public ISipSession getPendingSession(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipService")
  public SipProfile [] getListOfProfiles() throws android.os.RemoteException;
}
