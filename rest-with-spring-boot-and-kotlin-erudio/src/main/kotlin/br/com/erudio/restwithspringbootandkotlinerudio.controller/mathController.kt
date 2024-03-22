package br.com.erudio.restwithspringbootandkotlinerudio.controller

import br.com.erudio.converters.NumberConveter
import br.com.erudio.math.SimpleMath
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import java.util.concurrent.atomic.AtomicLong
import kotlin.text.replace
import kotlin.text.toDouble
import br.com.erudio.restwithspringbootandkotlinerudio.exepition.UnsupportedMathOperationException
@RestController
class MathController {

    private val  math: SimpleMath = SimpleMath()

    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(@PathVariable(value = "numberOne" ) numberOne: String?,
            @PathVariable(value = "numberTwo" ) numberTwo: String?
    ):  Double{
        if(!NumberConveter.isNumeric(numberOne) || !NumberConveter.isNumeric(numberTwo)
                )throw UnsupportedMathOperationException("Please set a numeric value")
        return math.sum(NumberConveter.convertToDouble(numberOne), NumberConveter.convertToDouble(numberTwo))
    }
    @RequestMapping(value = ["/subtraction/{numberOne}/{numberTwo}"])
    fun subtraction(@PathVariable(value = "numberOne" ) numberOne: String?,
            @PathVariable(value = "numberTwo" ) numberTwo: String?
    ):  Double{
        if(!NumberConveter.isNumeric(numberOne) || !NumberConveter.isNumeric(numberTwo)
                )throw UnsupportedMathOperationException("Please set a numeric value")
        return math.subtraction(NumberConveter.convertToDouble(numberOne), NumberConveter.convertToDouble(numberTwo))
    }
    @RequestMapping(value = ["/multiplication/{numberOne}/{numberTwo}"])
    fun multiplication(@PathVariable(value = "numberOne" ) numberOne: String?,
            @PathVariable(value = "numberTwo" ) numberTwo: String?
    ):  Double{
        if(!NumberConveter.isNumeric(numberOne) || !NumberConveter.isNumeric(numberTwo)
                )throw UnsupportedMathOperationException("Please set a numeric value")
        return math.multiplication(NumberConveter.convertToDouble(numberOne), NumberConveter.convertToDouble(numberTwo))
    }
       @RequestMapping(value = ["/division/{numberOne}/{numberTwo}"])
    fun division(@PathVariable(value = "numberOne" ) numberOne: String?,
            @PathVariable(value = "numberTwo" ) numberTwo: String?
    ):  Double{
        if(!NumberConveter.isNumeric(numberOne) || !NumberConveter.isNumeric(numberTwo)
                )throw UnsupportedMathOperationException("Please set a numeric value")
        return math.division(NumberConveter.convertToDouble(numberOne), NumberConveter.convertToDouble(numberTwo))
    }
    @RequestMapping(value = ["/media/{numberOne}/{numberTwo}"])
    fun mean(@PathVariable(value = "numberOne" ) numberOne: String?,
            @PathVariable(value = "numberTwo" ) numberTwo: String?
    ):  Double{
        if(!NumberConveter.isNumeric(numberOne) || !NumberConveter.isNumeric(numberTwo)
        )throw UnsupportedMathOperationException("Please set a numeric value")
        return math.mean(NumberConveter.convertToDouble(numberOne), NumberConveter.convertToDouble(numberTwo))
    }
    @RequestMapping(value = ["/squereRoot/{number}"])
    fun squereRoot(@PathVariable(value = "number" ) number: String?,
    ):  Double{
        if(!NumberConveter.isNumeric(number)
        )throw UnsupportedMathOperationException("Please set a numeric value")
        return math.squereRoot(NumberConveter.convertToDouble(number))
    }

}