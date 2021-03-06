package javax.bluetooth;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2004 - 2014 Orange SA
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
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public class LocalDevice extends java.lang.Object{
// Fields
    private static LocalDevice instance = new LocalDevice();
// Methods
    public static javax.bluetooth.LocalDevice getLocalDevice()
		throws javax.bluetooth.BluetoothStateException{
        return instance;
    }
    
    public javax.bluetooth.DiscoveryAgent getDiscoveryAgent(){
        return null;
    }
    
    public String getFriendlyName(){
        return "" + "LocalDevice.";
    }
    
    public javax.bluetooth.DeviceClass getDeviceClass(){
        return new javax.bluetooth.DeviceClass(0);
    }
    
    public static String getProperty(String property){
        return "" + "LocalDevice.";
    }
    
    public int getDiscoverable(){
        return 0;
    }
    
    public String getBluetoothAddress(){
        return "" + "LocalDevice.";
    }
    
    public boolean setDiscoverable(int mode)
		throws javax.bluetooth.BluetoothStateException{
        return true;
    }
    
    public javax.bluetooth.ServiceRecord getRecord(javax.microedition.io.Connection notifier){
        return null;
    }
    
    public void updateRecord(javax.bluetooth.ServiceRecord srvRecord)
		throws javax.bluetooth.ServiceRegistrationException{
        return;
    }
// Default constructor
    public LocalDevice(){ super(); }
}
