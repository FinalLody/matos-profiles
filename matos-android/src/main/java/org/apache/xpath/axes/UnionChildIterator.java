package org.apache.xpath.axes;

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


public class UnionChildIterator
  extends ChildTestIterator{
  // Constructors

  public UnionChildIterator(){
    super((org.apache.xml.dtm.DTMAxisTraverser) null);
  }
  // Methods

  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public short acceptNode(int arg1){
    return (short) 0;
  }
  public void addNodeTest(PredicatedNodeTest arg1){
  }
}
