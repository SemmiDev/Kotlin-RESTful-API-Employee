package com.sammidev.auth

import com.sammidev.error.UnauthorizedException
import com.sammidev.repository.ApiKeyRepository
import org.springframework.stereotype.Component
import org.springframework.ui.ModelMap
import org.springframework.web.context.request.WebRequest
import org.springframework.web.context.request.WebRequestInterceptor

@Component
class ApiKeyInterceptor(val apixkeyRepository: ApiKeyRepository): WebRequestInterceptor {
    override fun preHandle(request: WebRequest) {
        val apiKey = request.getHeader("X-Api-Key") ?: throw UnauthorizedException()
        if (!apixkeyRepository.existsById(apiKey)) {
            throw UnauthorizedException()
        }
        // VALID
    }

    override fun postHandle(p0: WebRequest, p1: ModelMap?) {}

    override fun afterCompletion(p0: WebRequest, p1: java.lang.Exception?) {}

}