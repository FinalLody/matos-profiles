package gov.nist.javax.sip.parser.ims;

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


public class PVisitedNetworkIDParser
  extends gov.nist.javax.sip.parser.ParametersParser  implements gov.nist.javax.sip.parser.TokenTypes
{
  // Constructors

  public PVisitedNetworkIDParser(java.lang.String arg1){
    super((gov.nist.javax.sip.parser.Lexer) null);
  }
  protected PVisitedNetworkIDParser(gov.nist.javax.sip.parser.Lexer arg1){
    super((gov.nist.javax.sip.parser.Lexer) null);
  }
  // Methods

  public gov.nist.javax.sip.header.SIPHeader parse() throws java.text.ParseException{
    return (gov.nist.javax.sip.header.SIPHeader) null;
  }
  protected void parseQuotedString(gov.nist.javax.sip.header.ims.PVisitedNetworkID arg1) throws java.text.ParseException{
  }
  protected void parseToken(gov.nist.javax.sip.header.ims.PVisitedNetworkID arg1) throws java.text.ParseException{
  }
}
