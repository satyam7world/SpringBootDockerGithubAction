package com.github.satyam7world.springbootdockergithubaction.controller

import com.github.satyam7world.springbootdockergithubaction.data.Body
import com.github.satyam7world.springbootdockergithubaction.data.Body2
import com.github.satyam7world.springbootdockergithubaction.data.RootResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random


@RestController
@RequestMapping("/")
class MainController {

    @GetMapping("/")
    fun getRootPath(): ResponseEntity<RootResponse> {
        return if (Random.nextBoolean()) {
            ResponseEntity.ok(
                RootResponse.RootResponseEntity(
                    success = true, body = Body(
                        Random.nextInt()
                    )
                )
            )
        } else {
            ResponseEntity.ok(
                RootResponse.RootResponseSecond(
                    success = true, body = Body2(
                        Random.nextInt(),
                        Random.nextInt(),
                    )
                )
            )
        }
    }
}