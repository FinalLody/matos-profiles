package android.text.method;

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
public abstract class ReplacementTransformationMethod
  implements TransformationMethod
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ReplacementTransformationMethod(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFocusChanged(android.view.View arg1, java.lang.CharSequence arg2, boolean arg3, int arg4, android.graphics.Rect arg5){
  }
  public java.lang.CharSequence getTransformation(java.lang.CharSequence arg1, android.view.View arg2){
    return (java.lang.CharSequence) null;
  }
  protected abstract char [] getOriginal();
  protected abstract char [] getReplacement();
}
