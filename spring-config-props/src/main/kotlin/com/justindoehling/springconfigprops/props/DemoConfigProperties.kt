package com.justindoehling.springconfigprops.props

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("demo-config")
class DemoConfigProperties {
    lateinit var setting1: String
    lateinit var setting2: String
}