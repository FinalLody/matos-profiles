package android.accounts;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.AccountManagerFutureImpl", superClass = "")
public interface AccountManagerFuture<V>
{
  // Methods

  public boolean cancel(boolean arg1);
  public boolean isDone();
  public boolean isCancelled();
  public V getResult() throws OperationCanceledException, java.io.IOException, AuthenticatorException;
  public V getResult(long arg1, java.util.concurrent.TimeUnit arg2) throws OperationCanceledException, java.io.IOException, AuthenticatorException;
}
