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
 * Enum to specify whether to use the long, medium, or short version of the city if the city has a long name.
 * 
 *
 */
public enum CanOutputCityFormat {
	/**
	 * Use the default option specified by the OutputShortCityName option. Default.
	 */
	D,
	/**
	 * Output short city name.
	 */
	S,
	/**
	 *Output the long city name.
	 */
	L,
	/**
	 *Output the medium city name.
	 */
	M,
	/**
	 *Use the same city format as used in the input address. Output is L, M, or S.
	 */
	I
}