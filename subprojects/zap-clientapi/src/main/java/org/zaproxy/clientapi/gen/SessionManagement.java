/* Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2016 the ZAP development team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.zaproxy.clientapi.gen;

import java.util.HashMap;
import java.util.Map;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;


/**
 * This file was automatically generated.
 */
public class SessionManagement {

	private ClientApi api = null;

	public SessionManagement(ClientApi api) {
		this.api = api;
	}

	public ApiResponse getSupportedSessionManagementMethods() throws ClientApiException {
		Map<String, String> map = null;
		return api.callApi("sessionManagement", "view", "getSupportedSessionManagementMethods", map);
	}

	public ApiResponse getSessionManagementMethodConfigParams(String methodname) throws ClientApiException {
		Map<String, String> map = null;
		map = new HashMap<String, String>();
		map.put("methodName", methodname);
		return api.callApi("sessionManagement", "view", "getSessionManagementMethodConfigParams", map);
	}

	public ApiResponse getSessionManagementMethod(String contextid) throws ClientApiException {
		Map<String, String> map = null;
		map = new HashMap<String, String>();
		map.put("contextId", contextid);
		return api.callApi("sessionManagement", "view", "getSessionManagementMethod", map);
	}

	public ApiResponse setSessionManagementMethod(String apikey, String contextid, String methodname, String methodconfigparams) throws ClientApiException {
		Map<String, String> map = null;
		map = new HashMap<String, String>();
		if (apikey != null) {
			map.put("apikey", apikey);
		}
		map.put("contextId", contextid);
		map.put("methodName", methodname);
		if (methodconfigparams != null) {
			map.put("methodConfigParams", methodconfigparams);
		}
		return api.callApi("sessionManagement", "action", "setSessionManagementMethod", map);
	}

}
