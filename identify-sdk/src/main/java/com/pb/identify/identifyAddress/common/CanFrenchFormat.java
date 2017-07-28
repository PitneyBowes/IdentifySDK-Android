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
 * Enum to Specify how to determine the language (English or French) to use to format the address and directional. 
 * 
 *
 */
public enum CanFrenchFormat {
	/**
	 * Use the street suffix returned by the matching process to determine the language.
	 */
	C,
	/**
	 * Use the Canadian database to determine the language. 
	 */
	S,
	/**
	 *Use the CanLanguage input field to determine the language.
	 */
	T
}