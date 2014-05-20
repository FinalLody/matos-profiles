package com.android.internal.view;

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
public class InputConnectionWrapper
  implements android.view.inputmethod.InputConnection
{
  // Constructors

  public InputConnectionWrapper(IInputContext arg1){
  }
  // Methods

  public boolean setSelection(int arg1, int arg2){
    return false;
  }
  public boolean beginBatchEdit(){
    return false;
  }
  public boolean endBatchEdit(){
    return false;
  }
  public java.lang.CharSequence getTextAfterCursor(int arg1, int arg2){
    return (java.lang.CharSequence) null;
  }
  public java.lang.CharSequence getTextBeforeCursor(int arg1, int arg2){
    return (java.lang.CharSequence) null;
  }
  public java.lang.CharSequence getSelectedText(int arg1){
    return (java.lang.CharSequence) null;
  }
  public int getCursorCapsMode(int arg1){
    return 0;
  }
  public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest arg1, int arg2){
    return (android.view.inputmethod.ExtractedText) null;
  }
  public boolean commitText(java.lang.CharSequence arg1, int arg2){
    return false;
  }
  public boolean commitCompletion(android.view.inputmethod.CompletionInfo arg1){
    return false;
  }
  public boolean commitCorrection(android.view.inputmethod.CorrectionInfo arg1){
    return false;
  }
  public boolean performEditorAction(int arg1){
    return false;
  }
  public boolean performContextMenuAction(int arg1){
    return false;
  }
  public boolean setComposingRegion(int arg1, int arg2){
    return false;
  }
  public boolean setComposingText(java.lang.CharSequence arg1, int arg2){
    return false;
  }
  public boolean finishComposingText(){
    return false;
  }
  public boolean sendKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  public boolean clearMetaKeyStates(int arg1){
    return false;
  }
  public boolean deleteSurroundingText(int arg1, int arg2){
    return false;
  }
  public boolean reportFullscreenMode(boolean arg1){
    return false;
  }
  public boolean performPrivateCommand(java.lang.String arg1, android.os.Bundle arg2){
    return false;
  }
}
