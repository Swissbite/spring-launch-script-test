package net.daester.springlaunchscripttest

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "launch-test")
class Config {
    lateinit var testingString: String
}