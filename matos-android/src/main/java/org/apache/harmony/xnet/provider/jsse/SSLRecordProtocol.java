package org.apache.harmony.xnet.provider.jsse;

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


public class SSLRecordProtocol
{
  // Fields

  protected static final int MAX_DATA_LENGTH = 0;

  protected static final int MAX_COMPRESSED_DATA_LENGTH = 0;

  protected static final int MAX_CIPHERED_DATA_LENGTH = 0;

  protected static final int MAX_SSL_PACKET_SIZE = 0;

  // Constructors

  protected SSLRecordProtocol(HandshakeProtocol arg1, AlertProtocol arg2, SSLInputStream arg3, Appendable arg4){
  }
  // Methods

  protected void shutdown(){
  }
  protected byte [] wrap(byte arg1, DataStream arg2){
    return (byte []) null;
  }
  protected byte [] wrap(byte arg1, byte [] arg2, int arg3, int arg4){
    return (byte []) null;
  }
  protected void setVersion(byte [] arg1){
  }
  protected void alert(byte arg1, byte arg2){
  }
  protected int unwrap() throws java.io.IOException{
    return 0;
  }
  protected SSLSessionImpl getSession(){
    return (SSLSessionImpl) null;
  }
  protected int getMinRecordSize(){
    return 0;
  }
  protected int getRecordSize(int arg1){
    return 0;
  }
  protected int getDataSize(int arg1){
    return 0;
  }
  protected byte [] getChangeCipherSpecMesage(SSLSessionImpl arg1){
    return (byte []) null;
  }
}
