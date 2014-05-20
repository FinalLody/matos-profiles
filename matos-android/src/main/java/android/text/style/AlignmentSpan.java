package android.text.style;

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
public interface AlignmentSpan
  extends ParagraphStyle
{
  // Classes

  public static class Standard
    implements AlignmentSpan, android.text.ParcelableSpan
  {
    // Constructors

    public Standard(android.text.Layout.Alignment arg1){
    }
    public Standard(android.os.Parcel arg1){
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public int getSpanTypeId(){
      return 0;
    }
    public android.text.Layout.Alignment getAlignment(){
      return (android.text.Layout.Alignment) null;
    }
  }
  // Methods

  public android.text.Layout.Alignment getAlignment();
}