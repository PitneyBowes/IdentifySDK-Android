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
 * Enum to specify how to format city names that have short city name or non-mailing city name alternatives.
 * 
 */
public enum OutputShortCityName {

	/**
	 * Returns the USPS-approved abbreviation for the city, if there is one.
	 */
	Y,
	/**
	 * Returns the long city name (default).
	 */
	N,
	/**
	 * Returns the abbreviated city name only if an abbreviated city name is used in the input address. If the input address does not use a short city name, either the long or short city name could be returned.
	 */
	S,
	/**
	 * Output the non-mailing city name (the vanity name) if the input city name is a non-mailing city name.
	 */
	V
}
