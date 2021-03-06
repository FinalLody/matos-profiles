package org.apache.xpath.jaxp;

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


public class JAXPExtensionsProvider
  implements org.apache.xpath.ExtensionsProvider
{
  // Constructors

  public JAXPExtensionsProvider(javax.xml.xpath.XPathFunctionResolver arg1){
  }
  public JAXPExtensionsProvider(javax.xml.xpath.XPathFunctionResolver arg1, boolean arg2){
  }
  // Methods

  public java.lang.Object extFunction(java.lang.String arg1, java.lang.String arg2, java.util.Vector arg3, java.lang.Object arg4) throws javax.xml.transform.TransformerException{
    return (java.lang.Object) null;
  }
  public java.lang.Object extFunction(org.apache.xpath.functions.FuncExtFunction arg1, java.util.Vector arg2) throws javax.xml.transform.TransformerException{
    return (java.lang.Object) null;
  }
  public boolean functionAvailable(java.lang.String arg1, java.lang.String arg2) throws javax.xml.transform.TransformerException{
    return false;
  }
  public boolean elementAvailable(java.lang.String arg1, java.lang.String arg2) throws javax.xml.transform.TransformerException{
    return false;
  }
}
