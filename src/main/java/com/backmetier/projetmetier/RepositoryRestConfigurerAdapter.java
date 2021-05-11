package com.backmetier.projetmetier;

import java.util.List;

import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Convenience adapter for {@link RepositoryRestConfigurer} to allow selective override of configuration methods.
 *
 * @author Oliver Gierke
 * @since 2.4
 * @soundtrack Florian Reichelt & Max Ender - Abschlusskonzert (https://www.youtube.com/watch?v=5WP0P-ndinY)
 */
public class RepositoryRestConfigurerAdapter implements RepositoryRestConfigurer {

    /*
     * (non-Javadoc)
     * @see org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer#configureRepositoryRestConfiguration(org.springframework.data.rest.core.config.RepositoryRestConfiguration)
     */
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {}

    /*
     * (non-Javadoc)
     * @see org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer#configureConversionService(org.springframework.core.convert.support.ConfigurableConversionService)
     */
    @Override
    public void configureConversionService(ConfigurableConversionService conversionService) {}

    /*
     * (non-Javadoc)
     * @see org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer#configureValidatingRepositoryEventListener(org.springframework.data.rest.core.event.ValidatingRepositoryEventListener)
     */
    @Override
    public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {}

    /*
     * (non-Javadoc)
     * @see org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer#configureExceptionHandlerExceptionResolver(org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver)
     */
    @Override
    public void configureExceptionHandlerExceptionResolver(ExceptionHandlerExceptionResolver exceptionResolver) {}

    /*
     * (non-Javadoc)
     * @see org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer#configureHttpMessageConverters(java.util.List)
     */

    /*
     * (non-Javadoc)
     * @see org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer#configureJacksonObjectMapper(com.fasterxml.jackson.databind.ObjectMapper)
     */
    @Override
    public void configureJacksonObjectMapper(ObjectMapper objectMapper) {}
}