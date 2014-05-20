package com.android.internal.telephony;

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
public class DefaultPhoneNotifier
  implements PhoneNotifier
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("phoneNotifier")
  DefaultPhoneNotifier(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("phoneNotifier")
  public void notifyDataActivity(Phone arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("phoneNotifier")
  public void notifyDataConnection(Phone arg1, java.lang.String arg2, java.lang.String arg3, Phone.DataState arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("phoneNotifier")
  public void notifyOtaspChanged(Phone arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("phoneNotifier")
  public void notifyDataConnectionFailed(Phone arg1, java.lang.String arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("phoneNotifier")
  public void notifyCallForwardingChanged(Phone arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("phoneNotifier")
  public void notifyServiceState(Phone arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("phoneNotifier")
  public void notifyMessageWaitingChanged(Phone arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("phoneNotifier")
  public void notifySignalStrength(Phone arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("phoneNotifier")
  public void notifyCellLocation(Phone arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("phoneNotifier")
  public void notifyPhoneState(Phone arg1){
  }
  public static int convertCallState(Phone.State arg1){
    return 0;
  }
  public static Phone.State convertCallState(int arg1){
    return (Phone.State) null;
  }
  public static int convertDataState(Phone.DataState arg1){
    return 0;
  }
  public static Phone.DataState convertDataState(int arg1){
    return (Phone.DataState) null;
  }
  public static int convertDataActivityState(Phone.DataActivityState arg1){
    return 0;
  }
  public static Phone.DataActivityState convertDataActivityState(int arg1){
    return (Phone.DataActivityState) null;
  }
}
