package com.project.zuul.Zuulgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class SimpleFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		
		
		return false;
	}

	@Override
	public Object run() throws ZuulException {
		
		return null;
	}

	@Override
	public String filterType() {
		
		return null;
	}

	@Override
	public int filterOrder() {
		
		return 0;
	}

}
