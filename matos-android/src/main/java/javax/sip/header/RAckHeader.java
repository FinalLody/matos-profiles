package javax.sip.header;

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


public interface RAckHeader
  extends Header
{
  // Fields

  public static final java.lang.String NAME = "RAck";

  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("method")
  public java.lang.String getMethod();
  public void setMethod(@com.francetelecom.rd.stubs.annotation.FieldSet("method") java.lang.String arg1) throws java.text.ParseException;
  public void setRSequenceNumber(long arg1) throws javax.sip.InvalidArgumentException;
  public void setCSequenceNumber(long arg1) throws javax.sip.InvalidArgumentException;
  public long getCSequenceNumber();
  public long getRSequenceNumber();
  public int getCSeqNumber();
  public void setCSeqNumber(int arg1) throws javax.sip.InvalidArgumentException;
  public int getRSeqNumber();
  public void setRSeqNumber(int arg1) throws javax.sip.InvalidArgumentException;
}