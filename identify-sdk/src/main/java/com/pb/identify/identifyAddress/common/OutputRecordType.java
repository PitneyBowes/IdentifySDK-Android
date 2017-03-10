/*
 * ******************************************************************************
 *  *  Copyright 2016 Pitney Bowes Inc
 *  *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 *  *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *   See the License for the specific language governing permissions and limitations under the License.
 *  ******************************************************************************
 */

package com.pb.identify.identifyAddress.common;

/**
 *
 * Enum to set output record type options for response
 *
 *
 */
public enum OutputRecordType {
    /**
     * Returns 1 to 4 lines of address data plus city, state, postal code, firm name
     * and urbanization name information. (default)
     */
    A,
    /**
     * Parsed address elements. Each part of the address, such as house number,
     * street name, street suffix, directional, and so on is returned in a separate field.
     */
    E,
    /**
     * Parsed input. This option returns the input address in parsed form regardless of whether the address is validated.
     * Each part of the input address, such as house number, street name, street suffix, directional,
     * and so on is returned in a separate field.
     */
    I
}
