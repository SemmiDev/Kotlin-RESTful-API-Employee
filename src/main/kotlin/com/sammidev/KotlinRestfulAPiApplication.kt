package com.sammidev

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinRestfulAPiApplication

fun main(args: Array<String>) {
	runApplication<KotlinRestfulAPiApplication>(*args)
}