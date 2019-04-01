package com.justindoehling.springconfigprops.lib.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("demo-config-lib")
@PropertySource("lib.properties")
class LibConfigurationProperties {
    lateinit var setting1: String
    lateinit var setting2: String
}