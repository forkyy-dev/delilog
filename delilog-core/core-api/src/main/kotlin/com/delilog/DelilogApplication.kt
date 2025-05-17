package com.delilog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.delilog"])
class DelilogApplication

fun main(args: Array<String>) {
	runApplication<DelilogApplication>(*args)
}
