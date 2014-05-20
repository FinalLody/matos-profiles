package org.apache.xalan.templates;

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


public class ElemWhen
  extends ElemTemplateElement{
  // Constructors

  public ElemWhen(){
    super();
  }
  // Methods

  public java.lang.String getNodeName(){
    return (java.lang.String) null;
  }
  public int getXSLToken(){
    return 0;
  }
  public void compose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  protected void callChildVisitors(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1, boolean arg2){
  }
  public void setTest(org.apache.xpath.XPath arg1){
  }
  public org.apache.xpath.XPath getTest(){
    return (org.apache.xpath.XPath) null;
  }
}
