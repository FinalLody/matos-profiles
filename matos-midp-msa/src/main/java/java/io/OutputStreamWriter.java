package java.io;

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
public class OutputStreamWriter extends Writer {
    public OutputStreamWriter(OutputStream a0){}
    public OutputStreamWriter(OutputStream a0,String a1) throws UnsupportedEncodingException{}
    public void write(int a0) throws IOException{ return; }
    public void write(char[] a0,int a1,int a2) throws IOException{ return; }
    public void write(String a0,int a1,int a2) throws IOException{ return; }
    public void flush() throws IOException{ return; }
    public void close() throws IOException{ return; }
}

