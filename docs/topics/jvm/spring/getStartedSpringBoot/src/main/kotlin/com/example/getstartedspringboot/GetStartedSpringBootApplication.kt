package com.example.getstartedspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class GetStartedSpringBootApplication

fun main(args: Array<String>) {
	runApplication<GetStartedSpringBootApplication>(*args)
	// *args	== vararg == variable # of String arguments
	// *		spread operator
}

@RestController
class MessageController {
	@GetMapping("/")
	fun index(@RequestParam("name") name: String) = "Hello, $name!"	// $name	String template
	// single expression function
	// returnType omitted -> typer inference by Kotlin
}
