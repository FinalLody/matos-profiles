package org.w3c.dom.ls;

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


public interface LSSerializer
{
  // Methods

  public boolean write(org.w3c.dom.Node arg1, LSOutput arg2) throws LSException;
  public LSSerializerFilter getFilter();
  public void setFilter(LSSerializerFilter arg1);
  public org.w3c.dom.DOMConfiguration getDomConfig();
  public void setNewLine(java.lang.String arg1);
  public java.lang.String getNewLine();
  public java.lang.String writeToString(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException, LSException;
  public boolean writeToURI(org.w3c.dom.Node arg1, java.lang.String arg2) throws LSException;
}
