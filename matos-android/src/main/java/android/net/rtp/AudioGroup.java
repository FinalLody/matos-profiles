package android.net.rtp;

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


public class AudioGroup
{
  // Fields

  public static final int MODE_ON_HOLD = 0;

  public static final int MODE_MUTED = 1;

  public static final int MODE_NORMAL = 2;

  public static final int MODE_ECHO_SUPPRESSION = 3;

  // Constructors

  public AudioGroup(){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void clear(){
  }
  public void sendDtmf(int arg1){
  }
  public int getMode(){
    return 0;
  }
  public void setMode(int arg1){
  }
  public AudioStream [] getStreams(){
    return (AudioStream []) null;
  }
}
