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
public class ActivityChooserView
  extends android.view.ViewGroup  implements ActivityChooserModel.ActivityChooserModelClient
{
  // Constructors
	
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActivityChooserView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActivityChooserView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActivityChooserView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDetachedFromWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void setOnDismissListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onDismiss") PopupWindow.OnDismissListener arg1){
  }
  public void setActivityChooserModel(ActivityChooserModel arg1){
  }
  public void setExpandActivityOverflowButtonDrawable(android.graphics.drawable.Drawable arg1){
  }
  public void setExpandActivityOverflowButtonContentDescription(int arg1){
  }
  public void setProvider(android.view.ActionProvider arg1){
  }
  public boolean showPopup(){
    return false;
  }
  public boolean dismissPopup(){
    return false;
  }
  public boolean isShowingPopup(){
    return false;
  }
  public ActivityChooserModel getDataModel(){
    return (ActivityChooserModel) null;
  }
  public void setInitialActivityCount(int arg1){
  }
  public void setDefaultActionButtonContentDescription(int arg1){
  }
}
