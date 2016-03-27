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

package ru.touchin.roboswag.core.data.storable.exceptions;

import android.support.annotation.NonNull;

/**
 * Created by Gavriil Sitnikov on 04/10/2015.
 * TODO: fill description
 */
public class ConversionException extends Exception {

    public ConversionException(@NonNull final String message) {
        super(message);
    }

    public ConversionException(@NonNull final String message, @NonNull final Throwable throwable) {
        super(message, throwable);
    }

}