package com.example.extractor;

import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

public class GooglePrincipalExtractor implements PrincipalExtractor {

	private static final String PRINCIPAL_KEY = "email";

	@Override
	public Object extractPrincipal(final Map<String, Object> map) {
		if (map.containsKey(PRINCIPAL_KEY)) {
			return map.get(PRINCIPAL_KEY);
		}
		return null;
	}

}
