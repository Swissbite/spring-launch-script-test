package net.daester.springlaunchscripttest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringLaunchScriptTestApplication(val config: Config) {
	init {
	    println(config.testingString)
	}
}

fun main(args: Array<String>) {
	runApplication<SpringLaunchScriptTestApplication>(*args)
}
