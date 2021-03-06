package android.widget;

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
public class TabWidget
  extends LinearLayout  implements android.view.View.OnFocusChangeListener
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TabWidget(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TabWidget(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TabWidget(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  public void addView(android.view.View arg1){
  }
  public void removeAllViews(){
  }
  public void dispatchDraw(android.graphics.Canvas arg1){
  }
  protected int getChildDrawingOrder(int arg1, int arg2){
    return 0;
  }
  public void childDrawableStateChanged(android.view.View arg1){
  }
  public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent arg1){
  }
  public void setEnabled(boolean arg1){
  }
  protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  public void setDividerDrawable(android.graphics.drawable.Drawable arg1){
  }
  public void setDividerDrawable(int arg1){
  }
  public int getTabCount(){
    return 0;
  }
  public void setCurrentTab(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFocusChange(android.view.View arg1, boolean arg2){
  }
  public android.view.View getChildTabViewAt(int arg1){
    return (android.view.View) null;
  }
  public void setStripEnabled(boolean arg1){
  }
  public void focusCurrentTab(int arg1){
  }
  public void setLeftStripDrawable(android.graphics.drawable.Drawable arg1){
  }
  public void setLeftStripDrawable(int arg1){
  }
  public void setRightStripDrawable(android.graphics.drawable.Drawable arg1){
  }
  public void setRightStripDrawable(int arg1){
  }
  public boolean isStripEnabled(){
    return false;
  }
}
