package com.justindoehling.springconfigprops

import com.justindoehling.springconfigprops.lib.config.LibConfigurationProperties
import com.justindoehling.springconfigprops.props.DemoConfigProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringConfigPropsApplication : ApplicationRunner {

	@Autowired
	lateinit var settings: DemoConfigProperties

	@Autowired
	lateinit var libSettings: LibConfigurationProperties

	override fun run(args: ApplicationArguments?) {
		println("${settings.setting1} ${settings.setting2}")

		println("Library Properties loaded: ${libSettings.setting1.isNotBlank()}")
	}
}

fun main(args: Array<String>) {
	runApplication<SpringConfigPropsApplication>(*args)
}
