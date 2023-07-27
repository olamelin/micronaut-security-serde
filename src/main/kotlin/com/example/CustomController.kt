package com.example

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Produces
import java.util.*

@Controller("/my-controller")
@Produces(MediaType.APPLICATION_JSON)
class CustomController {

    @Get("/")
    fun get(): HttpResponse<CustomResponse> {
        return HttpResponse.status<CustomResponse>(HttpStatus.OK).body(CustomResponse("Hello World"))
    }
}
