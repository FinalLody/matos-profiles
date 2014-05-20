package junit.framework;

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


public class TestFailure
{
  // Fields

  protected Test fFailedTest;

  protected java.lang.Throwable fThrownException;

  // Constructors

  public TestFailure(Test arg1, java.lang.Throwable arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.String exceptionMessage(){
    return (java.lang.String) null;
  }
  public java.lang.String trace(){
    return (java.lang.String) null;
  }
  public boolean isFailure(){
    return false;
  }
  public Test failedTest(){
    return (Test) null;
  }
  public java.lang.Throwable thrownException(){
    return (java.lang.Throwable) null;
  }
}
