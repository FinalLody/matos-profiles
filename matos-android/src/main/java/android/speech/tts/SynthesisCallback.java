package android.speech.tts;

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

import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakeandroid.SynthesisCallbackImpl")
public interface SynthesisCallback
{
  // Methods
  @com.francetelecom.rd.stubs.annotation.CallBack("SynthesisCallback")
  public int start(int arg1, int arg2, int arg3);
  @com.francetelecom.rd.stubs.annotation.CallBack("SynthesisCallback")
  public void error();
  @com.francetelecom.rd.stubs.annotation.CallBack("SynthesisCallback")
  public int done();
  @com.francetelecom.rd.stubs.annotation.CallBack("SynthesisCallback")
  public int getMaxBufferSize();
  @com.francetelecom.rd.stubs.annotation.CallBack("SynthesisCallback")
  public int audioAvailable(byte [] arg1, int arg2, int arg3);
}
