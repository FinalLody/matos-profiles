package com.android.commands.svc;

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


public class Svc
{
  // Classes

  public abstract static class Command
  {
    // Constructors

    public Command(java.lang.String arg1){
    }
    // Methods

    public java.lang.String name(){
      return (java.lang.String) null;
    }
    public abstract void run(java.lang.String [] arg1);
    public abstract java.lang.String shortHelp();
    public abstract java.lang.String longHelp();
  }
  // Fields

  public static final Svc.Command COMMAND_HELP = null;

  public static final Svc.Command [] COMMANDS = null;

  // Constructors

  public Svc(){
  }
  // Methods

  public static void main(java.lang.String [] arg1){
  }
}
