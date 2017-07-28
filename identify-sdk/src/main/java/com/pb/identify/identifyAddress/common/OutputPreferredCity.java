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
 * Enum to Specify whether the preferred last line city name should be stored.
 * 
 *
 */
public enum OutputPreferredCity {
	/**
	 * Store the Preferred Last Line City Name from the USPS ZIP+4 File (Override City Name).
	 */
	Z,
	/**
	 * Store the USPS-preferred City Name from USPS City/State File.
	 */
	C,
	/**
	 *Store the Primary City Name from the USPS City/State File.
	 */
	P
}