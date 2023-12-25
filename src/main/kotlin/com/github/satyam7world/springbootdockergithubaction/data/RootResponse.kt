package com.github.satyam7world.springbootdockergithubaction.data


data class Body(
    val randomNumber: Int
)

data class Body2(
    val randomNumber1: Int,
    val randomNumber2: Int,
)


sealed class RootResponse {
    data class RootResponseEntity(
        val success: Boolean,
        val body: Body
    ) : RootResponse()

    data class RootResponseSecond(
        val success: Boolean,
        val responseType: String = "Response Type 2",
        val body: Body2
    ) : RootResponse()

}