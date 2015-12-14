/*
 *  Copyright (c) 2015 RoboSwag (Gavriil Sitnikov, Vsevolod Ivanov)
 *
 *  This file is part of RoboSwag library.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.roboswag.core.utils;

import android.support.annotation.NonNull;

public class ShouldNotHappenException extends RuntimeException {

    public ShouldNotHappenException() {
        super();
    }

    public ShouldNotHappenException(@NonNull final String detailMessage) {
        super(detailMessage);
    }

    public ShouldNotHappenException(@NonNull final String detailMessage, @NonNull final Throwable throwable) {
        super(detailMessage, throwable);
    }

    public ShouldNotHappenException(@NonNull final Throwable throwable) {
        super(throwable);
    }

}