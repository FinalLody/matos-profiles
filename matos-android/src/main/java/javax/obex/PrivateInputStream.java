package javax.obex;

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


public final class PrivateInputStream
  extends java.io.InputStream{
  // Constructors

  public PrivateInputStream(BaseStream arg1){
    super();
  }
  // Methods

  public void close() throws java.io.IOException{
  }
  public synchronized int read() throws java.io.IOException{
    return 0;
  }
  public int read(byte [] arg1) throws java.io.IOException{
    return 0;
  }
  public synchronized int read(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
    return 0;
  }
  public synchronized int available() throws java.io.IOException{
    return 0;
  }
  public synchronized void writeBytes(byte [] arg1, int arg2){
  }
}
