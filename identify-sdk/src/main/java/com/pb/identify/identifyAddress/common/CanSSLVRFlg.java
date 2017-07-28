/*******************************************************************************
 * Copyright 2016 Pitney Bowes Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 *  See the License for the specific language governing permissions and limitations under the License.
 *******************************************************************************/
package com.pb.identify.identifyAddress.common;

/**
 * 
 * Enum to change the civic and/or suite information to match the Large Volume Receiver (LVR) or single-single record (used when there is only one record for that postal code/street name/street type).
 * 
 *
 */
public enum CanSSLVRFlg {
	/**
	 * Do not change the civic and/or suite information to match the LVR or single-single record. 
	 */
	N,
	/**
	 * Change the civic and/or suite information to match the LVR or single-single record.
	 */
	Y
}