package com.justindoehling.springconfigprops

import com.justindoehling.springconfigprops.props.DemoConfigProperties
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Profile
import org.springframework.test.context.junit4.SpringRunner

/**
 * Runs only when Spring Profile is set to: local
 * environment SPRING_PROFILES_ACTIVE
 */
@RunWith(SpringRunner::class)
@SpringBootTest
@Profile("local")
class LocalOnlySpringConfigPropsApplicationTests {

	@Autowired
	lateinit var settings: DemoConfigProperties

	@Test
	fun contextLoads() {
		assertThat(settings.setting1).isNotNull()
		assertThat(settings.setting2).isNotNull()
		assertThat(settings.setting2).isEqualTo("Justin")
	}
}
