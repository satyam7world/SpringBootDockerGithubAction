package com.github.satyam7world.springbootdockergithubaction.controller

/*
import jakarta.servlet.http.HttpServletRequest
import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

@RestController
class ErrorHandlerController  : ErrorController {

    @RequestMapping("/error")
    fun errorSend(request: HttpServletRequest, exception: Exception): ResponseEntity<ErrorResponse> {
        return ResponseEntity(ErrorResponse(*/
/*message = exception.message.toString()*//*
), HttpStatus.NO_CONTENT)
    }

    data class ErrorResponse(
        val success: Boolean = false,
        val message: String = "Not Supplied",
        val time: String = SimpleDateFormat("EEE, MMM d, yyyy HH:mm:ss").format(Date(System.currentTimeMillis() + TimeUnit.MILLISECONDS.convert(4, TimeUnit.HOURS)))
    )
}*/
