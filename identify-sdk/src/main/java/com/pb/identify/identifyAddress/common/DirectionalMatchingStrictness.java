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
 * Enum to specify Specifies the algorithm to use when determining if an input address matches an address in the postal database.
 * 
 *
 */
public enum DirectionalMatchingStrictness {
	/**
	 * The input directionals, such as the "N" in 123 N Main St., must match the database exactly.
	 */
	E,
	/**
	 * The matching algorithm is "tight."
	 */
	T,
	/**
	 *The matching algorithm is "medium". Default.
	 */
	M,
	/**
	 *The matching algorithm is "loose."
	 */
	L
	
}