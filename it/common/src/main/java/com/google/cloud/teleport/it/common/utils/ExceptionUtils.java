/*
 * Copyright (C) 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.cloud.teleport.it.common.utils;

/** Utility class for handling exceptions in tests or resource managers. */
public class ExceptionUtils {

  /**
   * Utility to check if the given exception or any of its causes contain a specific message.
   *
   * @param exception Exception to check.
   * @param message Message to search for.
   * @return true if the message is found in the exception or any of the causes, false otherwise.
   */
  public static boolean containsMessage(Throwable exception, String message) {
    if (exception == null) {
      return false;
    }

    if (exception.getMessage() != null && exception.getMessage().contains(message)) {
      return true;
    }

    return containsMessage(exception.getCause(), message);
  }
}
