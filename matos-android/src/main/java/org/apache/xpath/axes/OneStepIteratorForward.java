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


public class OneStepIteratorForward
  extends ChildTestIterator{
  // Fields

  protected int m_axis;

  // Constructors

  OneStepIteratorForward(org.apache.xpath.compiler.Compiler arg1, int arg2, int arg3) throws javax.xml.transform.TransformerException{
    super((org.apache.xml.dtm.DTMAxisTraverser) null);
  }
  public OneStepIteratorForward(int arg1){
    super((org.apache.xml.dtm.DTMAxisTraverser) null);
  }
  // Methods

  public boolean deepEquals(org.apache.xpath.Expression arg1){
    return false;
  }
  public void setRoot(int arg1, java.lang.Object arg2){
  }
  public int getAxis(){
    return 0;
  }
  protected int getNextNode(){
    return 0;
  }
}
