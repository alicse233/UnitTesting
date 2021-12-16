package com.example.unittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty name return false`() {
        val result = RegistrationUtil.validateRegistration(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`() {
        val result = RegistrationUtil.validateRegistration(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty confirm password return false`() {
        val result = RegistrationUtil.validateRegistration(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password mismatch confirm password return false`() {
        val result = RegistrationUtil.validateRegistration(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid user name and password return true`() {
        val result = RegistrationUtil.validateRegistration(
            "Abc",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }
}