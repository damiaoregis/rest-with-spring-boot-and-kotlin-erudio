package br.com.erudio.restwithspringbootandkotlinerudio.exepition
import java.util.Date

class ExceptionResponse(
        val timestamp: Date,
        var message: String?,
        var details: String
)