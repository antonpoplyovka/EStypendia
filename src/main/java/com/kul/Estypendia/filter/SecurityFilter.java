package com.kul.Estypendia.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Component
@Order(3)
public class SecurityFilter implements Filter {

    List<String> adminSecuredEndpoints = Arrays.asList("","","");
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
//    api/v1/address
//    api/v1/paymentsLog
//    api/v1/report
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request= (HttpServletRequest) servletRequest;
String s = request.getRequestURI();
        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {

    }
}
