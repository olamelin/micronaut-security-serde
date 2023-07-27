package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest

@MicronautTest
class JsonTest(@Client("/") val client: HttpClient) : StringSpec({


    "response should be sent" {
        val resp: String = client.toBlocking().retrieve("/my-controller")

        resp shouldBe """{"aproperty":"Hello World"}"""
    }
})
