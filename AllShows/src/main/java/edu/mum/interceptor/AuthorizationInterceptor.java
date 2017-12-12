package edu.mum.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.utils.UrlUtils;

public class AuthorizationInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		boolean hasAdminRole = authentication.getAuthorities().stream()
				.anyMatch(r -> r.getAuthority().equals("ADMIN"));
		if(!hasAdminRole) {
			throw new AccessDeniedException(UrlUtils.getFullURL(request));
		}
		
		return true;
	}

}
