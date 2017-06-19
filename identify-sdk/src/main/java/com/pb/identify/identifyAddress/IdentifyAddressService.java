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

package com.pb.identify.identifyAddress;

import android.content.Context;

import java.util.List;

import com.pb.identify.identifyAddress.validateMailingAddress.model.ValidateMailingAddressAPIResponseList;
import com.pb.identify.identifyAddress.validateMailingAddressPro.model.ValidateMailingAddressProAPIResponseList;
import com.pb.identify.identifyAddress.validateMailingAddressPremium.model.ValidateMailingAddressPremiumAPIResponseList;
import com.pb.identify.identifyAddress.getCityStateProvince.model.GetCityStateProvinceAPIResponseList;
import com.pb.identify.identifyAddress.getPostalCodes.model.GetPostalCodesAPIResponseList;
import com.pb.identify.interfaces.RequestObserver;

public interface IdentifyAddressService {
	

	/**
	 * Validate and format the batch of input addresses and fills the missing details asynchronously
	 *
	 * @param context Activity context
	 * @param addresses List of addresses to validate
	 * @param options List of options
	 * @param requestObserver request observer to delegate success, failure methods
	 */
	public void validateMailingAddress(Context context, List<com.pb.identify.identifyAddress.validateMailingAddress.model.Address> addresses, com.pb.identify.identifyAddress.validateMailingAddress.model.Options options,
									   RequestObserver<ValidateMailingAddressAPIResponseList> requestObserver);

	/**
	 * Validate and format the batch of input addresses and fills the missing details asynchronously for ValidateMailingAddressPro
	 *
	 * @param context Activity context
	 * @param addresses List of addresses to validate
	 * @param options List of options
	 * @param requestObserver request observer to delegate success, failure methods
	 */
	public void validateMailingAddressPro(Context context, List<com.pb.identify.identifyAddress.validateMailingAddressPro.model.Address> addresses, com.pb.identify.identifyAddress.validateMailingAddressPro.model.Options options,
										  RequestObserver<ValidateMailingAddressProAPIResponseList> requestObserver);

	/**
	 * Validate and format the batch of input addresses and fills the missing details asynchronously for ValidateMailingAddressPremium
	 *
	 * @param context Activity context
	 * @param addresses List of addresses to validate
	 * @param options List of options
	 * @param requestObserver request observer to delegate success, failure methods
	 */
	public void validateMailingAddressPremium(Context context, List<com.pb.identify.identifyAddress.validateMailingAddressPremium.model.Address> addresses, com.pb.identify.identifyAddress.validateMailingAddressPremium.model.Options options,
										  RequestObserver<ValidateMailingAddressPremiumAPIResponseList> requestObserver);

	/**
	 * Return city and state/province for the input postal code records asynchronously for GetCityStateProvince
	 *
	 * @param context Activity context
	 * @param records List of records to validate
	 * @param options List of options
	 * @param requestObserver request observer to delegate success, failure methods
	 */
	public void getCityStateProvince(Context context, List<com.pb.identify.identifyAddress.getCityStateProvince.model.Record> records, com.pb.identify.identifyAddress.getCityStateProvince.model.Options options,
											  RequestObserver<GetCityStateProvinceAPIResponseList> requestObserver);

	/**
	 * Return postal codes for a given city and state/province asynchronously.
	 *
	 * @param records List of records to retrieve postal codes
	 * @param options List of options
	 * @param requestObserver Observer interface for request

	 */
	public void getPostalCodes(Context context, List<com.pb.identify.identifyAddress.getPostalCodes.model.Record> records, com.pb.identify.identifyAddress.getPostalCodes.model.Options options,
									RequestObserver<GetPostalCodesAPIResponseList> requestObserver);

}