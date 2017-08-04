/*
 Copyright 2013 Microsoft Open Technologies, Inc.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.microsoftopentechnologies.windowsazurestorage.exceptions;

public class WAStorageException extends Exception {

    private static final long serialVersionUID = 1582215285822395979L;

    public WAStorageException() {
        super();
    }

    public WAStorageException(String message, Throwable cause) {
        super(message, cause);
    }

    public WAStorageException(String message) {
        super(message);
    }
}
