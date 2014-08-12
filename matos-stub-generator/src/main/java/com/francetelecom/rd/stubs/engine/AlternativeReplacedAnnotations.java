package com.francetelecom.rd.stubs.engine;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2008 - 2014 Orange SA
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

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Alternative annotations where we use the annotations of the alternative element if they
 * exist.
 * @author Pierre Cregut
 *
 */
public class AlternativeReplacedAnnotations implements AlternativeAnnotations {
	final AlternativeImplementation altImplem;
	
	/**
	 * Builds an annotation replacer from a loaded alternative implementations of methods.s
	 * @param altImplem
	 */
	public AlternativeReplacedAnnotations(AlternativeImplementation altImplem) {
		this.altImplem = altImplem;
	}
	
	@Override
	public Annotation [] getDeclaredAnnotations(Method m) {
		if (altImplem == null) return m.getDeclaredAnnotations();
		else {
			Method altM = altImplem.findEquivalent(m);
			if (altM == null) {
				return m.getDeclaredAnnotations();
			}
			else return altM.getDeclaredAnnotations();
		}
	}

	@Override
	public Annotation [][] getParameterAnnotations(Method m) {
		if (altImplem == null) return m.getParameterAnnotations();
		else {
			Method altM = altImplem.findEquivalent(m);
			if (altM == null) {
				return m.getParameterAnnotations();
			}
			else return altM.getParameterAnnotations();
		}
	}

	@Override
	public Annotation [] getDeclaredAnnotations(Class<?> c) {
		if (altImplem == null) return c.getDeclaredAnnotations();
		else {
			Class<?> altC = altImplem.findEquivalent(c);
			if (altC == null) return c.getDeclaredAnnotations();
			else return altC.getDeclaredAnnotations();
		}
	}

	@Override
	public Annotation [] getDeclaredAnnotations(Constructor<?> c) {
		if (altImplem == null) return c.getDeclaredAnnotations();
		else {
			Constructor<?> altC = altImplem.findEquivalent(c);
			if (altC == null) return c.getDeclaredAnnotations();
			else return altC.getDeclaredAnnotations();
		}
	}

	@Override
	public Annotation [][] getParameterAnnotations(Constructor<?> c) {
		if (altImplem == null) return c.getParameterAnnotations();
		else {
			Constructor<?> altC = altImplem.findEquivalent(c);
			if (altC == null) return c.getParameterAnnotations();
			else return altC.getParameterAnnotations();
		}
	}

	@Override
	public Annotation [] getDeclaredAnnotations(Field m) {
		if (altImplem == null) return m.getDeclaredAnnotations();
		else {
			Field altM = altImplem.findEquivalent(m);
			if (altM == null) return m.getDeclaredAnnotations();
			else return altM.getDeclaredAnnotations();
		}
	}

}
