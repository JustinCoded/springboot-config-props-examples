package com.justindoehling.springconfigprops.lib.config

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = [LibConfigurationProperties::class])
@ContextConfiguration(initializers = [ConfigFileApplicationContextInitializer::class])
@EnableConfigurationProperties
class LibConfigurationPropertiesTest {

    @Autowired
    lateinit var settings: LibConfigurationProperties

    @Test
    fun getSetting1() {
        assertThat(settings.setting1).isEqualTo("lib1")
    }
}