/*
 *  Copyright 2018 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.classlib.impl;

import org.teavm.backend.javascript.spi.MethodContributor;
import org.teavm.backend.javascript.spi.MethodContributorContext;
import org.teavm.model.ClassReader;
import org.teavm.model.MethodReference;
import org.teavm.platform.PlatformAnnotationProvider;

public class AnnotationVirtualMethods implements MethodContributor {
    @Override
    public boolean isContributing(MethodContributorContext context, MethodReference methodRef) {
        ClassReader cls = context.getClassSource().get(methodRef.getClassName());
        if (cls == null || !cls.getInterfaces().contains(PlatformAnnotationProvider.class.getName())) {
            return false;
        }
        return methodRef.getName().equals("getAnnotations");
    }
}
