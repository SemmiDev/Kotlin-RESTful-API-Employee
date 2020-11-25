package com.sammidev.config

import com.sammidev.entity.ApiKey
import com.sammidev.repository.ApiKeyRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApiKeySeeder(val apikeyRepository: ApiKeyRepository) : ApplicationRunner {
    val apiKey = "SECRET"
    override fun run(args: ApplicationArguments?) {
        if	(!apikeyRepository.existsById(apiKey)) {
            val entity = ApiKey(id = apiKey)
            apikeyRepository.save(entity)
        }
    }
}