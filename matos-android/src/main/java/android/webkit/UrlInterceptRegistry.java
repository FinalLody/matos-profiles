package android.webkit;

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
public final class UrlInterceptRegistry
{
  // Constructors

  public UrlInterceptRegistry(){
  }
  // Methods

  public static synchronized boolean registerHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.webkit.UrlInterceptHandler.handle") UrlInterceptHandler arg1){
    return false;
  }
  public static synchronized void setUrlInterceptDisabled(boolean arg1){
  }
  public static synchronized boolean urlInterceptDisabled(){
    return false;
  }
  public static synchronized boolean unregisterHandler(UrlInterceptHandler arg1){
    return false;
  }
  public static synchronized CacheManager.CacheResult getSurrogate(java.lang.String arg1, java.util.Map<java.lang.String, java.lang.String> arg2){
    return (CacheManager.CacheResult) null;
  }
  public static synchronized PluginData getPluginData(java.lang.String arg1, java.util.Map<java.lang.String, java.lang.String> arg2){
    return (PluginData) null;
  }
}
