
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

package com.pb.identify.interfaces;

import android.content.Context;

import com.pb.identify.OAuth.BaseOAuthService;
import com.pb.identify.OAuth.BaseOAuthServiceImpl;
import com.pb.identify.OAuth.OAuthFactory;
import com.pb.identify.OAuth.OAuthService;
import com.pb.identify.identifyAddress.IdentifyAddressService;
import com.pb.identify.identifyAddress.IdentifyAddressServiceImpl;
import com.pb.identify.identifyEmail.IdentifyEmailService;
import com.pb.identify.identifyEmail.IdentifyEmailServiceImpl;
import com.pb.identify.identifyEntity.IdentifyEntityService;
import com.pb.identify.identifyEntity.IdentifyEntityServiceImpl;
import com.pb.identify.identifyRisk.IdentifyRiskService;
import com.pb.identify.identifyRisk.IdentifyRiskServiceImpl;
import com.pb.identify.utils.Log;

/**
 * IdentifyServiceManager class is responsible for providing entry point all IDENTIFY specific
 * interfaces.It provides singleton object for this class
 * 
 *
 */
public class IdentifyServiceManager {

	private static IdentifyServiceManager _IdentifyServiceManager = null;

	private IdentifyServiceManager() {

	}
	
	/**
	 * @param context Activity Context
	 * @param baseOAuthService Basic OAuth Service
	 * @return {@link IdentifyServiceManager}
	 */
	public static final IdentifyServiceManager getInstance(Context context, BaseOAuthService baseOAuthService) {
		if (_IdentifyServiceManager == null) {
			 OAuthFactory.setInstance(baseOAuthService);
			_IdentifyServiceManager = new IdentifyServiceManager();
			Log.d("IDENTIFY Service instance has been created");
		}
		Log.d("IDENTIFY Service instance has been already created");
		return _IdentifyServiceManager;
	}
	
	/**
	 * Method to initialize IDENTIFY interfaces with user login credentials.
	 * @param context Activiy context
	 * @param consumerKey Identify API user key
	 * @param consumerSecretKey Identify API secret key
	 * @return {@link IdentifyServiceManager}
	 */
	public static final IdentifyServiceManager getInstance(Context context, String consumerKey, String consumerSecretKey ) {
		if (_IdentifyServiceManager == null) {
			 OAuthFactory.setInstance(new BaseOAuthServiceImpl(consumerKey, consumerSecretKey));
			_IdentifyServiceManager = new IdentifyServiceManager();
			Log.d("IDENTIFY Service instance has been created");
		}
		Log.d("IDENTIFY Service instance has been already created");
		return _IdentifyServiceManager;

	}
	
	/**
	 * Method to initialize IDENTIFY services with a user supplied token.
	 * @param context Activiy context
	 * @param token Oauth token generated
	 * @return {@link IdentifyServiceManager}
	 */
	public static final IdentifyServiceManager getInstance(Context context, String token) {
		if (_IdentifyServiceManager == null) {
			 OAuthFactory.setInstance(new BaseOAuthServiceImpl(token));
			_IdentifyServiceManager = new IdentifyServiceManager();
			Log.d("IDENTIFY Service instance has been created");
		}
		Log.d("IDENTIFY Service instance has been already created");
		return _IdentifyServiceManager;

	}

	/**
	 * OAuth Service APIs Handler
	 * 
	 * @return an instance of BaseOAuthService
	 */
	public BaseOAuthService getBaseAuthService() {
		return new OAuthService();
	}

	public IdentifyAddressService getIdentifyAddressService(){
		return  new IdentifyAddressServiceImpl();
	}

	public IdentifyRiskService getIdentifyRiskService(){
		return  new IdentifyRiskServiceImpl();
	}

	public IdentifyEmailService getIdentifyEmailService() { return new IdentifyEmailServiceImpl(); }

	public IdentifyEntityService getIdentifyEntityService() { return new IdentifyEntityServiceImpl(); }
	/**
	 * To invalidate the IDENTIFY static reference
	 */
	public void invalidateLIServiceManagerInstance() {
		if (_IdentifyServiceManager != null) {
			_IdentifyServiceManager = null;
		
			Log.d("IDENTIFY instance has been invalidated");

		}

	}

}
