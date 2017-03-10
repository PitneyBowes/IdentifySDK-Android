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

package com.pb.identify.identifyEmail.validateEmailAddress.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.pb.identify.common.model.UserField;

/**
 * This class represents a single matched record in the response from ValidateEmailAddress API
 *
 */
public class ValidateEmailAddressAPIResponse {

	@SerializedName(value="COMMENT")
	private String comment;
	@SerializedName(value="COMMENT_CODE")
	private String commentCode;
	@SerializedName(value="EMAIL")
	private String email;
	@SerializedName(value="ERROR")
	private String error;
	@SerializedName(value="ERROR_RESPONSE")
	private String errorResponse;
	@SerializedName(value="FINDING")
	private String finding;
	@SerializedName(value="SUGG_COMMENT")
	private String suggComment;
	@SerializedName(value="SUGG_EMAIL")
	private String suggEmail;
	private List<UserField> user_fields;
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCommentCode() {
		return commentCode;
	}
	public void setCommentCode(String commentCode) {
		this.commentCode = commentCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getErrorResponse() {
		return errorResponse;
	}
	public void setErrorResponse(String errorResponse) {
		this.errorResponse = errorResponse;
	}
	public String getFinding() {
		return finding;
	}
	public void setFinding(String finding) {
		this.finding = finding;
	}
	public String getSuggComment() {
		return suggComment;
	}
	public void setSuggComment(String suggComment) {
		this.suggComment = suggComment;
	}
	public String getSuggEmail() {
		return suggEmail;
	}
	public void setSuggEmail(String suggEmail) {
		this.suggEmail = suggEmail;
	}
	public List<UserField> getUser_fields() {
		return user_fields;
	}
	public void setUser_fields(List<UserField> user_fields) {
		this.user_fields = user_fields;
	}
	
}
