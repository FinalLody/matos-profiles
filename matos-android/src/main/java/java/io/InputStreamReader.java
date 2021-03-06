package java.io;

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


public class InputStreamReader
  extends Reader{
  // Constructors

  public InputStreamReader(InputStream arg1){
    super();
  }
  public InputStreamReader(InputStream arg1, java.lang.String arg2) throws UnsupportedEncodingException{
    super();
  }
  public InputStreamReader(InputStream arg1, java.nio.charset.CharsetDecoder arg2){
    super();
  }
  public InputStreamReader(InputStream arg1, java.nio.charset.Charset arg2){
    super();
  }
  // Methods

  public void close() throws IOException{
  }
  public int read() throws IOException{
    return 0;
  }
  public int read(char [] arg1, int arg2, int arg3) throws IOException{
    return 0;
  }
  public java.lang.String getEncoding(){
    return (java.lang.String) null;
  }
  public boolean ready() throws IOException{
    return false;
  }
}
