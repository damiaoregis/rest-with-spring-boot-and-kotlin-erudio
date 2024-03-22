package br.com.erudio.restwithspringbootandkotlinerudio.exepition

import java.lang.*
import kotlin.RuntimeException

class UnsupportedMathOperationException(exception: String?): RuntimeException(exception)
