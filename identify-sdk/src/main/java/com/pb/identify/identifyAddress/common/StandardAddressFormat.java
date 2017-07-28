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
 * Enum to specify where to place secondary address information for U.S. addresses.
 * 
 */
public enum StandardAddressFormat {

	/**
	 * Place both primary and secondary address information in AddressLine1 (default).
	 */
	C,
	/**
	 * Place the primary address information in AddressLine1 and the secondary address information in AddressLine2.
	 */
	S,
	/**
	 * Place both primary and secondary address information in AddressLine1 and place dropped information from dual addresses in AddressLine2.
	 */
	D
}
