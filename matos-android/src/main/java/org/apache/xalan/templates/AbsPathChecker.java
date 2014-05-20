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


public class AbsPathChecker
  extends org.apache.xpath.XPathVisitor{
  // Constructors

  public AbsPathChecker(){
    super();
  }
  // Methods

  public boolean visitFunction(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.functions.Function arg2){
    return false;
  }
  public boolean checkAbsolute(org.apache.xpath.axes.LocPathIterator arg1){
    return false;
  }
  public boolean visitVariableRef(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.operations.Variable arg2){
    return false;
  }
}
