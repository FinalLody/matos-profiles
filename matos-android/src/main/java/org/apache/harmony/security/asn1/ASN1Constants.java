package org.apache.harmony.security.asn1;

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
public interface ASN1Constants
{
  // Fields

  public static final int CLASS_UNIVERSAL = 0;

  public static final int CLASS_APPLICATION = 64;

  public static final int CLASS_CONTEXTSPECIFIC = 128;

  public static final int CLASS_PRIVATE = 192;

  public static final int PC_PRIMITIVE = 0;

  public static final int PC_CONSTRUCTED = 32;

  public static final int TAG_BOOLEAN = 1;

  public static final int TAG_INTEGER = 2;

  public static final int TAG_BITSTRING = 3;

  public static final int TAG_OCTETSTRING = 4;

  public static final int TAG_NULL = 5;

  public static final int TAG_OID = 6;

  public static final int TAG_OBJDESCRIPTOR = 7;

  public static final int TAG_EXTERNAL = 8;

  public static final int TAG_INSTANCEOF = 8;

  public static final int TAG_REAL = 9;

  public static final int TAG_ENUM = 10;

  public static final int TAG_EMBEDDEDPDV = 11;

  public static final int TAG_UTF8STRING = 12;

  public static final int TAG_RELATIVEOID = 13;

  public static final int TAG_SEQUENCE = 16;

  public static final int TAG_SEQUENCEOF = 16;

  public static final int TAG_SET = 17;

  public static final int TAG_SETOF = 17;

  public static final int TAG_NUMERICSTRING = 18;

  public static final int TAG_PRINTABLESTRING = 19;

  public static final int TAG_TELETEXSTRING = 20;

  public static final int TAG_T61STRING = 20;

  public static final int TAG_VIDEOTEXSTRING = 21;

  public static final int TAG_IA5STRING = 22;

  public static final int TAG_UTCTIME = 23;

  public static final int TAG_GENERALIZEDTIME = 24;

  public static final int TAG_GRAPHICSTRING = 25;

  public static final int TAG_VISIBLESTRING = 26;

  public static final int TAG_ISO646STRING = 26;

  public static final int TAG_GENERALSTRING = 27;

  public static final int TAG_UNIVERSALSTRING = 28;

  public static final int TAG_BMPSTRING = 30;

  public static final int TAG_C_BITSTRING = 35;

  public static final int TAG_C_OCTETSTRING = 36;

  public static final int TAG_C_UTF8STRING = 44;

  public static final int TAG_C_SEQUENCE = 48;

  public static final int TAG_C_SEQUENCEOF = 48;

  public static final int TAG_C_SET = 49;

  public static final int TAG_C_SETOF = 49;

  public static final int TAG_C_UTCTIME = 55;

  public static final int TAG_C_GENERALIZEDTIME = 56;

  public static final int TAG_ANY = 0;

  public static final int TAG_CHOICE = 0;

}
