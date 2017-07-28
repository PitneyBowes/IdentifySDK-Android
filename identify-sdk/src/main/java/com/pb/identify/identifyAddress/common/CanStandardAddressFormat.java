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
 * Enum to specify where to place secondary address information in the output address. Secondary address information refers to apartment numbers, suite numbers, and similar designators.
 * 
 *
 */
public enum CanStandardAddressFormat {
	/**
	 * Place apartment information in the location specified in the. Default.
	 */
	D,
	/**
	 * Place apartment information at the at the end of the AddressLine1 field.
	 */
	B,
	/**
	 *Place the apartment number only (no label) at the beginning of the AddressLine1 field. For example, 400-123 Rue Main
	 */
	F,
	/**
	 *Place the apartment number and label at the beginning of the AddressLine1 field. For example, Apt 400 123 Rue Main
	 */
	E,
	/**
	 *Place apartment information in the same location as the input address.
	 */
	I,
	/**
	 *Place apartment information on a separate line.
	 */	
	S
}