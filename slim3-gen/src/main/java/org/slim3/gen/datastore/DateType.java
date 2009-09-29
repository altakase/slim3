/*
 * Copyright 2004-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.slim3.gen.datastore;

import java.util.Date;

import org.slim3.gen.ClassConstants;

/**
 * Represents {@link DateType} type.
 * 
 * @author taedium
 * @since 3.0
 * 
 */
public class DateType extends CoreReferenceType {

    /**
     * Creates a new {@link Date}.
     */
    public DateType() {
        super(ClassConstants.Date);
    }

    @Override
    public <R, P, TH extends Throwable> R accept(
            DataTypeVisitor<R, P, TH> visitor, P p) throws TH {
        return visitor.visitDateType(this, p);
    }

}
